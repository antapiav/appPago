package com.example.appPago.service.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.appPago.commons.ReqUsuario;
import com.example.appPago.model.entity.Servicio;
import com.example.appPago.model.entity.Usuario;
import com.example.appPago.repository.ServicioRepository;
import com.example.appPago.repository.UsuarioRepository;
import com.example.appPago.service.ServicioService;

@Service("servicioServiceImpl")
@Transactional
public class ServicioServiceImpl implements ServicioService{

	private static final Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	@Qualifier("servicioRepository")
	private ServicioRepository servicioRepository;
	
	@Override
	public Page<Servicio> findServicioPaginado(Pageable pageable) {
		return servicioRepository.findAll(pageable);
	}

	@Override
	public Servicio findById(Long id) {
		return servicioRepository.findById(id).get();
	}
	
}
