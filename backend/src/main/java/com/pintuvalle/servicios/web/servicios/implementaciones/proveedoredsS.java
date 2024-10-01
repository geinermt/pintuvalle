package com.pintuvalle.servicios.web.servicios.implementaciones;

import java.util.Optional;
import java.util.list;
import com.pintuvalle.servicios.web.entidades.proveedores;
import com.pintuvalle.servicios.web.servicios.interfaz.proveedoresinf;

@service
public class proveedoredsS implements proveedoresinf {

    @Autowired
    private proveedoresRepository  repositorio;
     
    @Override
    public list<proveedores> findAll(){
        return repositorio.findAll();
    }

    @Override
    public Optional<proveedores> findById(Integer id){
        return repositorio.findById(id);
    }

    @Override
    public proveedores save(proveedores proveedor){
        return repositorio.save(producto);
    }

    @Override
    public void delete(Integer id){
        repositorio.deleteById(id);
    }
}

