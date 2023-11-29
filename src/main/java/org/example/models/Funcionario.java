package org.example.models;

public class Funcionario extends Pessoa {

    private String perfil;

    private Agenda agenda;

    public Funcionario(String nome, double telefone, String email, int cpf, Imovel imovelOndeMora, String perfil) {
        super(nome, telefone, email, cpf, imovelOndeMora);
        this.perfil = perfil;
    }

    public Funcionario() {
    }
}

