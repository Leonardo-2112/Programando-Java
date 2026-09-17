package br.com.fiap.api.dao;

import br.com.fiap.api.model.Condominio;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CondominioDao {
    private final DataSource dataSource;

    public CondominioDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public void inserir(Condominio condominio) throws SQLException {
        String sql = "INSERT INTO tb_condominio(cd_condominio, nm_condominio,ds_bloco) VALUES(sq_tb_condominio.NEXTVAL,?,?)";
        try(Connection conn = dataSource.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql,new String[]{"cd_aluno"})){

            stmt.setString(1,condominio.getNome());
            stmt.setString(2,condominio.getBloco());

            stmt.executeUpdate();

            ResultSet resultSet = stmt.getGeneratedKeys();
            if (resultSet.next()){
                condominio.setId(resultSet.getInt(1));
            }
        }
    }
}


