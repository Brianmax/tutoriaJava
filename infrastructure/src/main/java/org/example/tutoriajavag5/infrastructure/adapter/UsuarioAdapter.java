package org.example.tutoriajavag5.infrastructure.adapter;

import org.example.tutoriajavag5.domain.dto.PersonaDto;
import org.example.tutoriajavag5.domain.dto.UsuarioDto;
import org.example.tutoriajavag5.domain.ports.out.UsuarioPortOut;
import org.example.tutoriajavag5.infrastructure.dao.PersonaDao;
import org.example.tutoriajavag5.infrastructure.dao.UsuarioDao;
import org.example.tutoriajavag5.infrastructure.entity.Persona;
import org.example.tutoriajavag5.infrastructure.entity.Usuario;
import org.example.tutoriajavag5.infrastructure.mapper.UsuarioMapper;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.awt.print.Pageable;
import java.util.Optional;

@Service
public class UsuarioAdapter implements UsuarioPortOut {
    private UsuarioDao usuarioDao;
    private PersonaDao personaDao;
    public UsuarioAdapter(UsuarioDao usuarioDao, PersonaDao personaDao)
    {
        this.usuarioDao = usuarioDao;
        this.personaDao = personaDao;
    }
    @Override
    public UsuarioDto createOut(UsuarioDto usuarioDto) {
        Usuario usuario = UsuarioMapper.usuarioDtoToUsuario(usuarioDto);
        Optional<Persona> personaOptional = personaDao.findById(usuarioDto.getIdPersona());

        if (personaOptional.isPresent())
        {
            usuario.setPersona(personaOptional.get());
            usuarioDao.save(usuario);
            return UsuarioMapper.fromUsuario(usuario);
        }
        return null;
    }
}
