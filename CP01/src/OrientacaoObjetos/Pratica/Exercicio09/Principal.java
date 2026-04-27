package OrientacaoObjetos.Pratica.Exercicio09;

public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setTitulo("Dom Casmurro");
        pedido.setDiaAtraso(1);

        pedido.exibirAtraso();
    }
}
