package com.pintuvalle.servicios.web.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pintuvalle.servicios.web.entidades.usuario;


public interface usuarioR extends JpaRepository<usuario, Interger> {

}
