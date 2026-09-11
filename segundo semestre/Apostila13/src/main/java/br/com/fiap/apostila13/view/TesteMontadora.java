package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.MontadoraDao;
import br.com.fiap.apostila13.model.Montadora;

import java.util.List;
import java.util.Scanner;

public class TesteMontadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        try {
            MontadoraDao montadoraDao = new MontadoraDao();
            do {
                try {
                    System.out.println("\n=================MENU=================");
                    System.out.println("0-Sair");
                    System.out.println("1-Cadastrar Montadora");
                    System.out.println("2-Buscar Montadora Por ID");
                    System.out.println("3-Listar Montadoras");
                    System.out.println("\nEscolha uma opção: ");
                    opcao = leitor.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o nome da montadora: ");
                            String nome = leitor.next() + leitor.nextLine();
                            System.out.println("Digite o cpnj da montadora: ");
                            String cnpj = leitor.next();

                            Montadora montadora = new Montadora(nome, cnpj);
                            montadoraDao.cadastrar(montadora);
                            System.out.println("Montadora cadastrada com sucesso");
                            break;
                        case 2:
                            System.out.println("Digite o id para fazer a busca");
                            int id = leitor.nextInt();
                            System.out.println(montadoraDao.buscarPorId(id));
                            break;
                        case 3:
                            List<Montadora> montadoras = montadoraDao.listar();
                            for (Montadora montadora1 : montadoras){
                                System.out.println(montadora1);
                            }
                            break;
                        case 0:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
            while (opcao != 0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }//main
}





