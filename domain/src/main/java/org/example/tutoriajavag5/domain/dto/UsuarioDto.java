package org.example.tutoriajavag5.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsuarioDto {
    private String username;
    private String email;
    private String password;
    private int idPersona;
}
