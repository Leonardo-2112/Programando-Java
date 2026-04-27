package OrientacaoObjetos.Pratica.Exercicio03;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.println("Saldo Atual: " + saldo);
    }
    public double zerarSaldo(){
        return saldo = 0;
    }
}
