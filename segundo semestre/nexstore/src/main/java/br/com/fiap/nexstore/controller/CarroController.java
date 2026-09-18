package br.com.fiap.nexstore.controller;

import br.com.fiap.nexstore.dao.CarroDao;
import br.com.fiap.nexstore.model.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class CarroController{

    //
    @Autowired
    private CarroDao carroDao;

    @GetMapping("/carros")
    public ResponseEntity<List<Carro>> get() throws SQLException {
        List<Carro> carros = carroDao.listar();
        return ResponseEntity.ok(carros);
    }
}

