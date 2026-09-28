package br.com.fiap.api.controller;

import br.com.fiap.api.dao.CondominioDao;
import br.com.fiap.api.exception.EntidadeNaoEncontradaException;
import br.com.fiap.api.model.Condominio;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

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

    @GetMapping
    public List<Condominio>listar() throws SQLException {
        return dao.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Condominio>buscarPorId(@PathVariable int id) throws EntidadeNaoEncontradaException, SQLException {
        Condominio condominio = dao.buscarPorId(id);
        return ResponseEntity.ok(condominio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>remover(@PathVariable int id) throws EntidadeNaoEncontradaException, SQLException {
        dao.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void>atualizar(@PathVariable int id, @RequestBody Condominio condominio) throws EntidadeNaoEncontradaException, SQLException {
        condominio.setId(id);
        dao.atualizar(condominio);
        return ResponseEntity.ok().build();
    }

    @GetMapping("churros")
    public String dizerOla(){
        return "Ola Mundo!";
    }
}
