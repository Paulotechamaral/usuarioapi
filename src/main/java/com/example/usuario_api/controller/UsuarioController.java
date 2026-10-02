package com.example.usuario_api.controller;

import com.example.usuario_api.dto.UsuarioRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    @PostMapping
    public ResponseEntity<UsuarioRequest> criarUsuario(@Valid @RequestBody UsuarioRequest usuario){

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(usuario);

    }
}
