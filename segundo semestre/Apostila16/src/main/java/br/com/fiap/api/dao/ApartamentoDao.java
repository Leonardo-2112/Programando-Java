package br.com.fiap.api.dao;

import br.com.fiap.api.model.Apartamento;
import br.com.fiap.api.model.Condominio;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ApartamentoDao {
    private final DataSource dataSource;

    private static final String INSERT_SQL = "insert into tb_apartamento (cd_apartamento, nr_area, nr_apartamento, dt_ocupado, st_ocupacao, cd_condominio) values(sq_tb_apartamento.nextval, ?,?,?,?,?)";



    public ApartamentoDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    private Apartamento getApartamento(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("cd_apartamento");
        double area = resultSet.getDouble("nr_apartamento");
        int numeroApartamento = resultSet.getInt("nr_apartamento");
        LocalDate dataOcupacao = resultSet.getObject("dt_ocupacao", LocalDate.class);
        boolean estaOcupado = resultSet.getBoolean("st_ocupado");
        Apartamento ap = new Apartamento();
        ap.setId(id);
        int idCondominio = resultSet.getInt("cd_condominio");

        return new Apartamento(id, area, numeroApartamento, dataOcupacao, estaOcupado, condominio);
    }

    public void inserir(Apartamento ap) throws SQLException {
        try(Connection conexao = dataSource.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(INSERT_SQL, new String[] {"cd_condominio"})){
            stmt.setDouble(1, ap.getArea());
            stmt.setInt(2, ap.getNumeroDoApartamento());
            stmt.setObject(3,ap.getDataOcupacao());
            stmt.setBoolean(4, ap.isEstaOcupado());
            stmt.setInt(5,ap.getCondominio().getId());

            stmt.executeUpdate();
            ResultSet resultSet = stmt.getGeneratedKeys();

            if (resultSet.next()){
                ap.setId(resultSet.getInt(1));
            }
        }
    }
}
