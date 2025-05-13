package com.diary.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diary.travel.dto.DiarioViagensDTO;
import com.diary.travel.entity.DiarioViagens;
import com.diary.travel.service.DiarioViagensService;

@RestController
@RequestMapping("diarioviagens")
@CrossOrigin(origins = "*")
public class DiarioViagensController {

	@Autowired
    private DiarioViagensService diarioViagensService;

    @PostMapping
    public ResponseEntity<DiarioViagens> salvar(@RequestBody DiarioViagensDTO diarioViagensDTO) {
        System.out.println("Requisição recebida: " + diarioViagensDTO);
        DiarioViagens diarioViagens = diarioViagensService.salvar(diarioViagensDTO);
        return ResponseEntity.ok(diarioViagens);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DiarioViagens> atualizar(@PathVariable Long id, @RequestBody DiarioViagensDTO diarioViagensDTO) {
    	DiarioViagens diarioViagensAtualizada = diarioViagensService.atualizar(id, diarioViagensDTO);
        return ResponseEntity.ok(diarioViagensAtualizada);
    }

    @GetMapping
    public ResponseEntity<List<DiarioViagens>> listarTodas() {
        return ResponseEntity.ok(diarioViagensService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiarioViagens> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(diarioViagensService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
    	diarioViagensService.deletar(id);
        return ResponseEntity.noContent().build();
    }
    
}
