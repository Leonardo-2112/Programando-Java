package br.com.fiap.apostila13.view;

import java.sql.*;

public class Exemplo01 {
    //Conectar no banco de dados
    static void main() {
        try {
            //Registrando o driver do banco de dados
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Retorna conexão com o banco de dados
            Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "RM573982","211207");
            System.out.println("Conectado no banco de dados");

            //Inserir um carro no banco de dados
            Statement stm = conexao.createStatement();
            //Executar um comando sql no banco de dados
            stm.executeUpdate("INSERT INTO tb_carro(id, ano, cor, modelo, valor, automatico) VALUES(2, 2022, 'Vermelho', 'hb20', 70000, 1)");
            System.out.println("Sucesso");
            //Fechar a conexão
            conexao.close();
        }catch (ClassNotFoundException e){
            System.out.println("JDBC não encontrado " + e.getMessage());

        }catch (SQLException e){
            System.out.println("Não foi possível conectar no banco de dados" + e.getMessage());
        }
    }
}
