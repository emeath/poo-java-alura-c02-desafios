package br.com.matheus.desafios.aula04.exercicio06;

//### Exercicio 6
//
//Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

public class Servico implements Vendavel {

    private int horasTrabalhadas;
    private double precoPorHora;
    private String nomeServico;

    private double taxaInicial;

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public double getTaxaInicial() {
        return taxaInicial;
    }

    public void setTaxaInicial(double taxaInicial) {
        this.taxaInicial = taxaInicial;
    }

    @Override
    public double calcularPrecoTotal() {
        return horasTrabalhadas * precoPorHora + taxaInicial;
    }
}
