package org.example.tutoriajavag5.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDto {
    private int id;
    private String numDoc;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Boolean estado;
    private Date dateCreated;
    private Date dateMod;
}
