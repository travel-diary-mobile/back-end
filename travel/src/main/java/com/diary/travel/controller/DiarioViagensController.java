package com.diary.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.diary.travel.dto.DiarioViagensDTO;
import com.diary.travel.entity.Atividades;
import com.diary.travel.entity.DiarioViagens;
import com.diary.travel.service.DiarioViagensService;

@RestController
@RequestMapping("/diario-viagens")
public class DiarioViagensController {

    @Autowired
    private DiarioViagensService diarioViagensService;

    @PostMapping("/salvar")
    public ResponseEntity<DiarioViagens> salvarDiarioViagem(
            @RequestParam("descricao") String descricao,
            @RequestParam("titulo") String titulo,
            @RequestParam("destino") String destino,
            @RequestParam("dataViagem") int dataViagem,
            @RequestParam("atividades") Atividades atividades,
            @RequestParam(value = "imagem64", required = false) MultipartFile imagem64) {
        try {
            DiarioViagensDTO diarioViagensDTO = new DiarioViagensDTO();
            diarioViagensDTO.setDescricao(descricao);
            diarioViagensDTO.setTitulo(titulo);
            diarioViagensDTO.setDestino(destino);
            diarioViagensDTO.setDataViagem(dataViagem);
            diarioViagensDTO.setAtividades(atividades);
            diarioViagensDTO.setImagem64(imagem64);

            DiarioViagens diarioViagem = diarioViagensService.salvar(diarioViagensDTO);
            return ResponseEntity.ok(diarioViagem);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<DiarioViagens>> listarDiarios() {
        return ResponseEntity.ok(diarioViagensService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiarioViagens> buscarDiarioPorId(@PathVariable Long id) {
        return ResponseEntity.ok(diarioViagensService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDiarioViagem(@PathVariable Long id) {
        diarioViagensService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DiarioViagens> atualizarDiarioViagem(
            @PathVariable Long id, @ModelAttribute DiarioViagensDTO diarioViagensDTO) {
        return ResponseEntity.ok(diarioViagensService.atualizar(id, diarioViagensDTO));
    }
}
