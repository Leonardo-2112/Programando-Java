package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;

import java.util.Scanner;

public class ExemploDeletar {
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o id do carro para excluir: ");
            int id = leitor.nextInt();

            CarroDao carroDao = new CarroDao();
            carroDao.deletar(id);
            System.out.println("Carro excluido com sucesso!");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
