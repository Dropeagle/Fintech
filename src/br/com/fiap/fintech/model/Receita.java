package br.com.fiap.fintech.model;

public class Receita {
    private String descricao;
    private double valor;
    private String data;

    // Construtor
    public Receita(String descricao, double valor, String data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Receita{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", data='" + data + '\'' +
                '}';
    }
}
