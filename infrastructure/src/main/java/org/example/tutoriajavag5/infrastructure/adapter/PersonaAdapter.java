package org.example.tutoriajavag5.infrastructure.adapter;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.tutoriajavag5.domain.dto.PersonaDto;
import org.example.tutoriajavag5.domain.dto.RequestPersona;
import org.example.tutoriajavag5.domain.ports.out.PersonaPortOut;
import org.example.tutoriajavag5.domain.response.ResponseReniec;
import org.example.tutoriajavag5.infrastructure.dao.PersonaDao;
import org.example.tutoriajavag5.infrastructure.entity.Persona;
import org.example.tutoriajavag5.infrastructure.mapper.PersonaMapper;
import org.example.tutoriajavag5.infrastructure.rest.ReniecClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonaAdapter implements PersonaPortOut {
    @Autowired
    private PersonaDao personaDao;
    @Autowired
    private ReniecClient reniecClient;
    @Value("${api.token}")
    private String token;
    @Override
    public PersonaDto createPersonaOut(RequestPersona requestPersona) {
        try {
            ResponseReniec responseReniec = reniecClient.getInfoReniec(requestPersona.getDni(), token);
            Persona persona = new Persona();
            persona.setNumDoc(responseReniec.getNumeroDocumento());
            persona.setNombres(responseReniec.getNombres());
            persona.setApellidoPaterno(responseReniec.getApellidoPaterno());
            persona.setApellidoMaterno(responseReniec.getApellidoMaterno());
            persona.setEstado(true);
            persona.setDateCreated(new Date());

            Persona personaBd = personaDao.save(persona);
            PersonaDto personaDto = PersonaMapper.personaToPersonaDto(personaBd);
            return personaDto;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public PersonaDto findByIdOut(int id) {
        return null;
    }
}
