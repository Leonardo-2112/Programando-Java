package br.com.fiap.veiculo.view;

import br.com.fiap.veiculo.model.Carro;
import br.com.fiap.veiculo.model.Cor;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("1-Cadastrar Carro");
        System.out.println("2-Cadastrar Avião");
        System.out.println("2-Cadastrar Lancha");
        System.out.println("Digite a opção: ");
        int opcao = leitor.nextInt();
        Cor cor = new Cor();
        System.out.println("Digite a cor do Veículo: ");
        cor.setNome(leitor.next() + leitor.nextLine());
        switch (opcao){
            case 1:
                System.out.println("Digite o modelo: ");
                String modelo = leitor.next() + leitor.nextLine();
                System.out.println("Digite a quantidade de lugares: ");
                int quantidadeLugares = leitor.nextInt();
                System.out.println("Digite o comprimento: ");
                double comprimento = leitor.nextDouble();
                System.out.println("Digite o ano de fabricação: ");
                int anoFabricacao = leitor.nextInt();
                System.out.println("Digite a quantidade de portas: ");
                int quantidadePortas = leitor.nextInt();
                System.out.println("Digite a placa: ");
                String placa = leitor.next() + leitor.nextLine();
                System.out.println("Digite a potência do motor(EX: 1.0): ");
                float motor = leitor.nextFloat();
                Carro carro = new Carro(modelo, quantidadeLugares, comprimento, anoFabricacao, cor, quantidadePortas, placa, motor);

                System.out.println("\nModelo: " + carro.getModelo() + "\nQuantidade de Lugares: " + carro.getQuantidadeLugares() + "\nComprimento: " + carro.getComprimento() + "\nAno de Fabricação: " + carro.getAnoFabricacao() + "\nQuantidade de Portas: "+ carro.getQuantidadePortas() + "\nPlaca: " + carro.getPlaca() + "\nPotência do Motor: " + carro.getMotor());
                break;
        }

    }
}
