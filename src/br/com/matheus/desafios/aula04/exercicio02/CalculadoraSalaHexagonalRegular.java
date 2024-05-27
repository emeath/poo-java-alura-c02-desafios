package br.com.matheus.desafios.aula04.exercicio02;

import static java.lang.Math.sqrt;

public class CalculadoraSalaHexagonalRegular implements CalculoGeometrico {
    private double lado;
    private double raio;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        if (lado > 0) {
            return (lado * lado * sqrt(3) / 4) * 6;
        } else if (raio > 0) {
            return (raio * raio * sqrt(3) / 4) * 6;
        } else {
            return -1;
        }
    }

    @Override
    public double calcularPerimetro() {
        if (lado > 0) {
            return lado * 6;
        } else if (raio > 0) {
            return raio * 6;
        } else {
            return -1;
        }
    }

    @Override
    public void exibirDimensoes() {
        if (lado > 0) {
            System.out.println("Lado: " + lado);
        } else if (raio > 0) {
            System.out.println("Raio: " + raio);
        } else {
            System.out.println("Erro!");
        }
    }
}
