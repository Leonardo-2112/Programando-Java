package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;
import br.com.fiap.apostila13.model.Carro;

import java.sql.SQLException;
import java.util.Scanner;

public class ExemploAtualizacao {
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
            //Pedir para o usuário os dados do carro
            System.out.println("Digite o id do carro desejado para atualizar: ");
            int id = leitor.nextInt();
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

            Carro carro = new Carro(id, ano, cor, modelo, valor, automatico);
            CarroDao carroDao = new CarroDao();
            carroDao.atualizar(carro);
            System.out.println("Carro Atualizado");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
