package br.com.matheus.desafios.aula01;

import java.time.LocalDate;

// 04 Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

public class Carro {

    private String modelo;
    private int anoFabricacao;
    private String cor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao >= 1885) {
            this.anoFabricacao = anoFabricacao;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdadeCarro() {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        return anoAtual - anoFabricacao;
    }

    public void exibirFichaTecnica() {
        System.out.println();
        System.out.println("Carro: " + modelo);
        System.out.println("Ano de fabricacao: " + anoFabricacao);
        System.out.println("Idade do carro: " + getIdadeCarro());
        System.out.println("Cor: " + cor);
        System.out.println();
    }
}
