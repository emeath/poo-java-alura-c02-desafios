package br.com.matheus.desafios.aula01.musica;

public class Artista {
    private String nome;
    private String Banda;
    private String estiloMusical;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBanda() {
        return Banda;
    }

    public void setBanda(String banda) {
        Banda = banda;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
