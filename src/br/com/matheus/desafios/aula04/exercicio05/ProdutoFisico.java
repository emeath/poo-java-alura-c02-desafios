package br.com.matheus.desafios.aula04.exercicio05;

//### Exercicio 5
//
//Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

public class ProdutoFisico implements Calculavel {

    private double icms;
    private double cofins;
    private double pis;
    private double descontoEmPorcentagem;
    private double preco;

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public double getCofins() {
        return cofins;
    }

    public void setCofins(double cofins) {
        this.cofins = cofins;
    }

    public double getPis() {
        return pis;
    }

    public void setPis(double pis) {
        this.pis = pis;
    }

    public double getDescontoEmPorcentagem() {
        return descontoEmPorcentagem;
    }

    public void setDescontoEmPorcentagem(double descontoEmPorcentagem) {
        this.descontoEmPorcentagem = descontoEmPorcentagem;
    }

    public double getPreco() {
        return calcularPrecoFinal();
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private double calcularImpostos() {
        if (preco > 0) {
            return (icms/100.0 + pis/100.0 + cofins/100.0) * preco;
        } else {
            return -1; // error
        }
    }

    private double calcularDesconto() {
        if (preco > 0) {
            return (descontoEmPorcentagem/100.0) * preco;
        } else {
            return -1; // error
        }
    }

    @Override
    public double calcularPrecoFinal() {
        if (preco > 0) {
            return preco - calcularDesconto() + calcularImpostos();
        } else {
            return -1; // error
        }
    }
}
