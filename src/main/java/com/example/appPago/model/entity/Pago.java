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
@Entity(name = "pago")
@Table(name = "pago", schema="app")
public class Pago implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_pago")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "id_seq_empresa" )
	@SequenceGenerator(name = "id_seq_empresa", sequenceName ="app.seq_empresa", allocationSize = 1)
	private Long idPago;
	
	@Column(name = "fecha_pago")
	private Date fechaPago;
	
	@Column(name = "monto")
	private Double monto;
	
	@Column(name = "id_recibo")
	private Long idRecibo;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

}
