import java.util.Scanner;

public class DesafioConta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Leonardo Afonço";
        double saldo = 1000;
        int opcaoEntrada;
        System.out.println("Olá, " + nome + "\nSaldo Atual: "+ saldo);


        do {
            System.out.println("1-Consultar Saldo");
            System.out.println("2-Receber Valor");
            System.out.println("3-Transferir Valor");
            System.out.println("4-Sair");

            System.out.println("Digite a opção desejada: ");
            opcaoEntrada = leitor.nextInt();
            switch (opcaoEntrada){
                case 1:
                    System.out.println("Saldo Atual: R$" + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja receber: ");
                    double valorRecebido = leitor.nextDouble();
                    saldo = saldo + valorRecebido;
                    System.out.println("Saldo Atual: R$" + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    double valorTransferido = leitor.nextDouble();
                    if (valorTransferido <0 || valorTransferido > saldo){
                        System.out.println("Operação Mal-Sucedida!! Saldo Ínvalido\nSaldo Atual: R$" + saldo);
                    }else {
                        saldo = saldo - valorTransferido;
                        System.out.println("Transferência Realizada\nSaldo Atual: R$ " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }while (opcaoEntrada != 4);
    }
}
