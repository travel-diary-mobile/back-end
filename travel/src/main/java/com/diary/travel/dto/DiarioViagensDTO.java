package com.diary.travel.dto;

public class DiarioViagensDTO {
	
    private Long id;
    private String titulo;
    private String descricao;
    private String destino;
    private int dataViagem;
    private String imagemBase64;

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
	
	public int getDataViagem() {
        return dataViagem;
    }
    public void setDataViagem(int dataViagem) {
        this.dataViagem = dataViagem;
    }

    public String getImagemBase64() {
        return imagemBase64;
    }

    public void setImagemBase64(String imagemBase64) {
        this.imagemBase64 = imagemBase64;
    }

}
