package br.com.fiap.fintech.model;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    // Construtor
    public ContaCorrente(int numero, String agencia, double saldo, double limiteChequeEspecial) {
        super(numero, agencia, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Sobrescrevendo método sacar
    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (getSaldo() + limiteChequeEspecial)) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    // Getters e Setters
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + getNumero() +
                ", agencia='" + getAgencia() + '\'' +
                ", saldo=" + getSaldo() +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }
}
