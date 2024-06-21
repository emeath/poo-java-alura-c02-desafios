package br.com.matheus.desafios.desafio_final.modelos;

public class Audio {

    private String titulo;
    private int duracaoEmSegundos;
    protected int totalDeReproducoes;
    protected int totalDeCurtidas;
    protected double classificacao;

    public Audio(String titulo, int duracaoEmSegundos) {
        this.titulo = titulo;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo o audio: " + titulo);
        totalDeReproducoes++;
    }

    public void curtir() {
        totalDeCurtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

}
