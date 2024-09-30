package com.pintuvalle.servicios.web.servicios.implementaciones;

import java.util.Optional;
import java.util.list;
import com.pintuvalle.servicios.web.entidades.productos;
import com.pintuvalle.servicios.web.servicios.interfaz.productosinf;

@service
public class productosS implements productosinf {
    @Autowired
    private ProductosRepository  repositorio;
     
    @Override
    public list<productos> findAll(){
        return repositorio.findAll();
    }

    @Override
    public Optional<productos> findById(Integer id){
        return repositorio.findById(id);
    }

    @Override
    public productos save(productos producto){
        return repositorio.save(producto);
    }

    @Override
    public void delete(Integer id){
        repositorio.deleteById(id);
    }
}
