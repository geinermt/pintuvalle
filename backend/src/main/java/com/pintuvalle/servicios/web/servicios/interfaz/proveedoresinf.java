package com.pintuvalle.servicios.web.servicios.interfaz;

import com.pintuvalle.servicios.web.entidades.proveedores;
import java.util.Optional;
import java.util.list;

public interface proveedoresinf {

    public list<proveedores> findAll();
    public  Optional<proveedores> findByID(Integer id);
    public   proveedores save(proveedores proveedor);
    public void delete(Integer id); 
}
