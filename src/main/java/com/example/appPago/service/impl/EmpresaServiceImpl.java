package com.example.appPago.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.appPago.commons.ReqEmpresa;
import com.example.appPago.commons.ReqUsuario;
import com.example.appPago.model.entity.Empresa;
import com.example.appPago.model.entity.Servicio;
import com.example.appPago.model.entity.Usuario;
import com.example.appPago.repository.EmpresaRepository;
import com.example.appPago.repository.UsuarioRepository;
import com.example.appPago.service.EmpresaService;

@Service("empresaServiceImpl")
@Transactional
public class EmpresaServiceImpl implements EmpresaService {

	private static final Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);

	@Autowired
	@Qualifier("empresaRepository")
	private EmpresaRepository empresaRepository;
	
	@Override
	public Page<Empresa> lstEmpresa(Pageable pageable) {
		return empresaRepository.findAll(pageable);
	}

	@Override
	public Empresa saveEmpresa(ReqEmpresa req) {
		Empresa empresa = new Empresa();
		empresa.setIdEmpresa(req.getIdEmpresa());
		empresa.setRuc(req.getRuc());
		empresa.setRazonSocial(req.getRazonSocial());
		Servicio servicio = new Servicio();
		servicio.setIdServicio(req.getCodServicio());
		empresa.setServicio(servicio);
		return empresaRepository.save(empresa);
	}

	@Override
	public Empresa updateEmpresa(ReqEmpresa req) {
		Empresa newEmpresa = empresaRepository.findById(req.getIdEmpresa())
				.map(mapper ->{
					mapper.setRuc(req.getRuc());
					mapper.setRazonSocial(req.getRazonSocial());
					Servicio servicio = new Servicio();
					servicio.setIdServicio(req.getCodServicio());
					mapper.setServicio(servicio);
					return empresaRepository.save(mapper);
				}).get();
			return newEmpresa;
	}

	@Override
	public Empresa findById(Long idUsuario) {
		return empresaRepository.findById(idUsuario).get();
	}

}
