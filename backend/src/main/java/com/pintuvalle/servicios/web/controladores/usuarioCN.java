package com.pintuvalle.servicios.web.controladores;

import com.pintuvalle.servicios.web.entidades.usuario;
import com.pintuvalle.servicios.web.servicios.interfaz.usuarioinf;

@Restcontroller
@Requestmapping("/api/usuario")
public class usuarioCN {

    @Autowired
   private usuarioinf servicio;

   @Crossorigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> listarusuario(){
        return ResponseEntity.ok(servicio.findAll());
    }

    @Crossorigin(origins = "*")
    @GetMapping("/{id}")
    public ResponseEntity<?> listarusuarioById(@PathVariable(value= id)Interger id){
      Optional<usuario> usuario = servicio.findById(id);
     if (usuario.isPresent()) {
         return ResponseEntity.ok(usuario);
      }
      return ResponseEntity.notFound().build();
    }

    @Crossorigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> crearusuario(@RequestBody usuario usuario){
        return ResponseEntity.ok(servicio.save(usuario));
    }

    @Crossorigin(origins = "*")
    @PutMapping
    public ResponseEntity<?> editarusuario(@RequestBody usuario usuario){
        return ResponseEntity.ok(servicio.save(usuario));
    }

    @Crossorigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(value= id)Interger id){
      Optional<usuario> usuario = servicio.findById(id);
     if (usuario.isPresent()) {
        servicio.delete(id);
         return ResponseEntity.ok(usuario);
      }
       return ResponseEntity.notFound().build();
    }
}
