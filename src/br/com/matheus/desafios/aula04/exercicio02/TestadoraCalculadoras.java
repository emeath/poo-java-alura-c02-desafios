package br.com.matheus.desafios.aula04.exercicio02;

// Ex02) Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

public class TestadoraCalculadoras {

    public static void exibeResultadosDeCalculosGeometricos(CalculoGeometrico calculoGeometrico) {
        System.out.println(calculoGeometrico);
        System.out.println("Area = " + calculoGeometrico.calcularArea());
        System.out.println("Perimetro = " + calculoGeometrico.calcularPerimetro());
        calculoGeometrico.exibirDimensoes();
    }

    public static void main(String[] args) {
        CalculadoraSalaRetangular salaRetangular = new CalculadoraSalaRetangular();
        salaRetangular.setAltura(10);
        salaRetangular.setLargura(10);

        CalculadoraSalaCircular salaCircular = new CalculadoraSalaCircular();
        salaCircular.setRaio(10);

        CalculadoraSalaHexagonalRegular salaHexagonalRegular = new CalculadoraSalaHexagonalRegular();
        salaHexagonalRegular.setLado(10);

        exibeResultadosDeCalculosGeometricos(salaRetangular);
        exibeResultadosDeCalculosGeometricos(salaCircular);
        exibeResultadosDeCalculosGeometricos(salaHexagonalRegular);


    }

}
