package br.com.matheus.desafios.aula04.exercicio01;

// Ex01) Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

public class TestadoraConversorMoeda {

    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        double valorEmDolares = 500;
        double valorEmReais = conversorMoeda.converterDolarParaReal(valorEmDolares);
        System.out.println("U$" + valorEmDolares + " => R$" + valorEmReais);
    }

}
