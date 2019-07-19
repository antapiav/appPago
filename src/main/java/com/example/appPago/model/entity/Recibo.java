package com.example.appPago.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "recibo")
@Table(name = "recibo", schema="app")
public class Recibo implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_recibo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "id_seq_recibo" )
	@SequenceGenerator(name = "id_seq_recibo", sequenceName ="app.seq_recibo", allocationSize = 1)
	private Long idRecibo;
	
	@Column(name = "num_recibo")
	private String numRecibo;
	
	@Column(name = "fecha_vencimiento")
	private String fechaVencimiento;
	
	@Column(name = "monto")
	private String monto;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "id_empresa")
	private String idEmpresa;
	
	@Column(name = "id_usuario")
	private String idUsuario;

}
