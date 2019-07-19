package com.example.appPago.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "usuario")
@Table(name = "usuario", schema="app")
public class Usuario implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "id_seq_usuario" )
	@SequenceGenerator(name = "id_seq_usuario", sequenceName ="app.seq_usuario", allocationSize = 1)
	private Long idUsuario;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "ap_paterno")
	private String apPaterno;
	
	@Column(name = "ap_materno")
	private String apMatermo;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "num_celular")
	private String numCelular;
	
	@OneToMany(mappedBy = "usuario")
	private List<UsuarioEmpresa> lstEmpresa = new ArrayList<>();
	
}
