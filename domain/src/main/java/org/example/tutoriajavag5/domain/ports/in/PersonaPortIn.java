package org.example.tutoriajavag5.domain.ports.in;

import org.example.tutoriajavag5.domain.dto.PersonaDto;
import org.example.tutoriajavag5.domain.dto.RequestPersona;

public interface PersonaPortIn {
    PersonaDto createPersonaIn(RequestPersona requestPersona);
    PersonaDto findByIdIn(int id);
}
