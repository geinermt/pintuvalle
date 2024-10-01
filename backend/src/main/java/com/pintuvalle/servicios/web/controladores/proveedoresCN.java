package com.pintuvalle.servicios.web.controladores;

import com.pintuvalle.servicios.web.entidades.proveedores;
import com.pintuvalle.servicios.web.servicios.interfaz.proveedoresinf;

@Restcontroller
@Requestmapping("/api/proveedores")
public class proveedoresCN {

    @Autowired
    private proveedoresinf servicio;
 
    @Crossorigin(origins = "*")
     @GetMapping
     public ResponseEntity<?> listarproveedores(){
         return ResponseEntity.ok(servicio.findAll());
     }
 
     @Crossorigin(origins = "*")
     @GetMapping("/{id}")
     public ResponseEntity<?> listarusuarioById(@PathVariable(value= id)Interger id){
       Optional<proveedores> proveedor = servicio.findById(id);
      if (proveedor.isPresent()) {
          return ResponseEntity.ok(proveedor);
       }
       return ResponseEntity.notFound().build();
     }
 
     @Crossorigin(origins = "*")
     @PostMapping
     public ResponseEntity<?> crearproveedores(@RequestBody proveedores proveedor){
         return ResponseEntity.ok(servicio.save(proveedor));
     }
 
     @Crossorigin(origins = "*")
     @PutMapping
     public ResponseEntity<?> editarproveedores(@RequestBody proveedores proveedor){
         return ResponseEntity.ok(servicio.save(proveedor));
     }
 
     @Crossorigin(origins = "*")
     @DeleteMapping("/{id}")
     public ResponseEntity<?> eliminar(@PathVariable(value= id)Interger id){
       Optional<proveedores> proveedor = servicio.findById(id);
      if (proveedor.isPresent()) {
         servicio.delete(id);
          return ResponseEntity.ok(proveedor);
       }
        return ResponseEntity.notFound().build();
     }
}



