package br.com.matheus.desafios.aula04.exercicio06;

//### Exercicio 6
//
//Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

public class Produto implements Vendavel {

    private String nomeProduto;
    private double preco;
    private double descontoEmPorcentagem;
    private double taxaEmPorcentagem;
    private int quantidadeComprada;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return calcularPrecoTotal();
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDescontoEmPorcentagem() {
        return descontoEmPorcentagem;
    }

    public void setDescontoEmPorcentagem(double descontoEmPorcentagem) {
        this.descontoEmPorcentagem = descontoEmPorcentagem;
    }

    public double getTaxaEmPorcentagem() {
        return taxaEmPorcentagem;
    }

    public void setTaxaEmPorcentagem(double taxaEmPorcentagem) {
        this.taxaEmPorcentagem = taxaEmPorcentagem;
    }

    private boolean precoFoiCorretamenteDefinido() {
        if (preco <= 0) {
            return false;
        }
        return true;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        }
    }

    private double calcularDesconto() {
        if (precoFoiCorretamenteDefinido()) {
            return preco * descontoEmPorcentagem / 100.0;
        } else {
            return -1; // error
        }
    }

    private double calcularImpostos() {
        if (precoFoiCorretamenteDefinido()) {
            return preco * taxaEmPorcentagem / 100.0;
        } else {
            return -1; // error
        }
    }

    @Override
    public double calcularPrecoTotal() {
        if (precoFoiCorretamenteDefinido()) {
            return (preco + calcularImpostos() - calcularDesconto()) * quantidadeComprada;
        } else {
            return -1; // error
        }
    }


}
