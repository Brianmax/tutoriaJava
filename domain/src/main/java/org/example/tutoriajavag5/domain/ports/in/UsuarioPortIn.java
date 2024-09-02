package org.example.tutoriajavag5.domain.ports.in;

import org.example.tutoriajavag5.domain.dto.UsuarioDto;

public interface UsuarioPortIn {
    UsuarioDto createIn(UsuarioDto usuarioDto);
}
