package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    public Cliente(String nome, double telefone, String email, int cpf) {
        super(nome, telefone, email, cpf);
    }

    private void visualizarDadosCliente(int cpf) {
    }

    private ArrayList<Imovel> visualizarImoveis() {
        return new ArrayList<>();
    }

    private void visualizarImovelResidencia() {
    }
}
