package com.example.appcadastro.model;

public class Contato {

    private Integer id;
    private String nome;
    private String nome_social;
    private String genero;
    private String pai;
    private String mae;
    private Double renda;

    public Contato(String nome, String nome_social, String genero, String pai, String mae, Double renda) {
        this.nome = nome;
        this.nome_social = nome_social;
        this.genero = genero;
        this.pai = pai;
        this.mae = mae;
        this.renda = renda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }
}
