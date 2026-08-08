package OrientacaoObjetos.Pratica.Exercicio08;

public class Principal {
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.setNome("Camiseta");
        venda.setQuantidade(9);

        venda.vender(10);

    }
}
