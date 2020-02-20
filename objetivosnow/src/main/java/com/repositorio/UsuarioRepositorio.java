package com.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
	
	List<Usuario> BuscaporEstatus(String stat);

}