package br.com.matheus.desafios.aula02.Livro;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo);
        System.out.println("    Autor: " + autor);
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setAutor("Um Autor X");
        livro.setTitulo("Um Titulo Y");
        livro.exibirDetalhes();
    }
}
