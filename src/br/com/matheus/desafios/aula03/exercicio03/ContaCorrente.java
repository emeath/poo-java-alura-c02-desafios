package br.com.matheus.desafios.aula03.exercicio03;

//### Exercicio 3

//Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

public class ContaCorrente extends ContaBancaria {

    private double tarifaMensalEmPorcentagem = 0.01;
    private double bonusDepositoSalarioEmPorcentagem = 0.0003;

    public void cobrarTarifaMensal() {
        saldo -= saldo * ( tarifaMensalEmPorcentagem / 100.0 );
    }

    public void receberDepositoSalario(double valorSalario) {
        saldo += valorSalario + valorSalario * (bonusDepositoSalarioEmPorcentagem / 100.0);
        super.consultarSaldo();
    }

    @Override
    public void exibirInformacoesConta() {
        System.out.println("Conta Corrente: ");
        super.exibirInformacoesConta();
    }

}
