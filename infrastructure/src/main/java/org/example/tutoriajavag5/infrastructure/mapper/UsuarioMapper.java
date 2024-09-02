package org.example.tutoriajavag5.infrastructure.mapper;

import org.example.tutoriajavag5.domain.dto.PersonaDto;
import org.example.tutoriajavag5.domain.dto.UsuarioDto;
import org.example.tutoriajavag5.infrastructure.entity.Persona;
import org.example.tutoriajavag5.infrastructure.entity.Usuario;

public class UsuarioMapper {
    public static Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto)
    {
        return new Usuario(0,
                usuarioDto.getUsername(),
                usuarioDto.getEmail(),
                usuarioDto.getPassword(),
                null);
    }

    public static UsuarioDto fromUsuario(Usuario usuario)
    {
        return new UsuarioDto(
                usuario.getUsername(),
                usuario.getEmail(),
                usuario.getPassword(),
                usuario.getPersona().getId());
    }
}
