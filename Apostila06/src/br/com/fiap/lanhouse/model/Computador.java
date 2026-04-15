package br.com.fiap.lanhouse.model;

public class Computador {
    private String processador;
    private int id;
    private String placaVideo;
    private double armazenamento;
    private boolean possuiSsd;
    private int memoriaRam;

    public Computador(String processador, int id){
        this.processador = processador;
        this.id = id;
    }

    public Computador(String processador, int id, String placaVideo, double armazenamento, boolean possuiSsd, int memoriaRam){
        this(processador, id);
        this.id = id;
        this.placaVideo = placaVideo;
        this.armazenamento = armazenamento;
        this.possuiSsd = possuiSsd;
        this.memoriaRam = memoriaRam;
    }
    //Processador
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    //ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Placa de video
    public String getPlacaVideo() {
        return placaVideo;
    }
    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    //Armazenamento
    public double getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }
    //Possui Ssd
    public boolean isPossuiSsd() {
        return possuiSsd;
    }
    public void setPossuiSsd(boolean possuiSsd) {
        this.possuiSsd = possuiSsd;
    }

    //Memória Ram
    public int getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }





}
