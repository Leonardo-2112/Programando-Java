package br.com.fiap.api.controller;

import br.com.fiap.api.dao.ApartamentoDao;
import br.com.fiap.api.dto.ApartamentoRequestDto;
import br.com.fiap.api.dto.ApartamentoResponseDto;
import br.com.fiap.api.dto.CondominioResponseDto;
import br.com.fiap.api.exception.EntidadeNaoEncontradaException;
import br.com.fiap.api.model.Apartamento;
import br.com.fiap.api.model.Condominio;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("apartamentos")
public class ApartamentoController {

    private ApartamentoDao apartamentoDao;
    private ModelMapper mapper;

    public ApartamentoController(ApartamentoDao apartamentoDao, ModelMapper mapper) {
        this.apartamentoDao = apartamentoDao;
        this.mapper = mapper;
    }


    @GetMapping
    public List<ApartamentoResponseDto> listar() throws SQLException {
        return apartamentoDao.listar()
                .stream()
                .map(apartamento -> mapper.map(apartamento, ApartamentoResponseDto.class)).toList();
    }

    @PostMapping
    public ResponseEntity<ApartamentoResponseDto> cadastrar(@RequestBody ApartamentoRequestDto dto,
                                                 UriComponentsBuilder builder) throws SQLException {
        Apartamento apartamento = mapper.map(dto, Apartamento.class);

        apartamentoDao.cadastrar(apartamento);
        URI uri = builder.path("/apartamentos/{id}").buildAndExpand(apartamento.getId()).toUri();
        return ResponseEntity.created(uri).body(mapper.map(apartamento, ApartamentoResponseDto.class));
    }

}