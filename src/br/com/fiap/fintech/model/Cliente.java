package br.com.fiap.fintech.model;

public class Cliente extends Pessoa {
    private String telefone;
    private String endereco;

    // Construtor
    public Cliente(String nome, String cpf, String email, String telefone, String endereco) {
        super(nome, cpf, email);
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
