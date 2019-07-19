package com.example.appPago.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.appPago.commons.ReqUsuario;
import com.example.appPago.model.entity.Servicio;
import com.example.appPago.model.entity.Usuario;

public interface ServicioService {
	Page<Servicio> findServicioPaginado(Pageable pageable);
	Servicio findById(Long idUsuario);
}
