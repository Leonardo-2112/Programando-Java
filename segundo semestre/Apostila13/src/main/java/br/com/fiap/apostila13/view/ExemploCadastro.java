package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;
import br.com.fiap.apostila13.model.Carro;

import java.sql.SQLException;
import java.util.Scanner;

public class ExemploCadastro {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        //Pedir para o usuário os dados do carro
        System.out.println("Digite o ano do carro: ");
        int ano = leitor.nextInt();
        System.out.println("Digite a cor do carro: ");
        String cor = leitor.next() + leitor.nextLine();
        System.out.println("Digite o modelo do carro: ");
        String modelo = leitor.next() + leitor.nextLine();
        System.out.println("Digite o valor do carro: ");
        double valor = leitor.nextDouble();
        System.out.println("É automático? (true or false)");
        boolean automatico = leitor.nextBoolean();
        //Instanciar o carro com os dados
        Carro carro = new Carro(ano, cor, modelo, valor, automatico);
        try{
        //Instanciar o DAO
        CarroDao carroDao = new CarroDao();
        //Chamar o metodo do cadastro do DAO
        carroDao.cadastrar(carro);
        System.out.println("Carro cadastrado com sucesso!");
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
