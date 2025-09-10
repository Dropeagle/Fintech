package br.com.fiap.fintech.model;

public class Transacao {
    private String tipo; // "entrada" ou "saída"
    private double valor;
    private String data;
    private String descricao;

    // Construtor
    public Transacao(String tipo, double valor, String data, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", data='" + data + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
