package br.com.fiap.locadora.model;

public class Locacao {
    //Atributos
    private Cliente cliente;
    private Veiculo veiculo;
    private String dataInicio;
    private String dataFim;
    private int id;

    //Getters e Setters
    //Cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Veiculo
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    //Data de Início
    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    //Data de Fim
    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    //Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Métodos
    public boolean iniciarLocacao() {
        if (veiculo.isDisponivel() && !cliente.isPossuiLocacao()) {
            setDataInicio("12/10/2026");
            veiculo.alugar();
            cliente.alugarVeiculo();
            return true;
        } else {
            return false;
        }
    }
    public boolean finalizarLocacao(){
        if (!veiculo.isDisponivel() && cliente.isPossuiLocacao()){
            setDataFim("20/10/2026");
            veiculo.devolver();
            cliente.devolverVeiculo();
            return true;
        }else {
            return false;
        }
    }
}
