package com.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.modelo.Usuario;
import com.repositorio.UsuarioRepositorio;

@Service("usuarioServicio")
public class UsuarioServicioImpl implements UsuarioServicio {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Override
	public List<Usuario> BuscaTodosActivos() {
		
		List<Usuario> lis = usuarioRepositorio.BuscaporEstatus("0");
		
		return lis;
	}
}