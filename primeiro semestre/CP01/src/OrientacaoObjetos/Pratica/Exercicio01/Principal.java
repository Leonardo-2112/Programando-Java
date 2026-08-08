package OrientacaoObjetos.Pratica.Exercicio01;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Computador Gamer");
        produto.setPreco(4799.99);
        produto.setQuantidade(1);

        produto.exibirDados();
    }
}
