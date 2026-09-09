package br.com.fiap.apostila13.dao;

import br.com.fiap.apostila13.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class MontadoraDao {
    private Connection conexao;

    public MontadoraDao() throws SQLException, ClassNotFoundException {
        this.conexao =ConnectionFactory.getConnection();
    }

}
