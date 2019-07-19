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
import com.example.appPago.model.entity.Recibo;
import com.example.appPago.model.entity.Usuario;
import com.example.appPago.repository.ReciboRepository;
import com.example.appPago.repository.UsuarioRepository;
import com.example.appPago.service.ReciboService;

@Service("reciboServiceImpl")
@Transactional
public class ReciboServiceImpl implements ReciboService{
	
private static final Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	@Qualifier("reciboRepository")
	private ReciboRepository reciboRepository;

	@Override
	public Page<Recibo> findReciboPaginado(Pageable pageable) {
		return reciboRepository.findAll(pageable);
	}

	@Override
	public Recibo findById(Long id) {
		return reciboRepository.findById(id).get();
	}

	

}
