package OrientacaoObjetos.Pratica.Exercicio03;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(1500);
        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
    }
}
