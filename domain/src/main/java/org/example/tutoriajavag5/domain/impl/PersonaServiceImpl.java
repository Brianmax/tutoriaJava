package org.example.tutoriajavag5.domain.impl;

import lombok.RequiredArgsConstructor;
import org.example.tutoriajavag5.domain.dto.PersonaDto;
import org.example.tutoriajavag5.domain.dto.RequestPersona;
import org.example.tutoriajavag5.domain.ports.in.PersonaPortIn;
import org.example.tutoriajavag5.domain.ports.out.PersonaPortOut;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaPortIn {
    private PersonaPortOut personaPortOut;

    public PersonaServiceImpl(PersonaPortOut personaPortOut)
    {
        this.personaPortOut = personaPortOut;
    }

    @Override
    public PersonaDto createPersonaIn(RequestPersona requestPersona) {
        return personaPortOut.createPersonaOut(requestPersona);
    }

    @Override
    public PersonaDto findByIdIn(int id) {
        return null;
    }
}
