package br.com.matheus.desafios.aula03.exercicio03;

//### Exercicio 3

//Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

public class ContaBancaria {

    private Titular titular;
    private String numeroDaConta;
    protected double saldo;

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
        consultarSaldo();
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }
        consultarSaldo();
    }

    public void consultarSaldo() {
        System.out.println("Saldo em conta: " + saldo);
    }

    public void exibirInformacoesConta() {
        System.out.println("Titular: ");
        System.out.println(titular.getNome());
        System.out.println(titular.getDocumentoDeIdentificacao());
        System.out.println(titular.getEndereco());
        System.out.println("Saldo:");
        consultarSaldo();
    }
}
