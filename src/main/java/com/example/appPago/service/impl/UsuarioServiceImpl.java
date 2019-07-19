package com.example.appPago.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.appPago.commons.ReqUsuario;
import com.example.appPago.model.entity.Usuario;
import com.example.appPago.repository.UsuarioRepository;
import com.example.appPago.service.UsuarioService;

@Service(value="usuarioServiceImpl")
@Transactional
public class UsuarioServiceImpl implements UsuarioService{
	
	private static final Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	@Qualifier("usuarioRepository")
	private UsuarioRepository usuarioRepository;

	@Override
	public Page<Usuario> findUsuarioPaginado(Pageable pageable) {
		return usuarioRepository.findAll(pageable);
	}

	@Override
	public Usuario saveUsuario(ReqUsuario req) {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(req.getIdUsuario());
		usuario.setDni(req.getDni());
		usuario.setNombre(req.getNombre());
		usuario.setApPaterno(req.getApPaterno());
		usuario.setApMatermo(req.getApMatermo());
		usuario.setCorreo(req.getCorreo());
		usuario.setPassword(req.getPassword());
		usuario.setNumCelular(req.getNumCelular());
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario updateUsuario(ReqUsuario req) {		
		Usuario newUsuario = usuarioRepository.findById(req.getIdUsuario())
			.map(mapper ->{
				mapper.setDni(req.getDni());
				mapper.setNombre(req.getNombre());
				mapper.setApPaterno(req.getApPaterno());
				mapper.setApMatermo(req.getApMatermo());
				mapper.setCorreo(req.getCorreo());
				mapper.setPassword(req.getPassword());
				mapper.setNumCelular(req.getNumCelular());
				return usuarioRepository.save(mapper);
			}).get();
		return newUsuario;
	}

	@Override
	public Usuario findById(Long idUsuario) {
		return usuarioRepository.findById(idUsuario).get();
	}
	
}
