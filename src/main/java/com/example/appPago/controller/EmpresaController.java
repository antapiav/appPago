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

import com.example.appPago.commons.ReqEmpresa;
import com.example.appPago.commons.ReqUsuario;
import com.example.appPago.model.entity.Empresa;
import com.example.appPago.model.entity.Usuario;
import com.example.appPago.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	private EmpresaService empresaService;
	
	@Autowired
	public void setEmpresaService(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}
	
	@GetMapping("/paginado")
	public Page<Empresa> findAlumnosPaginado(@RequestBody Pageable pageable) {
		return empresaService.lstEmpresa(pageable);
	}
	
	@PostMapping("/save")
	public Empresa insertAlumno(@Valid @RequestBody ReqEmpresa req) {
		return empresaService.saveEmpresa(req);
	}
	
	@PutMapping("/update")
	public Empresa updateAlumno(@Valid @RequestBody ReqEmpresa req) {
		return empresaService.updateEmpresa(req);
	}
	
	@GetMapping("/seleccionar/{id}")
	public Empresa alumnoById(@PathVariable Long id) {
		return empresaService.findById(id);
	}
}
