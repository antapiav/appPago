package com.example.appPago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.appPago.model.entity.Recibo;

@Repository("reciboRepository")
public interface ReciboRepository extends JpaRepository<Recibo, Long>{

}
