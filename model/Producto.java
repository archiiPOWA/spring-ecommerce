package com.curso.ecomerce.Springecomerce.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Producto {
    private Integer id;
    private String  nombre;
    private String  descripcion;
    private String  imagen;
    private int     cantidad;

    public Producto() {
    }

    public Producto(Integer id, String nombre, String descripcion, String imagen, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }



}
