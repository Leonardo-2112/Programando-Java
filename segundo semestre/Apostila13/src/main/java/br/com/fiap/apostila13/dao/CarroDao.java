package br.com.fiap.apostila13.dao;

//DAO -> Data Access Object
//Classe responsável por realizar as ações no BD

import br.com.fiap.apostila13.exception.EntidadeNaoEncontradaException;
import br.com.fiap.apostila13.factory.ConnectionFactory;
import br.com.fiap.apostila13.model.Carro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarroDao {

    private Connection conexao;

    public CarroDao() throws SQLException, ClassNotFoundException {
        this.conexao = ConnectionFactory.getConnection();
    }

    //CRUD
    public void cadastrar(Carro carro) throws SQLException{
        //Criar comando sql de insert
        PreparedStatement stmt = conexao.prepareStatement("INSERT INTO tb_carro (id, ano, cor, modelo, valor, automatico) VALUES(sq_tb_carro.NEXTVAL,?,?,?,?,?)");
        //Atribuir os valores do carro(objeto) no comando SQL
        stmt.setInt(1,carro.getAno());
        stmt.setString(2, carro.getCor());
        stmt.setString(3, carro.getModelo());
        stmt.setDouble(4, carro.getValor());
        stmt.setBoolean(5, carro.isAutomatico());
        //Executar o comando SQL
        stmt.executeUpdate();
    }

    public Carro buscarPorID(int id) throws SQLException, EntidadeNaoEncontradaException {
        PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM tb_carro WHERE id = ?");
        stmt.setInt(1, id);
        ResultSet resultSet = stmt.executeQuery();
        //Validar se existe o carro com id pesquisado
        if (!resultSet.next()) {
            throw new EntidadeNaoEncontradaException("Produto não encontrado");
        }
        //Recuperar os dados do Carro do resultado do SQL
        String modelo = resultSet.getString("modelo");
        double valor = resultSet.getDouble("valor");
        int ano = resultSet.getInt("ano");
        String cor = resultSet.getString("cor");
        boolean automatico = resultSet.getBoolean("automatico");

        //Criar o objeto carro com os valores e retornar
        return new Carro(id,ano,cor,modelo,valor, automatico);
    }

    public List<Carro> listar() throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM tb_carro");
        ResultSet resultSet = stmt.executeQuery();
        ArrayList<Carro> carros = new ArrayList<>();

        while (resultSet.next()) {
            //Recuperar os dados do Carro do resultado do SQL
            int id = resultSet.getInt("id");
            String modelo = resultSet.getString("modelo");
            double valor = resultSet.getDouble("valor");
            int ano = resultSet.getInt("ano");
            String cor = resultSet.getString("cor");
            boolean automatico = resultSet.getBoolean("automatico");
            Carro carro = new Carro(id,ano,cor,modelo,valor, automatico);
            carros.add(carro);
        }
        return carros;
    }

    public Carro atualizar(Carro carro) throws SQLException, EntidadeNaoEncontradaException {
        //Criar o PRepareStament com comando SQL
        PreparedStatement stmt = conexao.prepareStatement("UPDATE tb_carro SET ano = ?, cor = ?, modelo = ?, valor = ?, automatico = ? WHERE id = ?");
        //Setar os valores no comando SQL
        stmt.setInt(1,carro.getAno());
        stmt.setString(2, carro.getCor());
        stmt.setString(3, carro.getModelo());
        stmt.setDouble(4, carro.getValor());
        stmt.setBoolean(5, carro.isAutomatico());
        stmt.setInt(6, carro.getId());
        //Executar o comando SQL
        int linhas = stmt.executeUpdate();//Retorna a quantidade de linhas afetadas no BD
        if (linhas==0){
            throw new EntidadeNaoEncontradaException("Carro não encontrado para atualzação!");
        }
        return carro;
    }

    public void deletar(int id) throws SQLException, EntidadeNaoEncontradaException {
        PreparedStatement stmt = conexao.prepareStatement("DELETE FROM tb_carro WHERE id = ?");
        stmt.setInt(1,id);
        int linhas = stmt.executeUpdate();
        //Pega a quantidade de linhas alteradas e vê se houve alteração
        if (linhas == 0){
            throw new EntidadeNaoEncontradaException("Carro não encontrado para excluir!");
        }
    }
}
