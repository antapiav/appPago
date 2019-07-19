package com.example.appPago.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.appPago.commons.ReqUsuario;
import com.example.appPago.model.entity.Usuario;

public interface UsuarioService {
	Page<Usuario> findUsuarioPaginado(Pageable pageable);
	Usuario saveUsuario(ReqUsuario reqUsuario);
	Usuario updateUsuario(ReqUsuario reqUsuario);
	Usuario findById(Long idUsuario);
}
