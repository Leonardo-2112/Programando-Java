package OrientacaoObjetos.Pratica.Exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Teclado Gamer");
        p1.setPreco(299);
        p1.setQuantidade(1);

        Produto p2 = new Produto();
        p2.setNome("Monitor Gamer");
        p2.setPreco(1500);
        p2.setQuantidade(1);

        List<Produto> produtos =new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);

        double totalCompra = 0;
        for (Produto p : produtos){
            totalCompra += p.calcularValorTotal();
        }
        System.out.println("Valor Total da Compra: R$ " + totalCompra);
    }
}
