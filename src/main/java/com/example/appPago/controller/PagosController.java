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
import com.example.appPago.model.entity.Pago;
import com.example.appPago.model.entity.Usuario;
import com.example.appPago.service.PagoService;

@RestController
@RequestMapping("/pago")
public class PagosController {
	
	private PagoService pagoService;
	
	@Autowired
	public void setPagoService(PagoService pagoService) {
		this.pagoService = pagoService;
	}
	
	@GetMapping("/paginado")
	public Page<Pago> findAlumnosPaginado(Pageable pageable) {
		return pagoService.findPagoPaginado(pageable);
	}
	
	@GetMapping("/seleccionar/{id}")
	public Pago alumnoById(@PathVariable Long id) {
		return pagoService.findById(id);
	}
}
