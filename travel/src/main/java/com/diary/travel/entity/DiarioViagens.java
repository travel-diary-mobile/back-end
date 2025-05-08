package com.diary.travel.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_viagens")
public class DiarioViagens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ou AUTO
    private Long id;

    private String descricao;
    private String titulo;
    private String destino;
    private String imagem;
    private int dataViagem;

    @Enumerated(EnumType.STRING)
    private Atividades atividades;

	
	public DiarioViagens() {
		
	}
	public DiarioViagens(Long id, String descricao, String titulo, String destino, String imagem,
			int dataViagem, Atividades atividades) {
		this.id = id;
		this.descricao = descricao;
		this.titulo = titulo;
		this.destino = destino;
		this.imagem = imagem;
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
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
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
