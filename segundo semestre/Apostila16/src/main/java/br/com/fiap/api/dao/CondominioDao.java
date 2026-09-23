package br.com.fiap.api.dao;

import br.com.fiap.api.exception.EntidadeNaoEncontradaException;
import br.com.fiap.api.model.Condominio;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CondominioDao {
    private final DataSource dataSource;
    private final String select_sql = "select * from tb_condominio";
    private final String insert_sql = "INSERT INTO tb_condominio(cd_condominio, nm_condominio,ds_bloco) VALUES(sq_tb_condominio.NEXTVAL,?,?)";
    private final String buscar_por_id_sql = "select * from tb_condominio where cd_condominio = ?";
    public CondominioDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    private Condominio getCondominio(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("cd_condominio");
        String nome = resultSet.getString("nm_condominio");
        String bloco = resultSet.getString("ds_bloco");
        return new Condominio(id, nome, bloco);
    }

    public void inserir(Condominio condominio) throws SQLException {
        try(Connection conn = dataSource.getConnection(); PreparedStatement stmt = conn.prepareStatement(insert_sql,new String[]{"cd_condominio"})){

            stmt.setString(1,condominio.getNome());
            stmt.setString(2,condominio.getBloco());

            stmt.executeUpdate();

            ResultSet resultSet = stmt.getGeneratedKeys();
            if (resultSet.next()){
                condominio.setId(resultSet.getInt(1));
            }
        }
    }
    public List<Condominio> listar() throws SQLException {
        try(Connection conexao = dataSource.getConnection(); PreparedStatement stmt = conexao.prepareStatement(select_sql)){
            ResultSet resultSet = stmt.executeQuery();
            List<Condominio> lista = new ArrayList<>();
            while (resultSet.next()){
                lista.add(getCondominio(resultSet));
            }
            return lista;
        }
    }

    public Condominio buscarPorId(int id) throws SQLException, EntidadeNaoEncontradaException {
        try(Connection conexao = dataSource.getConnection(); PreparedStatement stmt = conexao.prepareStatement(buscar_por_id_sql)){
            stmt.setInt(1,id);

            ResultSet resultSet = stmt.executeQuery();
            if(!resultSet.next()){
                throw new EntidadeNaoEncontradaException("Condomínio não encontrado");
            }
            return getCondominio(resultSet);
        }
    }

}


