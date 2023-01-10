package main;

import java.util.ArrayList;
import java.util.List;

public class JogoTurno {
    private TurnoEstado atual;
    private List<TurnoEstado> historico = new ArrayList<TurnoEstado>();

    public TurnoEstado getAtual() {
        return atual;
    }

    public void setAtual(TurnoEstado atual) {
        this.atual = atual;
        this.historico.add(atual);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.historico.size() - 1 ) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.atual = this.historico.get(indice);
    }

    public List<TurnoEstado> getHistorico() {
        return historico;
    }
}
