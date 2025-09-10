package br.com.fiap.fintech.model;

public abstract class ProdutoFinanceiro {
    private String nome;
    private double valorAplicado;

    // Construtor
    public ProdutoFinanceiro(String nome, double valorAplicado) {
        this.nome = nome;
        this.valorAplicado = valorAplicado;
    }

    // Método abstrato (cada produto terá sua forma de calcular rendimento)
    public abstract double calcularRendimento();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    @Override
    public String toString() {
        return "ProdutoFinanceiro{" +
                "nome='" + nome + '\'' +
                ", valorAplicado=" + valorAplicado +
                '}';
    }
}
