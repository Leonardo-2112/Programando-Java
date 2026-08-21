package br.com.fiap.main;

import br.com.fiap.dao.ProdutoDao;
import br.com.fiap.entities.Produto;

import java.sql.SQLException;

public class TesteInserirProduto {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ProdutoDao dao = new ProdutoDao();
        Produto objProduto = new Produto();
        objProduto.setCodigo(1);
        objProduto.setTipo("Mouse");
        objProduto.setMarca("Red Dragon");
        objProduto.setPreco(160.00);

        System.out.println(dao.inserir(objProduto));
    }
}
