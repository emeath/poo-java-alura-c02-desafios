package br.com.matheus.desafios.aula04.exercicio05;

public class TestaProdutos {
    public static void main(String[] args) {
        Livro livro = new Livro();
        ProdutoFisico produto = new ProdutoFisico();

        double precoLivroSemTributacao = 25.00;
        double descontoLivroEmPorcentagem = 15;
        livro.setPreco(precoLivroSemTributacao);
        livro.setDescontoEmPorcentagem(descontoLivroEmPorcentagem);
        System.out.println("Livro");
        System.out.println("Preco sem tributacao = " + precoLivroSemTributacao);
        System.out.println("Desconto (%) = " + descontoLivroEmPorcentagem);
        System.out.println("Preco final = " + livro.getPreco());

        System.out.println("--------------");

        double precoProdutoFisicoSemTributacao = 225.00;
        double descontoProdutoFisico = 7;
        double icms = 3.1;
        double cofins = 5.0;
        double pis = 7.4;
        produto.setIcms(icms);
        produto.setCofins(cofins);
        produto.setPis(pis);
        produto.setDescontoEmPorcentagem(descontoProdutoFisico);
        produto.setPreco(precoProdutoFisicoSemTributacao);
        System.out.println("Produto fisico");
        System.out.println("Preco sem tributacao = " + precoProdutoFisicoSemTributacao);
        System.out.println("Desconto (%) = " + descontoProdutoFisico);
        System.out.println("ICMS (%) = " + icms);
        System.out.println("COFINS (%) = " + cofins);
        System.out.println("PIS (%) = " + pis);
        System.out.println("Preco final = " + produto.getPreco());
    }
}
