package org.example.models;

public class Funcionario extends Pessoa {

    private String perfil;

    private Agenda agenda;

    public Funcionario(String nome, double telefone, String email, int cpf) {
        super(nome, telefone, email, cpf);
    }
}

