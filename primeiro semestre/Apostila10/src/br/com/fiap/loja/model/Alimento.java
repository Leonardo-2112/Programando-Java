package br.com.fiap.loja.model;

public class Alimento extends Produto {
    private String validade;
    private boolean perecivel;

    public Alimento(int id, double preco, String nome) {
        super(id, preco, nome);
        this.validade = validade;
        this.perecivel = perecivel;
    }

    public Alimento(double preco, String nome, boolean perecivel) {
        super(preco, nome);
        this.perecivel = perecivel;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }
}
