package br.com.fiap.loja.model;

public class Eletronico extends Produto{
    private  boolean garantia;
    private String voltagem;

    public Eletronico(int id, double preco, String nome, boolean garantia, String voltagem) {
        super(id, preco, nome);
        this.garantia = garantia;
        this.voltagem = voltagem;
    }

    public Eletronico(double preco, String nome, boolean garantia) {
        super(preco, nome);
        this.garantia = garantia;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }
}
