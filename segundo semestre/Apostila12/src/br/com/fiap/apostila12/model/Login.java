package br.com.fiap.apostila12.model;

import br.com.fiap.apostila12.exception.SenhaInvalidaException;

public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        setSenha(senha); //chama setSenha para utilizar a validação no construtor
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        //validar senha com pelo menos 8 caracteres
        if (senha == null || senha.length() < 8) {
            throw new SenhaInvalidaException("Senha Inválida");
        }
        this.senha = senha;
    }
}
