package com.pintuvalle.servicios.web.controladores;

import com.pintuvalle.servicios.web.servicios.interfaz.productosinf;

@Restcontroller
@Requestmapping("/api/productos")
public class productosCN {
   
    @Autowired
   private productosinf servicio;

   @Crossorigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> listarproductos(){
        return ResponseEntity.ok(servicio.findAll());
    }

    @Crossorigin(origins = "*")
    @GetMapping("/{id}")
    public ResponseEntity<?> listarproductoById(@PathVariable(value= id)Interger id){
      Optional<productos> producto = servicio.findById(id);
     if (producto.isPresent()) {
         return ResponseEntity.ok(producto);
      }
      return ResponseEntity.notFound().build();
    }

    @Crossorigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> crearproducto(@RequestBody productos producto){
        return ResponseEntity.ok(servicio.save(producto));
    }

    @Crossorigin(origins = "*")
    @PutMapping
    public ResponseEntity<?> editarproducto(@RequestBody productos producto){
        return ResponseEntity.ok(servicio.save(producto));
    }

    @Crossorigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(value= id)Interger id){
      Optional<productos> producto = servicio.findById(id);
     if (producto.isPresent()) {
        servicio.delete(id);
         return ResponseEntity.ok(producto);
      }
       return ResponseEntity.notFound().build();
    }
}