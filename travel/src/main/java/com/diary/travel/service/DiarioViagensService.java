package com.diary.travel.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diary.travel.dto.DiarioViagensDTO;
import com.diary.travel.entity.DiarioViagens;
import com.diary.travel.repository.DiarioViagensRepository;

@Service
public class DiarioViagensService {
	
	private final Path uploadDir = Paths.get("uploads");

    @Autowired
    private DiarioViagensRepository repository;

    public DiarioViagens salvar(DiarioViagensDTO diarioViagensDTO) {
        try {
            // Criar a pasta de uploads caso não exista
            if (!Files.exists(uploadDir)) {
                Files.createDirectories(uploadDir);
            }

            DiarioViagens diario = new DiarioViagens();
            diarioViagensDTO.setTitulo(diarioViagensDTO.getTitulo());
            diario.setDestino(diarioViagensDTO.getDestino());
            diario.setDescricao(diarioViagensDTO.getDescricao());
            diario.setDataViagem(diarioViagensDTO.getDataViagem());
            diario.setAtividades(diarioViagensDTO.getAtividades());
            
            // Verificar se a imagem foi fornecida
            if (diarioViagensDTO.getImagem64() != null) {
                String nomeArquivo = System.currentTimeMillis() + "-" + diarioViagensDTO.getImagem64().getOriginalFilename();
                Path caminhoImagem = uploadDir.resolve(nomeArquivo);

                // Salvar o arquivo no sistema de arquivos
                Files.copy(diarioViagensDTO.getImagem64().getInputStream(), caminhoImagem, StandardCopyOption.REPLACE_EXISTING);
                diario.setImagem(nomeArquivo);
            }

            return repository.save(diario);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar a imagem.", e);
        }
    }

    public DiarioViagens atualizar(Long id, DiarioViagensDTO diarioViagensDTO) {
    	DiarioViagens diarioExistente = repository.findById(id).orElseThrow(() -> new RuntimeException("Planta não encontrada"));

    	DiarioViagens diario = new DiarioViagens();
        diarioViagensDTO.setTitulo(diarioViagensDTO.getTitulo());
        diario.setDestino(diarioViagensDTO.getDestino());
        diario.setDescricao(diarioViagensDTO.getDescricao());
        diario.setDataViagem(diarioViagensDTO.getDataViagem());
        diario.setAtividades(diarioViagensDTO.getAtividades());

        // Verificar se a imagem foi fornecida
        if (diarioViagensDTO.getImagem64() != null) {
            try {
                if (!Files.exists(uploadDir)) {
                    Files.createDirectories(uploadDir);
                }
                String nomeArquivo = System.currentTimeMillis() + "-" + diarioViagensDTO.getImagem64().getOriginalFilename();
                Path caminhoImagem = uploadDir.resolve(nomeArquivo);
                Files.copy(diarioViagensDTO.getImagem64().getInputStream(), caminhoImagem, StandardCopyOption.REPLACE_EXISTING);

                diarioExistente.setImagem(nomeArquivo);
            } catch (IOException e) {
                throw new RuntimeException("Erro ao salvar a imagem.", e);
            }
        }

        return repository.save(diarioExistente);
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
