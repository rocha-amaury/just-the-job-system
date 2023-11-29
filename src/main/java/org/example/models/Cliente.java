package org.example.models;

import java.util.ArrayList;
import java.util.List;


public class Cliente extends Pessoa {

    private List<Imovel> imoveis;

    public Cliente(String nome, double telefone, String email, int cpf, Imovel imovelOndeMora, List<Imovel> imoveis) {
        super(nome, telefone, email, cpf, imovelOndeMora);
        this.imoveis = imoveis;
    }

    public Cliente() {
    }

    private void visualizarDadosCliente(int cpf) {
    }

    private ArrayList<Imovel> visualizarImoveis() {
        return new ArrayList<>();
    }

    private void visualizarImovelResidencia() {
    }
}
