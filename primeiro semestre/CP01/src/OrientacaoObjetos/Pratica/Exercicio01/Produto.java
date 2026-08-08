package OrientacaoObjetos.Pratica.Exercicio01;

import java.text.NumberFormat;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$ %.2f", preco);
        System.out.println("\nQuantidade: " + quantidade);
    }
}
