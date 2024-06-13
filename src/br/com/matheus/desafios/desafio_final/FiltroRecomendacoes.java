package br.com.matheus.desafios.desafio_final;

public class FiltroRecomendacoes {
    public void filtra(Classificavel classificavel) {
        int classificacao = classificavel.getClassificacao();
        if (classificacao <= 2) {
            System.out.println("Indicação baixa");
        } else if (classificacao <= 5) {
            System.out.println("Indicação moderada");
        } else {
            System.out.println("Boa indicação!");
        }
    }
}
