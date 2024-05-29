package br.com.matheus.desafios.aula04.exercicio04;

public class TestadoraConversoreTemperaturaPadrao {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        double temperaturaEmCelcius = 21.9;
        double temperaturaEmFahrenheit = conversorTemperaturaPadrao.celsiusParaFahrenheit(21.9);

        System.out.printf("Grau Celcius: %.2f => Grau Fahrenheit: %.2f%n", temperaturaEmCelcius, temperaturaEmFahrenheit);

        temperaturaEmFahrenheit = 100;
        temperaturaEmCelcius = conversorTemperaturaPadrao.fahrenheitParaCelsius(100);

        System.out.printf("Grau Fahrenheit: %.2f => Grau Celcius: %.2f%n", temperaturaEmFahrenheit, temperaturaEmCelcius);
    }

}
