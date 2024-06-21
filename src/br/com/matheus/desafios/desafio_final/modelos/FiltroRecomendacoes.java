package br.com.matheus.desafios.desafio_final.modelos;

import br.com.matheus.desafios.desafio_final.modelos.Classificavel;

public class FiltroRecomendacoes {
    public void filtra(Classificavel classificavel) {
        int classificacao = classificavel.getClassificacao();
        if (classificacao <= 2) {
            System.out.println("Indicação baixa");
        } else if (classificacao <= 7) {
            System.out.println("Indicação moderada");
        } else {
            System.out.println("Boa indicação!");
        }
    }
}
