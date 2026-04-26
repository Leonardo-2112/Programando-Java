package br.com.fiap.locadora.view;

import br.com.fiap.locadora.model.Cliente;
import br.com.fiap.locadora.model.Locacao;
import br.com.fiap.locadora.model.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Veiculo veiculo = new Veiculo();
        Locacao locacao = new Locacao();
        Scanner leitor = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1-Cadastrar Veículo");
            System.out.println("2-Cadastrar Cliente");
            System.out.println("3-Alugar Veículo");
            System.out.println("4-Devolver Veículo");
            System.out.println("5-Consultar Veículo");
            System.out.println("6-Sair");
            System.out.print("Digite a Opção Desejada: ");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    veiculo.cadastrarVeiculo();
                    System.out.println("Veículo cadastrado!");
                    break;
                case 2:
                    cliente.cadastrarCliente();
                    System.out.println("Cliente cadastrado!");
                    break;
                case 3:
                    //Valida para que tenha cliente e veiculo cadastrados
                    if (cliente.getNome() == null || veiculo.getModelo() == null) {
                        System.out.println("Cadastre cliente e veículo primeiro!");
                        break;
                    }
                    locacao.setCliente(cliente);
                    locacao.setVeiculo(veiculo);
                    System.out.print("Digite a data de início: ");
                    String dataInicio = leitor.next() + leitor.nextLine();
                    //Verifica se o metodo retorna verdadeiro
                    if (locacao.iniciarLocacao(dataInicio)) {
                        System.out.println("Veículo alugado!");
                    } else {
                        System.out.println("Não foi possível alugar!");
                    }
                    break;
                case 4:
                    System.out.print("Digite a data de devolução: ");
                    String dataFim = leitor.next() + leitor.nextLine();
                    //Verifica se o metodo retorna verdadeiro
                    if (locacao.finalizarLocacao(dataFim)) {
                        System.out.println("Devolvido com sucesso!");
                    } else {
                        System.out.println("Erro ao devolver!");
                    }
                    break;
                case 5:
                    if (veiculo.getModelo() != null) {
                        veiculo.exibirVeiculo();
                    } else {
                        System.out.println("Nenhum veículo cadastrado!");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

    }

}
