package com.example.appPago.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parametros")
public class ParametrosController {
	
	@GetMapping("/obtener")
	public List<String> findAlumnosPaginado(@RequestBody Pageable pageable) {
		List<String> lstParametros = new ArrayList<>();
		lstParametros.add("url1");
		lstParametros.add("url2");
		lstParametros.add("url3");
		return lstParametros;
	}
}
