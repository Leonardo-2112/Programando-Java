package br.com.fiap.apostila13.dao;

import br.com.fiap.apostila13.exception.EntidadeNaoEncontradaException;
import br.com.fiap.apostila13.factory.ConnectionFactory;
import br.com.fiap.apostila13.model.Carro;
import br.com.fiap.apostila13.model.Montadora;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MontadoraDao {
    private Connection conexao;

    public MontadoraDao() throws SQLException, ClassNotFoundException {
        this.conexao = ConnectionFactory.getConnection();
    }
    //Monta o objeto montadora com os valores retornados do banco
    public Montadora getMontadora(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String cnpj = resultSet.getString("cnpj");
        String nome = resultSet.getString("nome");
        return new Montadora(id, cnpj,nome);
    }

    public void cadastrar(Montadora montadora) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("INSERT INTO tb_montadora(id, cnpj, nome) VALUES(sq_tb_montadora.NEXTVAL,?,?)", new String[] {"id"});
        stmt.setString(1, montadora.getCnpj());
        stmt.setString(2,montadora.getNome());
        //Executa o comando SQL do PreparedStatement
        stmt.executeUpdate();

        //Recuperar o ID gerado pela sequence
        ResultSet resultSet = stmt.getGeneratedKeys();
        if (resultSet.next()){
            int id = resultSet.getInt(1);
            montadora.setId(id);
        }

    }

    public Montadora buscarPorId(int id) throws SQLException, EntidadeNaoEncontradaException {
        PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM tb_montadora WHERE id = ?");
        stmt.setInt(1,id);
        ResultSet resultSet = stmt.executeQuery();
        //Verifica se retornou algo da pesquisa no BD
        if(!resultSet.next()){
            throw new EntidadeNaoEncontradaException("Entidade não encontrada");
        }
        //Constroi e retorna o objeto java com os dados retornados do banco
        return getMontadora(resultSet);
    }

    public List<Montadora> listar() throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM tb_montadora");
        ResultSet resultSet = stmt.executeQuery();
        ArrayList<Montadora> montadoras = new ArrayList<>();
        //Enquanto tiver uma próxima linha continua adicionando na lista de montadora
        while(resultSet.next()){
            montadoras.add(getMontadora(resultSet));
        }
        return montadoras;
    }


}
