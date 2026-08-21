package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avaliacao(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avaliacao(6);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avaliacao(10);

        Serie lost = new Serie("Lost", 2000);

        //Define o tipo da lista como titulo
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista){
            System.out.println(item.getNome());
            //Verifica se o item da lista é do tipo Filme
            if (item instanceof Filme){
                //Converte um item para filme
                Filme filme = (Filme) item;
                System.out.println("Classificação: " +filme.getClassificacao());
            }
        }

    }
}
