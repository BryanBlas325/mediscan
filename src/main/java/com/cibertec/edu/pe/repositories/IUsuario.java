package com.cibertec.edu.pe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.edu.pe.models.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer> {

}
