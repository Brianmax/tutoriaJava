package org.example.tutoriajavag5.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "persona_id")
    private int id;

    @Column(name = "num_doc")
    private String numDoc;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellido_pat")
    private String apellidoPaterno;

    @Column(name = "apellido_mat")
    private String apellidoMaterno;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "date_mod")
    private Date dateMod;
}
