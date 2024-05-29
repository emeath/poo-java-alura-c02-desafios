package br.com.matheus.desafios.aula04.exercicio04;

//### Exercicio 4
//
//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

public interface ConversorTemperatura {
    double celsiusParaFahrenheit(double temperaturaEmCelcius);
    double fahrenheitParaCelsius(double temperaturaEmFahrenheit);
}
