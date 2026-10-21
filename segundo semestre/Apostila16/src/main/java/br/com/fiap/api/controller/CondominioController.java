package br.com.fiap.api.controller;

import br.com.fiap.api.dao.ApartamentoDao;
import br.com.fiap.api.dao.CondominioDao;
import br.com.fiap.api.dto.CondominioRequestDto;
import br.com.fiap.api.dto.CondominioResponseDto;
import br.com.fiap.api.exception.EntidadeNaoEncontradaException;
import br.com.fiap.api.model.Apartamento;
import br.com.fiap.api.model.Condominio;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/condominios")
public class CondominioController {

    private CondominioDao CondominioDao;
    private ApartamentoDao apartamentoDao;
    private ModelMapper mapper;

    public CondominioController(CondominioDao dao, ApartamentoDao apartamentoDao, ModelMapper mapper){
        this.CondominioDao = dao;
        this.apartamentoDao=apartamentoDao;
        this.mapper= mapper;
    }

    @PostMapping
    public ResponseEntity<CondominioResponseDto>inserir(@Valid @RequestBody CondominioRequestDto condominioDto, UriComponentsBuilder uriBuilder) throws SQLException {

        Condominio condominio = mapper.map(condominioDto,Condominio.class);

        CondominioDao.inserir(condominio);
        URI uri = uriBuilder.path("/condominios/{id}").buildAndExpand(condominio.getId()).toUri();
        return ResponseEntity.created(uri).body(mapper.map(condominio,CondominioResponseDto.class));
    }

    @GetMapping
    public List<CondominioResponseDto>listar() throws SQLException {


        return CondominioDao.listar()
                .stream()
                .map(condominio -> mapper.map(condominio, CondominioResponseDto.class)).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CondominioResponseDto>buscarPorId(@Valid @PathVariable int id) throws EntidadeNaoEncontradaException, SQLException {

        Condominio condominio = CondominioDao.buscarPorId(id);
        return ResponseEntity.ok(mapper.map(condominio,CondominioResponseDto.class));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>remover(@PathVariable int id) throws EntidadeNaoEncontradaException, SQLException {
        CondominioDao.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void>atualizar(@Valid @PathVariable int id, @RequestBody CondominioRequestDto condominiodto) throws EntidadeNaoEncontradaException, SQLException {
        Condominio condominio = mapper.map(condominiodto, Condominio.class);
        condominio.setId(id);
        CondominioDao.atualizar(condominio);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/{id}/apartamentos")
    public List<Apartamento>listarApartamentoPorCondominio(@PathVariable int id) throws SQLException {
        return apartamentoDao.listarApartamentosDoCondominio(id);


    }

    @GetMapping("churros")
    public String dizerOla(){
        return "Ola Mundo!";
    }
}
