package com.example.appPago.model.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name="usuario_empresa")
@Table(name="usuario_empresa", schema="app")
public class UsuarioEmpresa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private UsuarioEmpresaId usuarioEmpresa;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId(value="idUsuario")
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId(value="idEmpresa")
	private Empresa empresa;

}
