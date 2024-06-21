package br.com.matheus.desafios.desafio_final.principal;

import br.com.matheus.desafios.desafio_final.modelos.FiltroRecomendacoes;
import br.com.matheus.desafios.desafio_final.modelos.Musica;
import br.com.matheus.desafios.desafio_final.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Rock", "Metallica", "One", 421);
        Musica musica2 = new Musica("Eletronic", "deadmau5", "I Remember", 333);
        Musica musica3 = new Musica("Rock", "THE HARDKISS", "Коханці", 240);

        for (int i = 0; i < 1000; i++) {
            musica1.curtir();
        }

        for (int i = 0; i < 10000; i++) {
            musica1.reproduzir();
        }

        for (int i = 0; i < 3333; i++) {
            musica2.curtir();
        }

        for (int i = 0; i < 22000; i++) {
            musica2.reproduzir();
        }

        for (int i = 0; i < 60; i++) {
            musica3.curtir();
        }

        for (int i = 0; i < 2; i++) {
            musica3.reproduzir();
        }



        System.out.println(musica1.getTotalDeCurtidas() + " - " + musica1.getTitulo());
        System.out.println(musica1.getClassificacao());

        FiltroRecomendacoes filtro = new FiltroRecomendacoes();
        filtro.filtra(musica1);

        System.out.println(musica2.getTotalDeCurtidas() + " - " + musica2.getTitulo());
        System.out.println(musica2.getClassificacao());

        filtro.filtra(musica2);

        System.out.println(musica3.getTotalDeCurtidas() + " - " + musica3.getTitulo());
        System.out.println(musica3.getClassificacao());

        filtro.filtra(musica3);

        Podcast podcast = new Podcast("Programação", "Aprendendo sobre PHP", 3600);
        podcast.adicionarParticipante("Fulano");
        podcast.adicionarParticipante("Ciclano");
        podcast.adicionarParticipante("Beltrano");

        System.out.println(podcast.getParticipantes());

        for (int i = 0; i < 66; i++) {
            podcast.curtir();
        }

        System.out.println(podcast.getTitulo() + " - " + podcast.getClassificacao() + " - " + podcast.getTotalDeCurtidas());
        filtro.filtra(podcast);


    }
}
