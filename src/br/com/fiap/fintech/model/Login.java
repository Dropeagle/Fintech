package br.com.fiap.fintech.model;

public class Login {
    private String usuario;
    private String senha;

    // Construtor
    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    // Métodos
    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }

    // Getters e Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Login{" +
                "usuario='" + usuario + '\'' +
                '}';
    }
}
