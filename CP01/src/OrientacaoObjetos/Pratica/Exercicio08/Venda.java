package OrientacaoObjetos.Pratica.Exercicio08;

public class Venda {
    private String nome;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void vender(int quantidadeVendida){
        if (quantidadeVendida > quantidade){
            System.out.println("Estoque Insuficiente");
        }else {
            quantidade -= quantidadeVendida;
            System.out.printf("Venda Realizada. Estoque Restante: %s: %d", nome , quantidade);
        }
    }
}
