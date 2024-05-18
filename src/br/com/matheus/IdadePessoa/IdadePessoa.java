package br.com.matheus.IdadePessoa;

public class IdadePessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " não é maior de idade.");
        }
    }

    public static void main(String[] args) {

        IdadePessoa joao = new IdadePessoa();
        joao.setIdade(21);
        joao.setNome("Joao da Silva");

        IdadePessoa thiago = new IdadePessoa();
        thiago.setIdade(17);
        thiago.setNome("Thiago Servulo");

        joao.verificarIdade();
        thiago.verificarIdade();
    }
}
