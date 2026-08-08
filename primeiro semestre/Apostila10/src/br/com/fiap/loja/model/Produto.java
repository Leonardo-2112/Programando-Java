package br.com.fiap.loja.model;

import java.util.Objects;

public class Produto {
    private int id;
    protected double preco;
    private String nome;

    public Produto(int id, double preco, String nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nPreço: R$" + preco;
    }

    //Retorna o preço com 10% de desconto
    public double calcularDesconto(){
        return preco * 0.9;
    }


    //Retorna o preço do produto com o desconto]
    public double calcularDesconto(int porcentagem){
        return preco - (preco * porcentagem /100);
    }
    //Retorna o preço com o desconto de acordo com o cupom
    public double calcularDesconto(String cupom){
        if (Objects.equals(cupom, "FIAP15")){
            return calcularDesconto(15);
        } else if (Objects.equals(cupom, "FIAP30")) {
            return calcularDesconto(30);
        }else {
            System.out.println("Cupom não Aplicado ou Indisponível");
            return preco;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
