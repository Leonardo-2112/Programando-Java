package br.com.fiap.locadora.model;

public class Veiculo {
    //Atributos
    private String modelo;
    private int ano;
    private boolean disponivel = true;
    private String placa;
    private String cor;
    private String tipo;

    //Construtor
    public Veiculo(String tipo, String cor, String placa, int ano, String modelo) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
    }

    //Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nCor: " + getCor()+ "\nTipo: " +getTipo() + "\nDisponivel: " + isDisponivel() + "\nPlaca: " + getPlaca() + "\n\n";
    }
}
