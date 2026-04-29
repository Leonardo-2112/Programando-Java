package Aula02;

//Crie uma classe ProdutoPerecivel que herde de Produto
public class ProdutoPerecivel extends Produto{

    //Adicione um atributo dataValidade
    private String dataValidade;

    //Crie um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados.
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + "\nPreço: " + getPreco() + "\nQuantidade: " + getQuantidade() + "\nData de Válidade: " + getDataValidade() + "\n\n";
    }
}
