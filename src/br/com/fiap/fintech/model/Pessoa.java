package br.com.fiap.fintech.model;

public class Pessoa {
    private String nome;
    private String documento; // CPF ou CNPJ

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() { return nome; }
    public String getDocumento() { return documento; }
    public void setNome(String nome) { this.nome = nome; }
    public void setDocumento(String documento) { this.documento = documento; }
}
