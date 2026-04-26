package br.com.fiap.locadora.model;

import java.util.Scanner;

public class Veiculo {
    //Atributos
    private String modelo;
    private int ano;
    private boolean disponivel = true;
    private String placa;
    private String cor;
    private String tipo;

    //Getters e Setters
    //Modelo
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Ano
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    //Disponível
    public boolean isDisponivel() {
        return disponivel;
    }

    //Placa
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //Cor
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    //Tipo
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Métodos
    //Alugar
    public void alugar(){
        disponivel = false;
    }
    //Devolver
    public void devolver(){
        disponivel = true;
    }
    public void exibirVeiculo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Disponibilidade: " + disponivel);
        System.out.println("Cor: " + cor);
        System.out.println("Tipo: " + tipo);
        System.out.println("Placa: " + placa);
    }
    public void cadastrarVeiculo(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o Modelo: ");
        setModelo(leitor.nextLine());
        System.out.println("Digite o Ano: ");
        setAno(leitor.nextInt());
        System.out.println("Digite a Cor: ");
        setCor(leitor.next() + leitor.nextLine());
        System.out.println("Digite a placa: ");
        setPlaca(leitor.next() + leitor.nextLine());
        System.out.println("Digite o tipo (carro, moto etc): ");
        setTipo(leitor.nextLine());
    }

}
