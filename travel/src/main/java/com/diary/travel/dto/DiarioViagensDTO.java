package com.diary.travel.dto;

import org.springframework.web.multipart.MultipartFile;

import com.diary.travel.entity.Atividades;

public class DiarioViagensDTO {
	
	private Long id;
	
	private String descricao;
	private String titulo;
	private String destino;
	private MultipartFile imagem64;
    private int dataViagem;
	private Atividades atividades;

	
	public DiarioViagensDTO() {
		
	}
	public DiarioViagensDTO(Long id, String descricao, String titulo, String destino, MultipartFile  imagem64,
			int dataViagem, Atividades atividades) {
		this.id = id;
		this.descricao = descricao;
		this.titulo = titulo;
		this.destino = destino;
		this.imagem64 = imagem64;
		this.dataViagem = dataViagem;
		this.atividades = atividades;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public MultipartFile  getImagem64() {
		return imagem64;
	}
	public void setImagem64(MultipartFile  imagem64) {
		this.imagem64 = imagem64;
	}
	public int getDataViagem() {
		return dataViagem;
	}
	public void setDataViagem(int dataViagem) {
		this.dataViagem = dataViagem;
	}
	public Atividades getAtividades() {
		return atividades;
	}
	public void setAtividades(Atividades atividades) {
		this.atividades = atividades;
	}
	

}
