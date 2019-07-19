package com.example.appPago.commons;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class ReqUsuario implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long idUsuario;
	private String dni;
	private String nombre;
	private String apPaterno;
	private String apMatermo;
	private String correo;
	private String password;
	private String numCelular;
	
}
