package br.com.matheus.desafios.desafio_final;

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

        System.out.println(musica1.getTotalDeCurtidas() + " - " + musica1.getTitulo());
        System.out.println(musica1.getClassificacao());

        FiltroRecomendacoes filtro = new FiltroRecomendacoes();
        filtro.filtra(musica1);



    }
}
