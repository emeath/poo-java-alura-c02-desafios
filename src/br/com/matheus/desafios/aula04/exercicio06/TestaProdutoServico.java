package br.com.matheus.desafios.aula04.exercicio06;

public class TestaProdutoServico {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNomeProduto("Laptop");
        produto.setPreco(1750.50);
        produto.setDescontoEmPorcentagem(15);
        produto.setQuantidadeComprada(4);
        produto.setTaxaEmPorcentagem(45);

        System.out.println("Total de produtos: R$" + produto.calcularPrecoTotal());

        Servico servico = new Servico();
        servico.setNomeServico("Locacao de carro");
        servico.setHorasTrabalhadas(48);
        servico.setPrecoPorHora(1000/24.0);
        servico.setTaxaInicial(370);

        System.out.println("Total pelo servico tomado: R$" + servico.calcularPrecoTotal());
    }

}
