package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    //Atributos
    private int tempoTotal = 0;

    //Getters e Setters
    public int getTempoTotal() {
        return this.tempoTotal;
    }

    //Métodos
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
