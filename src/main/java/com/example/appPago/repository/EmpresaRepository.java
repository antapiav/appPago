package com.example.appPago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.appPago.model.entity.Empresa;

@Repository("empresaRepository")
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}
