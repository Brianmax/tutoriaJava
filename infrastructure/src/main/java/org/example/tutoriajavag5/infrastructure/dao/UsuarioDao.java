package org.example.tutoriajavag5.infrastructure.dao;

import org.example.tutoriajavag5.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {
}
