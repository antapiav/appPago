package com.example.appPago.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "tarjeta")
@Table(name = "tarjeta", schema="app")
public class Tarjeta implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_tarjeta")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "id_seq_tarjeta" )
	@SequenceGenerator(name = "id_seq_tarjeta", sequenceName ="app.seq_tarjeta", allocationSize = 1)
	private Long idPago;
	
	@Column(name = "num_tarjeta")
	private String numTarjeta;
	
	@Column(name = "ccv")
	private String ccv;
	
	@Column(name = "fecha_vencimiento")
	private Date fechaVencimiento;
	
	@Column(name = "nombre_titual")
	private String nombreTitual;
	
	@Column(name = "proveedor")
	private String proveedor;
	
	@Column(name = "tipo")
	private String tipo;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;
}
