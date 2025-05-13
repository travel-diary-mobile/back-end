package com.diary.travel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_viagens")
public class DiarioViagens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String destino;
    private int dataViagem;
    @Lob
    private String imagemBase64; //Porque salvamos apenas o caminho da imagem no banco de dados.

    //Constructors
    public DiarioViagens() {

    }
    public DiarioViagens(Long id, String titulo, String descricao, String destino, int dataViagem, String imagemBase64) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.destino = destino;
        this.dataViagem = dataViagem;
        this.imagemBase64 = imagemBase64;
    }

    //Getters and Setters
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
