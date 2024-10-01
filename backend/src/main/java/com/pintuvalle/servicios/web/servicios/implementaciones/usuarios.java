package com.pintuvalle.servicios.web.servicios.implementaciones;


import java.util.Optional;
import java.util.list;
import com.pintuvalle.servicios.web.entidades.usuario;
import com.pintuvalle.servicios.web.servicios.interfaz.usuarioinf;

@service
public class  usuarios implements usuarioinf {

    @Autowired
    private usuarioRepository  repositorio;
     
    @Override
    public list<usuario> findAll(){
        return repositorio.findAll();
    }

    @Override
    public Optional<usuario> findById(Integer id){
        return repositorio.findById(id);
    }

    @Override
    public usuario save(usuario usuario){
        return repositorio.save(usuario);
    }

    @Override
    public void delete(Integer id){
        repositorio.deleteById(id);
    }
}
