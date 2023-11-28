package org.example.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Servico {

    private Imovel imovel;
    private Gerente gerente;
    private Date dataHoraCotacao;
    private double valor;
    private Date dataHoraExecucao;
    private List<Faxineiro> equipe;
    private boolean avaliacao;

    public Servico(Imovel imovel, Gerente gerente, Date dataHoraCotacao, double valor, Date dataHoraExecucao, List<Faxineiro> equipe, boolean avaliacao) {
        this.imovel = imovel;
        this.gerente = gerente;
        this.dataHoraCotacao = dataHoraCotacao;
        this.valor = valor;
        this.dataHoraExecucao = dataHoraExecucao;
        this.equipe = equipe;
        this.avaliacao = avaliacao;
    }

    public Servico() {
    }

    private void marcarVisitaParaCotacao(Date data, Imovel imovel, Gerente gerente) {
    }

    private void marcarRealizacaoDoServico(Date data) {
    }

    private void adicionarMembroAEquipe(Faxineiro faxineiro) {
    }

    private void avaliarServico(boolean nota) {
    }
}
