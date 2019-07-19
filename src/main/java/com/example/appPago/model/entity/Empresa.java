package com.example.appPago.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "empresa")
@Table(name = "empresa", schema="app")
public class Empresa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_empresa")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "id_seq_empresa" )
	@SequenceGenerator(name = "id_seq_empresa", sequenceName ="app.seq_empresa", allocationSize = 1)
	private Long idEmpresa;
	
	@Column(name = "razon_social")
	private String razonSocial;
	
	@Column(name = "ruc")
	private String ruc;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_servicio", nullable = false)
    private Servicio servicio;
	
	@OneToMany(mappedBy = "empresa")
	private List<UsuarioEmpresa> lstUsuario = new ArrayList<>();

}
