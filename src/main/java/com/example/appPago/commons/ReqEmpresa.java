package com.example.appPago.commons;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class ReqEmpresa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long idEmpresa;
	private String razonSocial;
	private String ruc;
	private Long codServicio;

}
