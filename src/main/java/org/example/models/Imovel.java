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
    private List<Pessoa> moradores;
    private List<Servico> servicosRealizados;

    public Imovel(Cliente cliente, String logradouro, String numero, String complemento, String bairro, String cidade, String estado, long cep, List<Pessoa> moradores, List<Servico> servicosRealizados) {
        this.cliente = cliente;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.moradores = moradores;
        this.servicosRealizados = servicosRealizados;
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
