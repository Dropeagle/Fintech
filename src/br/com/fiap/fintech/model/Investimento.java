package br.com.fiap.fintech.model;

public class Investimento extends ProdutoFinanceiro {
    private double taxaRetorno; // taxa de rendimento do investimento

    // Construtor
    public Investimento(String nome, double valorAplicado, double taxaRetorno) {
        super(nome, valorAplicado);
        this.taxaRetorno = taxaRetorno;
    }

    // Implementação do cálculo de rendimento
    @Override
    public double calcularRendimento() {
        return getValorAplicado() * taxaRetorno;
    }

    // Getters e Setters
    public double getTaxaRetorno() {
        return taxaRetorno;
    }

    public void setTaxaRetorno(double taxaRetorno) {
        this.taxaRetorno = taxaRetorno;
    }

    @Override
    public String toString() {
        return "Investimento{" +
                "nome='" + getNome() + '\'' +
                ", valorAplicado=" + getValorAplicado() +
                ", taxaRetorno=" + taxaRetorno +
                '}';
    }
}
