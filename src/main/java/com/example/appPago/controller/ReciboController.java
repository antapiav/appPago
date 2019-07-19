package com.example.appPago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appPago.model.entity.Recibo;
import com.example.appPago.service.ReciboService;

@RestController
@RequestMapping("/recibo")
public class ReciboController {
	private ReciboService reciboService;
	
	@Autowired
	public void setUsuarioService(ReciboService reciboService) {
		this.reciboService = reciboService;
	}
	
	@GetMapping("/paginado")
	public Page<Recibo> findAlumnosPaginado(Pageable pageable) {
		return reciboService.findReciboPaginado(pageable);
	}
	
	@GetMapping("/seleccionar/{id}")
	public Recibo alumnoById(@PathVariable Long id) {
		return reciboService.findById(id);
	}
}
