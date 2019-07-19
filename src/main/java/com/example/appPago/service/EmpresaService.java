package com.example.appPago.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.appPago.commons.ReqEmpresa;
import com.example.appPago.commons.ReqUsuario;
import com.example.appPago.model.entity.Empresa;
import com.example.appPago.model.entity.Usuario;

public interface EmpresaService {
	Page<Empresa> lstEmpresa(Pageable pageable);
	Empresa saveEmpresa(ReqEmpresa reqUsuario);
	Empresa updateEmpresa(ReqEmpresa reqUsuario);
	Empresa findById(Long idUsuario);
}
