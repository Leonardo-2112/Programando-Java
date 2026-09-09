package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;
import br.com.fiap.apostila13.model.Carro;

import java.sql.SQLException;
import java.util.Scanner;

public class BuscarPorAno {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro ano da procura");
        int anoMenor = leitor.nextInt();
        System.out.println("Digite o segundo ano da procura");
        int anoMaior = leitor.nextInt();


        try {
            CarroDao carroDao = new CarroDao();
            System.out.println(carroDao.buscarPorAno(anoMenor,anoMaior));
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
