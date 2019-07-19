package com.example.appPago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.appPago.model.entity.Tarjeta;

@Repository("tarjetaRepository")
public interface TarjetaRepository extends JpaRepository<Tarjeta, Long>{

}
