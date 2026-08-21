package br.com.fiap.dao;

import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.entities.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDao {

    public Connection minhaConexao;

    //metodo construtor com parametro vazio
    public ProdutoDao() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    //Insert
    public String inserir(Produto produto) throws SQLException {
        //Faz insert no banco
        PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO T_FIAP_PRODUTO VALUES (?,?,?,?)");

        //Passa o valor do atributo da classe para fazer insert na tabela
        stmt.setInt(1, produto.getCodigo());
        stmt.setString(2, produto.getTipo());
        stmt.setString(3, produto.getMarca());
        stmt.setDouble(4, produto.getPreco());
        //Após fazer os Sets executa o Statement
        stmt.execute();
        return "Produto cadastrado com sucesso!";
    }
}
