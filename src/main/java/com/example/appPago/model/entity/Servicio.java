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
@Entity(name = "servicio")
@Table(name = "servicio", schema="app")
public class Servicio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_servicio")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "id_seq_servicio" )
	@SequenceGenerator(name = "id_seq_servicio", sequenceName ="app.seq_servicio", allocationSize = 1)
	private Long idServicio;
	
	@Column(name = "tipo")
	private String tipo;
}
