package OrientacaoObjetos.Pratica.Exercicio09;

public class Pedido {
    private String titulo;
    public int diaAtraso;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDiaAtraso() {
        return diaAtraso;
    }

    public void setDiaAtraso(int diaAtraso) {
        this.diaAtraso = diaAtraso;
    }

    public double cobrarAtraso(){
        double valorAtraso = diaAtraso*2.50;
        return valorAtraso;
    }
    public void exibirAtraso(){
        System.out.println("Titulo: "+ titulo);
        if (diaAtraso>=1) {
            System.out.println("Dias de Atraso: " + diaAtraso);
            System.out.println("Total a Pagar de Multa: R$ " + cobrarAtraso());
        }else {
            System.out.println("Titulo: "+titulo);
            System.out.println("Sem Valor de Multa a Pagar");
        }
    }
}
