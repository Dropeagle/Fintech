package br.com.fiap.fintech.model;

public class MetaFinanceira {
    private String nome;
    private double valorObjetivo;
    private double valorAtual;

    // Construtor
    public MetaFinanceira(String nome, double valorObjetivo, double valorAtual) {
        this.nome = nome;
        this.valorObjetivo = valorObjetivo;
        this.valorAtual = valorAtual;
    }

    // Métodos
    public void adicionarValor(double valor) {
        if (valor > 0) {
            valorAtual += valor;
        }
    }

    public boolean objetivoAtingido() {
        return valorAtual >= valorObjetivo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorObjetivo() {
        return valorObjetivo;
    }

    public void setValorObjetivo(double valorObjetivo) {
        this.valorObjetivo = valorObjetivo;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    @Override
    public String toString() {
        return "MetaFinanceira{" +
                "nome='" + nome + '\'' +
                ", valorObjetivo=" + valorObjetivo +
                ", valorAtual=" + valorAtual +
                '}';
    }
}
