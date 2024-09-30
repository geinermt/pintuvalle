package com.pintuvalle.servicios.web.servicios.interfaz;

import com.pintuvalle.servicios.web.entidades.productos;
import java.util.Optional;
import java.util.list;

public interface productosinf {

    public list<productos> findAll();
    public  Optional<productos> findByID(Integer id);
    public  productos save(productos producto);
    public void delete(Integer id);
}
