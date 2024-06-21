package br.com.matheus.desafios.desafio_final.modelos;

import java.util.LinkedList;
import java.util.List;

public class Podcast extends Audio implements Classificavel {
    private List<String> participantes;
    private String tema;

    public Podcast(String tema, String titulo, int duracaoEmSegundos) {
        super(titulo, duracaoEmSegundos);
        participantes = new LinkedList<>();
        this.tema = tema;
    }

    public void adicionarParticipante(String participante) {
        participantes.add(participante);
    }

    public List<String> getParticipantes() {
        return participantes;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public int getClassificacao() {
        if (totalDeCurtidas < 100) {
            return 1;
        } else if (totalDeCurtidas < 500) {
            return 4;
        } else if (totalDeCurtidas < 1000) {
            return 6;
        } else {
            return 10;
        }
    }

}
