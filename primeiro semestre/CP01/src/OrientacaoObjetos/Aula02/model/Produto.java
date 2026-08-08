package OrientacaoObjetos.Aula02.model;

public class Produto {
    //Atributos
    private String nome;
    private double preco;

    //Getters e Setters
    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Preço
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Métodos
    public double aplicarDeconto(double descontoPercentual){
        preco = preco - (preco * (descontoPercentual /100));
        return preco;
    }
}
