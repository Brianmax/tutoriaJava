package org.example.tutoriajavag5.domain.ports.out;

import org.example.tutoriajavag5.domain.dto.UsuarioDto;

public interface UsuarioPortOut {
    UsuarioDto createOut(UsuarioDto usuarioDto);
}
