package br.com.fiap.locadora.model;

import java.util.ArrayList;

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
    //Altera o atributo de cliente e veiculo deixando-os disponiveis
    public void finalizarLocacao() {
        this.cliente.setPossuiLocacao(false);
        this.veiculo.setDisponivel(true);
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nCliente: " + cliente.getNome() + "\nVeículo: " + veiculo.getModelo() + "\nData Início: " + dataInicio + "\nData Fim: " + dataFim + "\n\n";
    }
    //Verifica se há Clientes ou Veiculos na lista
    public static boolean verificarCadastro(ArrayList<Cliente> clientes, ArrayList<Veiculo> veiculos) {
        if (clientes.isEmpty() || veiculos.isEmpty()) {
            System.out.println("É necessário ter pelo menos 1 cliente e 1 veículo cadastrados para realizar uma locação.");
            return false;
        }
        return true;
    }
    //Verifica se há valor no indice escolhido pelo cliente (tanto em veículo e cliente)
    public static boolean indicesValidos(int iCliente, int iVeiculo, ArrayList<Cliente> clientes, ArrayList<Veiculo> veiculos) {
        if (iCliente < 0 || iCliente >= clientes.size()) {
            System.out.println("Cliente inválido!");
            return false;
        }
        if (iVeiculo < 0 || iVeiculo >= veiculos.size()) {
            System.out.println("Veículo inválido!");
            return false;
        }
        return true;
    }
    //Verifica se o indice digitado pelo cliente tem algum valor
    public static boolean indiceLocacaoValido(int indice, ArrayList<Locacao> locacoes) {
        if (locacoes.isEmpty()) {
            System.out.println("Não há locações ativas!");
            return false;
        }
        if (indice < 0 || indice >= locacoes.size()) {
            System.out.println("Índice inválido!");
            return false;
        }
        return true;
    }
}



