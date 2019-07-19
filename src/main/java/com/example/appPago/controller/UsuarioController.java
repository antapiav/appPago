package com.example.appPago.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appPago.commons.ReqUsuario;
import com.example.appPago.model.entity.Usuario;
import com.example.appPago.service.UsuarioService;
import com.example.appPago.service.impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	@Autowired
	public void setUsuarioService(UsuarioServiceImpl usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping("/paginado")
	public Page<Usuario> findAlumnosPaginado(Pageable pageable) {
		return usuarioService.findUsuarioPaginado(pageable);
	}
	
	@PostMapping("/save")
	public Usuario insertAlumno(@Valid @RequestBody ReqUsuario req) {
		return usuarioService.saveUsuario(req);
	}
	
	@PutMapping("/update")
	public Usuario updateAlumno(@Valid @RequestBody ReqUsuario req) {
		return usuarioService.updateUsuario(req);
	}
	
	@GetMapping("/seleccionar/{id}")
	public Usuario alumnoById(@PathVariable Long id) {
		return usuarioService.findById(id);
	}

}
