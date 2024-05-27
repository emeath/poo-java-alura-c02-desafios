package br.com.matheus.desafios.aula04.exercicio02;

// Ex02) Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return largura * 2 + altura * 2;
    }

    @Override
    public void exibirDimensoes() {
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
    }
}
