package br.com.matheus.desafios.aula04.exercicio03;

// Ex03) Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.

public class TabuadaMultiplicacao implements Tabuada {

    private int numeroTabuada;

    public int getNumeroTabuada() {
        return numeroTabuada;
    }

    public void setNumeroTabuada(int numeroTabuada) {
        this.numeroTabuada = numeroTabuada;
    }

    @Override
    public void mostrarTabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }
    }
}
