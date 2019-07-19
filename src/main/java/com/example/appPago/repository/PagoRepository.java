package com.example.appPago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.appPago.model.entity.Pago;

@Repository("pagoRepository")
public interface PagoRepository extends JpaRepository<Pago, Long>{

}
