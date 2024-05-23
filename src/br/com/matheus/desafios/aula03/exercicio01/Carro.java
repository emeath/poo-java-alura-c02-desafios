package br.com.matheus.desafios.aula03.exercicio01;

//### Exercicio 1
//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

public class Carro {

    private String modelo;
    private double precoMedioAno1;
    private double precoMedioAno2;
    private double precoMedioAno3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoMedioAno1() {
        return precoMedioAno1;
    }

    public void setPrecoMedioAno1(double precoMedioAno1) {
        this.precoMedioAno1 = precoMedioAno1;
    }

    public double getPrecoMedioAno2() {
        return precoMedioAno2;
    }

    public void setPrecoMedioAno2(double precoMedioAno2) {
        this.precoMedioAno2 = precoMedioAno2;
    }

    public double getPrecoMedioAno3() {
        return precoMedioAno3;
    }

    public void setPrecoMedioAno3(double precoMedioAno3) {
        this.precoMedioAno3 = precoMedioAno3;
    }

    public double maiorPrecoMedio() {
        double maiorPreco = 0;
        if (precoMedioAno1 >= precoMedioAno2) {
            maiorPreco = precoMedioAno1;
            if (precoMedioAno3 >= precoMedioAno1) {
                maiorPreco = precoMedioAno3;
            }
        } else {
            maiorPreco = precoMedioAno2;
            if (precoMedioAno3 >= precoMedioAno2) {
                maiorPreco = precoMedioAno3;
            }
        }
        return maiorPreco;
    }

    public double menorPrecoMedio() {
        double menorPreco = 0;
        if (precoMedioAno1 <= precoMedioAno2) {
            menorPreco = precoMedioAno1;
            if (precoMedioAno3 <= precoMedioAno1) {
                menorPreco = precoMedioAno3;
            }
        } else {
            menorPreco = precoMedioAno2;
            if (precoMedioAno3 <= precoMedioAno1) {
                menorPreco = precoMedioAno3;
            }
        }
        return menorPreco;
    }

    public void exibeInformacoes() {
        System.out.println("****************************************");
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Maior preco: R$" + maiorPrecoMedio());
        System.out.println("Menor preco: R$" + menorPrecoMedio());
    }

}
