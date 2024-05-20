package br.com.matheus.desafios.aula01.musica;

// 03 Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
// e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public class Musica {

    private String titulo;
    private Artista artista;
    private int anoLancamento;
    private double avaliacao = 0;
    private int numAvaliacoes = 0;

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public int getNumAvaliacoes() {
        return numAvaliacoes;
    }

    public double getMediaAvaliacoes() {
        if (numAvaliacoes == 0) {
            return -1; // nao recebeu nenhuma avaliacao ainda...
        }
        return avaliacao / numAvaliacoes;
    }

    public void exibirFichaTecnica() {
        System.out.println("Musica: " + titulo);
        System.out.println("Artista: " + getArtista().getNome());
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("avaliacao: " + getMediaAvaliacoes());
        System.out.println("Numero de avaliacoes: " + numAvaliacoes);
    }

    public void avaliar(double avaliacao) {
        if (avaliacao > 0 ) {
            this.avaliacao += avaliacao;
        }
        numAvaliacoes++;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
