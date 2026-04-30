package br.com.fiap.locadora.model;

public class Locacao {
    //Atributos
    private Cliente cliente;
    private Veiculo veiculo;
    private String dataInicio;
    private String dataFim;
    private int id;

    // Construtor
    public Locacao(int id, Cliente cliente, Veiculo veiculo, String dataInicio, String dataFim) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;

        // Muda status do cliente e do veículo
        cliente.setPossuiLocacao(true);
        veiculo.setDisponivel(false);
    }

    // Getters
    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }
    //Métodos
    public void iniciarLocacao() {
        this.cliente.setPossuiLocacao(true);
        this.veiculo.setDisponivel(false);
    }

    public void finalizarLocacao() {
        this.cliente.setPossuiLocacao(false);
        this.veiculo.setDisponivel(true);
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nCliente: " + cliente.getNome() + "\nVeículo: " + veiculo.getModelo() + "\nData Início: " + dataInicio + "\nData Fim: " + dataFim + "\n\n";
    }
}



