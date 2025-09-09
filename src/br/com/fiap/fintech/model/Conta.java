package br.com.fiap.fintech.model;

public abstract class Conta {
    private String numero;
    private Cliente titular;
    private double saldo;

    public Conta(String numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor de depósito inválido");
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) return false;
        saldo -= valor;
        return true;
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public String getNumero() { return numero; }
    public Cliente getTitular() { return titular; }
    public double getSaldo() { return saldo; }
}
