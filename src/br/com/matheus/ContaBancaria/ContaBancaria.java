package br.com.matheus.ContaBancaria;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return "Sr(a) " + titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void deposita(double deposito) {
        saldo += deposito;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Maria da Silva");
        conta.setNumeroConta(232333);
        conta.deposita(5000.50);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
