package br.com.fiap.locadora.view;

import br.com.fiap.locadora.model.Veiculo;

public class Terminal {
    public static void main(String[] args) {
        // Criando objeto
        Veiculo carro = new Veiculo();

        // Definindo valores
        carro.setModelo("Civic");
        carro.setAno(2022);
        carro.setPlaca("ABC-1234");
        carro.setCor("Preto");
        carro.setTipo("Sedan");

        // Exibindo dados iniciais
        System.out.println("=== DADOS DO VEÍCULO ===");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Tipo: " + carro.getTipo());
        System.out.println("Disponível: " + carro.isDisponivel());
        // Veículo já começa como disponível

        // Testando aluguel
        System.out.println("\nAlugando veículo...");
        carro.alugar();
        System.out.println("Disponível após aluguel: " + carro.isDisponivel());

        // Testando devolução
        System.out.println("\nDevolvendo veículo...");
        carro.devolver();
        System.out.println("Disponível após devolução: " + carro.isDisponivel());
    }
}
