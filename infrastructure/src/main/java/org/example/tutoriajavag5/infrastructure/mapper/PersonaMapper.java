package org.example.tutoriajavag5.infrastructure.mapper;

import lombok.Getter;
import lombok.Setter;
import org.example.tutoriajavag5.domain.dto.PersonaDto;
import org.example.tutoriajavag5.infrastructure.dao.PersonaDao;
import org.example.tutoriajavag5.infrastructure.entity.Persona;

@Getter
@Setter
public class PersonaMapper {
    public static PersonaDto personaToPersonaDto(Persona persona)
    {
        return new PersonaDto(persona.getId(),
                persona.getNumDoc(),
                persona.getNombres(),
                persona.getApellidoPaterno(),
                persona.getApellidoMaterno(),
                persona.getEstado(),
                persona.getDateCreated(),
                persona.getDateMod());
    }
}
