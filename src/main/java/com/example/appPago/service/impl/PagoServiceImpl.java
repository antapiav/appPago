package com.example.appPago.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.appPago.commons.ReqPagos;
import com.example.appPago.commons.ReqUsuario;
import com.example.appPago.model.entity.Pago;
import com.example.appPago.model.entity.Usuario;
import com.example.appPago.repository.PagoRepository;
import com.example.appPago.repository.UsuarioRepository;
import com.example.appPago.service.PagoService;

@Service("pagoServiceImpl")
@Transactional
public class PagoServiceImpl implements PagoService{
	
	@Autowired
	@Qualifier("pagoRepository")
	private PagoRepository pagoRepository;

	@Override
	public Page<Pago> findPagoPaginado(Pageable pageable) {
		return pagoRepository.findAll(pageable);
	}

	@Override
	public Pago savePago(ReqPagos req) {
		Pago pago = new Pago();
		pago.setIdPago(req.getIdUsuario());
		pago.setFechaPago(req.getFechaPago());
		pago.setIdRecibo(req.getIdRecibo());
		pago.setMonto(req.getMonto());
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(req.getIdUsuario());
		pago.setUsuario(usuario);
		return pagoRepository.save(pago);
	}

	@Override
	public Pago updatePago(ReqPagos req) {
		Pago newPago = pagoRepository.findById(req.getIdUsuario())
				.map(mapper ->{
					mapper.setFechaPago(req.getFechaPago());
					mapper.setIdRecibo(req.getIdRecibo());
					mapper.setMonto(req.getMonto());
					Usuario usuario = new Usuario();
					usuario.setIdUsuario(req.getIdUsuario());
					mapper.setUsuario(usuario);
					return pagoRepository.save(mapper);
				}).get();
			return newPago;
	}

	@Override
	public Pago findById(Long id) {
		return pagoRepository.findById(id).get();
	}

}
