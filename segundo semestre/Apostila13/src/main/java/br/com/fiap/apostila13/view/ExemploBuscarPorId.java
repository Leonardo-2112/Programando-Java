package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;
import br.com.fiap.apostila13.exception.EntidadeNaoEncontradaException;
import br.com.fiap.apostila13.model.Carro;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploBuscarPorId {
    static void main(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o id do carro para Buscar:");
        int id = leitor.nextInt();
        try {
            CarroDao carroDao = new CarroDao();
            System.out.println(carroDao.buscarPorID(id));


        }catch (InputMismatchException e){
            System.err.println("Número Inválido");
        }catch (SQLException | EntidadeNaoEncontradaException e){
            System.err.println(e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println("Projeto sem JDBC");
        }
    }
}
