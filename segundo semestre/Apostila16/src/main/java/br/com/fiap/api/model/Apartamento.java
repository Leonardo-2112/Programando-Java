package br.com.fiap.api.model;

import java.time.LocalDate;

public class Apartamento {
    private int id;
    private double area;
    private int numeroDoApartamento;
    private LocalDate dataOcupacao;
    private boolean estaOcupado;
    private Condominio condominio;

    //Construtores
    public Apartamento(int id, double area, int numeroDoApartamento, LocalDate dataOcupacao, boolean estaOcupado, Condominio condominio) {
        this.id = id;
        this.area = area;
        this.numeroDoApartamento = numeroDoApartamento;
        this.dataOcupacao = dataOcupacao;
        this.estaOcupado = estaOcupado;
        this.condominio = condominio;
    }

    public Apartamento(double area, int numeroDoApartamento, LocalDate dataOcupacao, boolean estaOcupado, Condominio condominio) {
        this.area = area;
        this.numeroDoApartamento = numeroDoApartamento;
        this.dataOcupacao = dataOcupacao;
        this.estaOcupado = estaOcupado;
        this.condominio = condominio;
    }

    public Apartamento() {
    }

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumeroDoApartamento() {
        return numeroDoApartamento;
    }

    public void setNumeroDoApartamento(int numeroDoApartamento) {
        this.numeroDoApartamento = numeroDoApartamento;
    }

    public LocalDate getDataOcupacao() {
        return dataOcupacao;
    }

    public void setDataOcupacao(LocalDate dataOcupacao) {
        this.dataOcupacao = dataOcupacao;
    }

    public boolean isEstaOcupado() {
        return estaOcupado;
    }

    public void setEstaOcupado(boolean estaOcupado) {
        this.estaOcupado = estaOcupado;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
}
