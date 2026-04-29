package Aula02;
//Crie uma classe Produto com atributos como nome, preco, e quantidade
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    //Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

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

    //Implemente o metodo toString() na classe Produto para retornar uma representação em texto do objeto.
    @Override
    public String toString() {
        return "\nNome do Produto: " + getNome() + "\nPreço: R$" + getPreco() + "\nQuantidade: " +getQuantidade() + "\n\n";
    }
}
