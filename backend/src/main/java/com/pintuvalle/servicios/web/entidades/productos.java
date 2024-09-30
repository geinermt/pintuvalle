package com.pintuvalle.servicios.web.entidades;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    @NonNull
    private String nombre;

    @Column(name = "tipopintura", nullable = false, length = 100)
    @NonNull
    private int tipopintura;

    @Column(name = "marca", nullable = false, length = 100)
    @NonNull
    private String marca;

    @Column(name = "codigoserial", nullable = false, length = 11)
    @NonNull
    private int codigoserial;

    @Column(name = "cantidad", nullable = false, length = 11)
    @NonNull
    private int cantidad;

    @Column(name = "precio", nullable = false, length = 11)
    @NonNull
    private int precio;

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

    public int getTipopintura() {
        return tipopintura;
    }

    public void setTipopintura(int tipopintura) {
        this.tipopintura = tipopintura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodigoserial() {
        return codigoserial;
    }

    public void setCodigoserial(int codigoserial) {
        this.codigoserial = codigoserial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}