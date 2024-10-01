package com.pintuvalle.servicios.web.entidades;

import java.util.Date;
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    @NonNull
    private String nombre;

    @Column(name = "nombreyapellido", nullable = false, length = 100)
    @NonNull
    private String nombreyapellido;

    @Column(name = "fechanacimiento", nullable = false, length = 10)
    @NonNull
    private Date fechanacimiento;

    @Column(name = "correo", nullable = false, length = 100)
    @NonNull
    private String correo;

    @Column(name = "telefono", nullable = false, length = 11)
    @NonNull
    private int telefono;

    @Column(name = "contraseña", nullable = false, length = 100)
    @NonNull
    private String contraseña;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombreyapellido() {
        return nombreyapellido;
    }

    public void setnombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public Date getfechanacimiento() {
        return fechanacimiento;
    }

    public void setfechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getcorreo() {
        return correo;
    }

    public void setcorreo(String correo) {
        this.codigoserial = codigoserial;
    }

    public int gettelefono() {
        return telefono;
    }

    public void settelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getcontraseña() {
        return contraseña;
    }

    public void setcontraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}