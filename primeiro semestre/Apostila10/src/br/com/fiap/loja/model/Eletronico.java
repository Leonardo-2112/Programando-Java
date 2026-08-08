package br.com.fiap.loja.model;

public class Eletronico extends Produto{
    private  boolean garantia;
    private String voltagem;

    public Eletronico(int id, double preco, String nome, boolean garantia, String voltagem) {
        super(id, preco, nome);
        this.garantia = garantia;
        this.voltagem = voltagem;
    }
    //Sobreescrita do metodo de calcular desconto
    @Override
    public double calcularDesconto() {
        return preco * 0.80;
    }

    @Override
    public double calcularDesconto(String cupom) {
        if (cupom.equals("ELET40"))
            return calcularDesconto(40);
        return super.calcularDesconto(cupom);
    }

    @Override
    public String toString() {

        return super.toString() + "\nGarantia: " + garantia + "\nVoltagem: " + voltagem + "v";
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
