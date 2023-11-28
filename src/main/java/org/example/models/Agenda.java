package org.example.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda {
    private int[] diasDaSemanaDeTrabalho;

    public Agenda(int[] diasDaSemanaDeTrabalho) {
        this.diasDaSemanaDeTrabalho = diasDaSemanaDeTrabalho;
    }

    private void verificarDatasDisponiveis() {
    }

    private boolean verificarSeDataEstaDisponivel(Date data) {
        return false;
    }

    private List<Servico> verificarCompromissos(Date periodo) {
        return new ArrayList<>();
    }

    private void visualizarFuncionario() {
    }

    private void visualizarFuncionarios() {
    }
}
