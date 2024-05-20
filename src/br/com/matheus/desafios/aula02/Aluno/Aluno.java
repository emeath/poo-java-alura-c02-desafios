package br.com.matheus.desafios.aula02.Aluno;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedias() {
        return (nota1+nota2+nota3) / 3.0;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Nome do Aluno");
        aluno.setNota1(10);
        aluno.setNota2(8);
        aluno.setNota3(9.5);
        System.out.println("Media do aluno: " + aluno.calcularMedias());
    }
}