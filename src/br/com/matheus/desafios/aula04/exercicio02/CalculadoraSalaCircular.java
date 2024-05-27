package br.com.matheus.desafios.aula04.exercicio02;

public class CalculadoraSalaCircular implements CalculoGeometrico {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void exibirDimensoes() {
        System.out.println("Raio: " + raio);
    }
}
