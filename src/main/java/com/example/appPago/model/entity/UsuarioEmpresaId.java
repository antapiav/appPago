package com.example.appPago.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class UsuarioEmpresaId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="id_usuario")
	private Long idUsuario;
	
	@Column(name="id_empresa")
	private Long idEmpresa;

}
