package br.com.matheus.desafios.aula04.exercicio04;

//### Exercicio 4
//
//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.


public class ConversorTemperaturaPadrao implements ConversorTemperatura {


    @Override
    public double celsiusParaFahrenheit(double temperaturaEmCelcius) {
        return (temperaturaEmCelcius * 9/5.0) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaEmFahrenheit) {
        return (temperaturaEmFahrenheit - 32) * 5/9;
    }
}
