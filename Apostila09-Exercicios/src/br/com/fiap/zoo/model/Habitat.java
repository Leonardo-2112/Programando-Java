package br.com.fiap.zoo.model;

public class Habitat{
    protected String tipo;
    protected double area;

    public Habitat(String tipo, double area) {
        this.tipo = tipo;
        this.area = area;
    }

    public String getDescricao(){
        return "Tipo: "+ this.tipo + "\nÁrea: " + area;
    }
}
