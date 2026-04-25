import java.util.Scanner;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numeroAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }
    void avaliarMusica(double nota){
        avaliacao = avaliacao + nota;
        numeroAvaliacoes++;
    }
    double calcularMediaAvaliacoes(){
        double media = avaliacao/numeroAvaliacoes;
        return media;
    }
}
