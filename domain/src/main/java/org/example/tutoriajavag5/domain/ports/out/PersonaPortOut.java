package org.example.tutoriajavag5.domain.ports.out;

import org.example.tutoriajavag5.domain.dto.PersonaDto;
import org.example.tutoriajavag5.domain.dto.RequestPersona;

public interface PersonaPortOut {
    PersonaDto createPersonaOut(RequestPersona requestPersona);
    PersonaDto findByIdOut(int id);
}
