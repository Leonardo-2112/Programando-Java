public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
    int calcularIdade(int anoAtual){
        int idadeCarro = anoAtual - ano;
        return idadeCarro;
    }
}
