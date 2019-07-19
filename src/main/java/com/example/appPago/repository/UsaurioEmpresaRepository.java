package com.example.appPago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.appPago.model.entity.UsuarioEmpresa;

@Repository("usaurioEmpresaRepository")
public interface UsaurioEmpresaRepository extends JpaRepository<UsuarioEmpresa, Long>{

}
