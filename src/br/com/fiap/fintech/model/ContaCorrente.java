package br.com.fiap.fintech.model;

public class ContaCorrente extends Conta {
    private double tarifaMensal;

    public ContaCorrente(String numero, Cliente titular, double tarifaMensal) {
        super(numero, titular);
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifa() {
        // tenta debitar a tarifa; se não houver saldo suficiente, apenas ignora
        sacar(tarifaMensal);
    }

    public double getTarifaMensal() { return tarifaMensal; }
    public void setTarifaMensal(double tarifaMensal) { this.tarifaMensal = tarifaMensal; }
}
