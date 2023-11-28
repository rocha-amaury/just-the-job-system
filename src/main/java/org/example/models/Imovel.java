package org.example.models;

import java.util.List;

public class Imovel {

    private Cliente cliente;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private long cep;

    public Imovel(Cliente cliente, String logradouro, String numero, String complemento, String bairro, String cidade, String estado, long cep) {
        this.cliente = cliente;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Imovel() {
    }

    private void visualizarDadosDoImovel() {
    }

    private void visualizarDadosDoProprietario() {
    }

    private void visualizarHistoricoServicos() {
    }
}
