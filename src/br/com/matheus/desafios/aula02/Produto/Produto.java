package br.com.matheus.desafios.aula02.Produto;

import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double desconto) {
        preco = preco - (desconto/100)*preco;
    }

    public static void main(String[] args) {
        Produto laptop = new Produto();
        laptop.setNome("Laptop da Marca X");
        laptop.setPreco(3500.70);

        System.out.println("Produto = " + laptop.getNome());
        System.out.println("Produto antes do desconto: R$" + laptop.getPreco());
        System.out.println("Aplicando desconto de 20%");
        laptop.aplicarDesconto(20.0);
        System.out.println("Novo preco: R$" + laptop.getPreco());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto de desconto aplicar?");
        double novoDesconto = scanner.nextDouble();
        laptop.aplicarDesconto(novoDesconto);
        System.out.println("Novo preco: R$" + laptop.getPreco());
    }
}
