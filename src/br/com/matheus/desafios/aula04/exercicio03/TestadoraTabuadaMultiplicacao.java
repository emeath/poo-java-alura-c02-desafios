package br.com.matheus.desafios.aula04.exercicio03;

public class TestadoraTabuadaMultiplicacao {

    public static void exibeResultados(Tabuada tabuada) {
        tabuada.mostrarTabuada();
    }

    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.setNumeroTabuada(4);
        exibeResultados(tabuada);
    }

}
