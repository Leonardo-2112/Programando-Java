package br.com.fiap.view;

import java.util.HashMap;
import java.util.Map;

public class Exemplo04 {
    public static void main(String[] args) {
        //Criar um mapa de armario (numero do armario(Integer), conteúdo/valor do armario(String))
        Map<Integer, String> armario = new HashMap<>();

        //Adicionar roupas no armario
        armario.put(1, "Camisa Preta");
        armario.put(5, "Calça Jeans");
        armario.put(12, "Jaqueta de Couro");

        //Recuperar o valor da chave 5
        System.out.println("Elemento da chave 5: "+ armario.get(5));

        //Recuperar o valor da chave 10
        System.out.println("Elemento da chave 10: " + armario.get(10));

        //Sobreescever valor na chave 12
        armario.put(12, "Camiseta Social");

        //Exibir quantidade de elementos no mapa
        System.out.println("Quantidade de elementos: " + armario.size());

        //Exibir todas as chaves e valores do mapa
        armario.forEach((chave,valor) ->
                System.out.println("Armário: "+chave+ ", conteúdo do armário: " + valor));
    }
}
