package org.example.models;

public abstract class Pessoa {
    private String nome;
    private double telefone;
    private String email;
    private int cpf;
    private Imovel imovelOndeMora;

    public Pessoa(String nome, double telefone, String email, int cpf, Imovel imovelOndeMora) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.imovelOndeMora = imovelOndeMora;
    }

    public Pessoa() {
    }
}
