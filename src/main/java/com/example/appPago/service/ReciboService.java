package com.example.appPago.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.appPago.commons.ReqUsuario;
import com.example.appPago.model.entity.Recibo;
import com.example.appPago.model.entity.Usuario;

public interface ReciboService {
	Page<Recibo> findReciboPaginado(Pageable pageable);
	Recibo findById(Long idUsuario);
}
