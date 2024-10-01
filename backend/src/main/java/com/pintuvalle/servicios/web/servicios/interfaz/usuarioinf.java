package com.pintuvalle.servicios.web.servicios.interfaz;

import com.pintuvalle.servicios.web.entidades.usuario;
import java.util.Optional;
import java.util.list;

public interface usuarioinf {

    public list<usuario> findAll();
    public  Optional<usuario> findByID(Integer id);
    public  usuario save(usuario usuario);
    public void delete(Integer id);
}
