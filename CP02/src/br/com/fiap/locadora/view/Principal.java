package br.com.fiap.locadora.view;

import br.com.fiap.locadora.model.Cliente;
import br.com.fiap.locadora.model.Locacao;
import br.com.fiap.locadora.model.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
            ArrayList<Cliente> clientes = new ArrayList();
            ArrayList<Veiculo> veiculos = new ArrayList();
            ArrayList<Locacao> locacoes = new ArrayList();
            Scanner leitor = new Scanner(System.in);
            int opcao = 0;

            do {
                System.out.println("\n================================================");
                System.out.println("1-Cadastrar Cliente");
                System.out.println("2-Consultar Clientes");
                System.out.println("3-Cadastrar Veiculo");
                System.out.println("4-Consultar Veiculos");
                System.out.println("5-Alugar Veículo");
                System.out.println("6-Devolver Veículo");
                System.out.println("7-Sair");
                System.out.println("================================================");
                System.out.println("Digite uma opção: ");
                opcao = leitor.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite os dados do cliente para cadastro");
                        System.out.println("Nome: ");
                        String var26 = leitor.next();
                        String nome = var26 + leitor.nextLine();
                        System.out.println("Cpf: ");
                        var26 = leitor.next();
                        String cpf = var26 + leitor.nextLine();
                        System.out.println("Telefone: ");
                        var26 = leitor.next();
                        String telefone = var26 + leitor.nextLine();
                        clientes.add(new Cliente(nome, cpf, telefone));
                        System.out.println("Cliente Inserido com Sucesso!");
                        break;
                    case 2:
                        System.out.println("\n\nClientes Cadastrados:");
                        System.out.println(clientes);
                        break;
                    case 3:
                        System.out.println("Digite os dados do veículo para cadastro:");
                        System.out.println("Modelo: ");
                        String var10000 = leitor.nextLine();
                        String modelo = var10000 + leitor.next();
                        System.out.println("Ano: ");
                        int ano = leitor.nextInt();
                        System.out.println("Cor: ");
                        var10000 = leitor.nextLine();
                        String cor = var10000 + leitor.next();
                        System.out.println("Placa: ");
                        var10000 = leitor.nextLine();
                        String placa = var10000 + leitor.next();
                        System.out.println("Tipo de Veículo: ");
                        var10000 = leitor.next();
                        String tipo = var10000 + leitor.nextLine();
                        veiculos.add(new Veiculo(tipo, cor, placa, ano, modelo));
                        System.out.println("\nVeículo Cadastrado com Sucesso");
                        break;
                    case 4:
                        System.out.println("\nVeículos Cadastrados: ");
                        System.out.println(veiculos);
                        break;
                    case 5:
                        System.out.println("Digite a posição do cliente na lista (começa do zero): ");
                        int iCliente = leitor.nextInt();
                        System.out.println("Digite a posição do veículo na lista (começa do zero): ");
                        int iVeiculo = leitor.nextInt();
                        Cliente c = (Cliente)clientes.get(iCliente);
                        Veiculo v = (Veiculo)veiculos.get(iVeiculo);
                        if (c.isPossuiLocacao()) {
                            System.out.println("Cliente já possui um veículo alugado!");
                        } else if (!v.isDisponivel()) {
                            System.out.println("Veículo já está alugado!");
                        } else {
                            System.out.println("Data início:");
                            String inicio = leitor.next();
                            System.out.println("Data fim:");
                            String fim = leitor.next();
                            locacoes.add(new Locacao(locacoes.size() + 1, c, v, inicio, fim));
                            System.out.println("Locação realizada com sucesso!");
                        }
                        break;
                    case 6:
                        System.out.println("\nLocações ativas:");
                        System.out.println(locacoes);
                        System.out.println("Digite a posição da locação na lista para devolução (começa com 0):");
                        int indiceLocacao = leitor.nextInt();
                        if (indiceLocacao >= 0 && indiceLocacao < locacoes.size()) {
                            Locacao loc = (Locacao)locacoes.get(indiceLocacao);
                            loc.finalizarLocacao();
                            locacoes.remove(indiceLocacao);
                            System.out.println("Veículo devolvido com sucesso!");
                            break;
                        }

                        System.out.println("Índice inválido!");
                        break;
                    case 7:
                        System.out.println("Sindo...");
                        break;
                    default:
                        System.out.println("Opção Inválida! Tente Novamente");
                }
            } while(opcao != 7);

        }
    }


