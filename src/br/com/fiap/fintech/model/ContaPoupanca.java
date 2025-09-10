package br.com.fiap.fintech.model;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    // Construtor
    public ContaPoupanca(int numero, String agencia, double saldo, double taxaRendimento) {
        super(numero, agencia, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    // Método específico da poupança
    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }

    // Getters e Setters
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numero=" + getNumero() +
                ", agencia='" + getAgencia() + '\'' +
                ", saldo=" + getSaldo() +
                ", taxaRendimento=" + taxaRendimento +
                '}';
    }
}
