package br.com.matheus.desafios.aula04.exercicio05;

//### Exercicio 5
//
//Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

public class Livro implements Calculavel {

    private double descontoEmPorcentagem;
    private double preco;

    public double getDescontoEmPorcentagem() {
        return descontoEmPorcentagem;
    }

    public void setDescontoEmPorcentagem(double descontoEmPorcentagem) {
        this.descontoEmPorcentagem = descontoEmPorcentagem;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return calcularPrecoFinal();
    }

    @Override
    public double calcularPrecoFinal() {
        if (preco > 0) {
            return preco - preco*descontoEmPorcentagem/100.0;
        } else {
            return -1; // error
        }
    }
}
