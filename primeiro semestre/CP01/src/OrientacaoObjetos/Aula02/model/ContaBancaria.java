package OrientacaoObjetos.Aula02.model;

public class ContaBancaria {
    //Atributos
    private int numeroConta;
    private double saldo;
    public String titular;

    //Getters e Setters
    //Numero da Conta
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    //Saldo
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
