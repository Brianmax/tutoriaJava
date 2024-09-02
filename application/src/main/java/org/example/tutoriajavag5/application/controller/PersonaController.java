package org.example.tutoriajavag5.application.controller;

import org.example.tutoriajavag5.domain.dto.PersonaDto;
import org.example.tutoriajavag5.domain.dto.RequestPersona;
import org.example.tutoriajavag5.domain.ports.in.PersonaPortIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/persona")
public class PersonaController {
    private final PersonaPortIn personaPortIn;

    public PersonaController(PersonaPortIn personaPortIn)
    {
        this.personaPortIn = personaPortIn;
    }

    @PostMapping("/create")
    public ResponseEntity<PersonaDto> create(@RequestBody RequestPersona requestPersona)
    {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaPortIn.createPersonaIn(requestPersona));
    }
}
