package org.example.tutoriajavag5.infrastructure.dao;

import org.example.tutoriajavag5.infrastructure.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Integer> {
}
