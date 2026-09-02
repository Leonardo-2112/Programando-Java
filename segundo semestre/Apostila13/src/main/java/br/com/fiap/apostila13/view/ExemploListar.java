package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;
import br.com.fiap.apostila13.exception.EntidadeNaoEncontradaException;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploListar {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        try {
            CarroDao carroDao = new CarroDao();
            System.out.println(carroDao.listar());
        }catch (SQLException e){
        System.err.println(e.getMessage());
        }catch (ClassNotFoundException e){
        System.err.println("Projeto sem JDBC");
        }
    }

}
