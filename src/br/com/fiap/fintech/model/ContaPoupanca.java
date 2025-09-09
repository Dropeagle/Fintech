package br.com.fiap.fintech.model;

public class ContaPoupanca extends Conta {
    private double rendimentoMensal; // ex: 0.01 = 1% a.m.

    public ContaPoupanca(String numero, Cliente titular, double rendimentoMensal) {
        super(numero, titular);
        this.rendimentoMensal = rendimentoMensal;
    }

    public void aplicarRendimento() {
        double ganho = getSaldo() * rendimentoMensal;
        if (ganho > 0) depositar(ganho);
    }

    public double getRendimentoMensal() { return rendimentoMensal; }
    public void setRendimentoMensal(double rendimentoMensal) { this.rendimentoMensal = rendimentoMensal; }
}
