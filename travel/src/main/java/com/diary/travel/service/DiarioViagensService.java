package com.diary.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diary.travel.dto.DiarioViagensDTO;
import com.diary.travel.entity.DiarioViagens;
import com.diary.travel.repository.DiarioViagensRepository;

@Service
public class DiarioViagensService {

    @Autowired
    private DiarioViagensRepository repository;

    public DiarioViagens salvar(DiarioViagensDTO diarioViagensDTO) {
    	DiarioViagens diarioViagens = new DiarioViagens();
    	diarioViagens.setTitulo(diarioViagensDTO.getTitulo());
    	diarioViagens.setDescricao(diarioViagensDTO.getDescricao());
    	diarioViagens.setDestino(diarioViagensDTO.getDestino());
    	diarioViagens.setDataViagem(diarioViagensDTO.getDataViagem());

        // Salvando a imagem como base64
    	diarioViagens.setImagemBase64(diarioViagensDTO.getImagemBase64());

        return repository.save(diarioViagens);
    }

    public DiarioViagens atualizar(Long id, DiarioViagensDTO diarioViagensDTO) {
    	DiarioViagens diarioViagensExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Planta não encontrada"));

    	diarioViagensExistente.setTitulo(diarioViagensDTO.getTitulo());
    	diarioViagensExistente.setDescricao(diarioViagensDTO.getDescricao());
    	diarioViagensExistente.setDestino(diarioViagensDTO.getDestino());
    	diarioViagensExistente.setDataViagem(diarioViagensDTO.getDataViagem());

        if (diarioViagensDTO.getImagemBase64() != null) {
        	diarioViagensExistente.setImagemBase64(diarioViagensDTO.getImagemBase64());
        }

        return repository.save(diarioViagensExistente);
    }

    public List<DiarioViagens> listarTodas() {
        return repository.findAll();
    }

    public DiarioViagens buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Planta não encontrada"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
