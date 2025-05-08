package com.diary.travel.entity;

import java.io.File;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class DiarioViagensClient {

    public static void main(String[] args) {
        String url = "http://localhost:8080/diario/salvar"; // Altere a rota se necessário

        RestTemplate restTemplate = new RestTemplate();

        // Criar os dados do formulário
        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("titulo", "Viagem à Amazônia");
        body.add("descricao", "Uma experiência incrível na floresta.");
        body.add("destino", "Amazônia");
        body.add("dataViagem", "20250508"); // Use um int ou string conforme o backend espera
        body.add("imagem64", new FileSystemResource(new File("caminho/para/sua/imagem.jpg")));

        // Se houver relacionamento com Atividades e precisa enviar algo, adicione aqui
        // body.add("atividades", ...); // Enviar ID ou outro campo serializado, dependendo da sua API

        // Configurar os headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        // Criar a requisição
        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);

        // Enviar a requisição
        ResponseEntity<String> response = restTemplate.postForEntity(url, requestEntity, String.class);

        // Exibir a resposta
        System.out.println(response.getBody());
    }
}
