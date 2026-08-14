package br.com.fiap.apostila12.view;

import br.com.fiap.apostila12.exception.SenhaInvalidaException;
import br.com.fiap.apostila12.model.Login;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            //Pedir o usuário e senha
            System.out.println("Digite o nome do usuário: ");
            String usuario = leitor.next();
            System.out.println("Digite a senha do usuário(8 caracteres): ");
            String senha = leitor.next();
            //Criar Login do Usuário
            Login login = new Login(usuario, senha);
            //Exibir uma mensagem de sucesso
            System.out.println("Usuário " + login.getUsuario() + " cadastrado com sucesso!");
        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }finally {
            leitor.close();
        }
    }
}
