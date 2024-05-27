package br.com.matheus.desafios.aula04.exercicio01;

// Ex01) Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * 5.17;
    }
}
