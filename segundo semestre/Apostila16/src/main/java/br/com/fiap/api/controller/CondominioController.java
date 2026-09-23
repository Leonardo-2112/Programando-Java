package br.com.fiap.api.controller;

import br.com.fiap.api.dao.CondominioDao;
import br.com.fiap.api.model.Condominio;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;

@RestController
@RequestMapping("/condominios")
public class CondominioController {

    private CondominioDao dao;

    public CondominioController(CondominioDao dao){
        this.dao = dao;
    }

    @PostMapping
    public ResponseEntity<Condominio>inserir(@RequestBody Condominio condominio, UriComponentsBuilder uriBuilder) throws SQLException {

        dao.inserir(condominio);
        URI uri = uriBuilder.path("/condominios/{id}").buildAndExpand(condominio.getId()).toUri();

        return ResponseEntity.created(uri).body(condominio);
    }

    @GetMapping("churros")
    public String dizerOla(){
        return "Ola Mundo!";
    }
}
