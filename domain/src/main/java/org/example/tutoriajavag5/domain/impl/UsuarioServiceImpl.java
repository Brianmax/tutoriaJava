package org.example.tutoriajavag5.domain.impl;

import org.example.tutoriajavag5.domain.dto.UsuarioDto;
import org.example.tutoriajavag5.domain.ports.in.UsuarioPortIn;
import org.example.tutoriajavag5.domain.ports.out.UsuarioPortOut;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioPortIn {

    private UsuarioPortOut usuarioPortOut;

    public UsuarioServiceImpl(UsuarioPortOut usuarioPortOut)
    {
        this.usuarioPortOut = usuarioPortOut;
    }
    @Override
    public UsuarioDto createIn(UsuarioDto usuarioDto) {
        return usuarioPortOut.createOut(usuarioDto);
    }
}
