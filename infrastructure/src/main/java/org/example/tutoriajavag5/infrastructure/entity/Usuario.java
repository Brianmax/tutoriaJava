package org.example.tutoriajavag5.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private int usuarioId;
    private String username;
    private String email;
    private String password;

    @ManyToOne(cascade = CascadeType.ALL)
    private Persona persona;
}
