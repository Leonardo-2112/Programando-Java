package br.com.fiap.locadora.view;

import br.com.fiap.locadora.model.Cliente;
import br.com.fiap.locadora.model.Locacao;
import br.com.fiap.locadora.model.Veiculo;

public class Terminal {
    public static void main(String[] args) {
        // Criando cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Leonardo");
        cliente.setCpf("123.456.789-00");
        cliente.setTelefone("11999999999");

        // Criando veículo
        Veiculo veiculo = new Veiculo();

        // Criando locação
        Locacao locacao = new Locacao();
        locacao.setCliente(cliente);
        locacao.setVeiculo(veiculo);
        locacao.setId(1);

        // Estado inicial
        System.out.println("=== ESTADO INICIAL ===");
        System.out.println("Veículo disponível: " + veiculo.isDisponivel());
        System.out.println("Cliente pode alugar: " + cliente.podeAlugar());

        // Tentando iniciar locação
        System.out.println("\n=== INICIANDO LOCAÇÃO ===");
        boolean iniciou = locacao.iniciarLocacao();

        System.out.println("Locação iniciada? " + iniciou);
        System.out.println("Veículo disponível: " + veiculo.isDisponivel());
        System.out.println("Cliente possui locação: " + cliente.isPossuiLocacao());
        System.out.println("Data início: " + locacao.getDataInicio());

        // Tentando finalizar locação
        System.out.println("\n=== FINALIZANDO LOCAÇÃO ===");
        boolean finalizou = locacao.finalizarLocacao();

        System.out.println("Locação finalizada? " + finalizou);
        System.out.println("Veículo disponível: " + veiculo.isDisponivel());
        System.out.println("Cliente possui locação: " + cliente.isPossuiLocacao());
        System.out.println("Data fim: " + locacao.getDataFim());
    }

}
