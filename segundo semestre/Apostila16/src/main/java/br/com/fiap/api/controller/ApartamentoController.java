package br.com.fiap.api.controller;

import br.com.fiap.api.dao.ApartamentoDao;
import br.com.fiap.api.model.Apartamento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/apartamentos")
public class ApartamentoController {
    private ApartamentoDao dao;

    public ApartamentoController(ApartamentoDao dao){
        this.dao = dao;
    }

    @PostMapping
    public ResponseEntity<Apartamento> inserir(@RequestBody Apartamento apartamento, UriComponentsBuilder builder) throws SQLException {

        dao.inserir(apartamento);
        URI uri = builder.path("/apartamentos/{id}").buildAndExpand(apartamento.getId()).toUri();

        return ResponseEntity.created(uri).body(apartamento);
    }

    @GetMapping
    public List<Apartamento> listar(){
        return dao.listar();

    }
}
