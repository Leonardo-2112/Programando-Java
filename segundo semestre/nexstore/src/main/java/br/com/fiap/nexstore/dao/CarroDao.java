package br.com.fiap.nexstore.dao;

//DAO -> Data Access Object
//Classe responsável por realizar as ações no BD

import br.com.fiap.nexstore.model.Carro;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarroDao {

    private final DataSource dataSource;

    private Connection conexao;

    public CarroDao(DataSource dataSource) throws SQLException {
        this.dataSource = dataSource;
        conexao = dataSource.getConnection();
    }

    private static Carro getCarro(ResultSet resultSet) throws SQLException {
        String modelo = resultSet.getString("modelo");
        double valor = resultSet.getDouble("valor");
        int ano = resultSet.getInt("ano");
        String cor = resultSet.getString("cor");
        boolean automatico = resultSet.getBoolean("automatico");
        int id = resultSet.getInt("id");

        //Criar o objeto carro com os valores e retornar
        return new Carro(id, ano, cor, modelo, valor, automatico);
    }

    public List<Carro> listar() throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM tb_carro");
        ResultSet resultSet = stmt.executeQuery();
        ArrayList<Carro> carros = new ArrayList<>();

        while (resultSet.next()) {
            //Recuperar os dados do Carro do resultado do SQL
            carros.add(getCarro(resultSet));
        }
        return carros;
    }
}