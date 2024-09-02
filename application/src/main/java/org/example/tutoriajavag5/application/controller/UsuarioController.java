package org.example.tutoriajavag5.application.controller;

import org.example.tutoriajavag5.domain.dto.UsuarioDto;
import org.example.tutoriajavag5.domain.ports.in.UsuarioPortIn;
import org.example.tutoriajavag5.infrastructure.entity.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    private UsuarioPortIn usuarioPortIn;

    public UsuarioController(UsuarioPortIn usuarioPortIn)
    {
        this.usuarioPortIn = usuarioPortIn;
    }

    @PostMapping("/create")
    public ResponseEntity<UsuarioDto> create(@RequestBody UsuarioDto usuarioDto)
    {
        return ResponseEntity.ok(usuarioPortIn.createIn(usuarioDto));
    }

}
