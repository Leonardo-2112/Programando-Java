package br.com.fiap.api.dto;

import jakarta.validation.constraints.*;

public class CondominioRequestDto {

    private int id;

    @NotBlank(message = "Nome é obrigatório")
    @Size(max = 20, message = "Máximo de 20 caracteres")
    private String nome;

    @NotBlank(message = "Bloco é obrigatório")
    @Size(min = 2,max = 5, message = "Mínimo de 2 e máximo de 5 caracterers")
    private String bloco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
