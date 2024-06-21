package br.com.matheus.desafios.desafio_final.modelos;

public class Musica extends Audio implements Classificavel {

    private String genero;
    private String banda;

    public Musica(String genero, String banda, String titulo, int duracaoEmSegundos) {
        super(titulo, duracaoEmSegundos);
        this.genero = genero;
        this.banda = banda;
    }

    public String getGenero() {
        return genero;
    }

    public String getBanda() {
        return banda;
    }

    @Override
    public int getClassificacao() {
        if (totalDeReproducoes < 100) {
            if (totalDeCurtidas < 50) {
                return 1;
            } else if (totalDeCurtidas < 75) {
                return 6;
            } else {
                return 10;
            }
        } else if (totalDeReproducoes < 1000) {
            if (totalDeCurtidas < 100) {
                return 1;
            } else if (totalDeCurtidas < 500) {
                return 6;
            } else {
                return 10;
            }
        } else {
            if (totalDeCurtidas < 300) {
                return 1;
            } else if (totalDeCurtidas < 1000) {
                return 6;
            } else {
                return 10;
            }
        }
    }
}
