package com.example.appPago.commons;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class ReqPagos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Date fechaPago;
	private Double monto;
	private Long idEmpresa;
	private Long idRecibo;
	private Long idUsuario;	

}
