package OrientacaoObjetos.Pratica.Exercicio04;

public class Estufa {
    private String local;
    private double temperaturaAtual;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public void exibirDados(){
        System.out.println("Local: " + local);
        System.out.printf("Temperatura Atual: %.1f C°", temperaturaAtual);
        if (temperaturaAtual>37.5){
            System.out.println("\nALERTA!: Temperatura Acima do Limite");
        }
    }
}
