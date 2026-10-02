package com.example.usuario_api.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class UsuarioRequest {

    @NotNull(message = "O nome nao pode ficar vazio!")
    @Size(min = 3, message = "O nome deve possuir no mínimo 3 caracteres!")

    private String nome;

    @NotNull(message = "A idade não pode ficar vazia!")
    @Positive(message = "A idade deve ser um valor positivo")

    private Integer idade;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
