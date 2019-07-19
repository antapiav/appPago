package com.example.appPago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.appPago.model.entity.Servicio;

@Repository("servicioRepository")
public interface ServicioRepository extends JpaRepository<Servicio, Long>{

}
