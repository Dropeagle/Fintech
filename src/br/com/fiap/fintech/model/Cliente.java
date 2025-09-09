package br.com.fiap.fintech.model;

public class Cliente extends Pessoa {
    private String email;

    public Cliente(String nome, String documento, String email) {
        super(nome, documento);
        this.email = email;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
