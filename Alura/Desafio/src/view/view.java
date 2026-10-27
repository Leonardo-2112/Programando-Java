package view;

import model.CartaoDeCredito;
import model.Compra;

import java.util.Scanner;

public class view {
    static void main() {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite o valor de limite do cartão:");
        double limiteInput = leitor.nextDouble();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limiteInput);

        int opcao;
        do {
            System.out.println("Digite o a descrição da compra: ");
            String descricaoInput = leitor.next() + leitor.nextLine();

            System.out.println("Digite o valor da compra(R$): ");
            double valorInput= leitor.nextDouble();

            Compra compra = new Compra(descricaoInput, valorInput);
            boolean compraRealizada = cartaoDeCredito.lancaCompra(compra);
            if (compraRealizada) {
                System.out.println("Compra realizada");
            }else {
                System.out.println("Limite do cartão insuficiente!");
            }
            System.out.println("Digite 1 para continuar comprando ou 0 para sair");
            opcao = leitor.nextInt();
        }while(opcao == 1);

        System.out.println("\nCOMPRAS REALIZADAS:");
        for (Compra c : cartaoDeCredito.getCompras()){
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("*****************************");
        System.out.println("\nSaldo no cartão: "  + cartaoDeCredito.getSaldo());

    }
}
