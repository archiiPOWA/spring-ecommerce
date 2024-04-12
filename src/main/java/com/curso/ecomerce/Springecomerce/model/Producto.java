package com.curso.ecomerce.Springecomerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  nombre;
    private String  descripcion;
    private String  imagen;
    private int     cantidad;

    //el framework va a crear un campo en la tabla productos para mandar
    //un usuario como objeto y que se mapee directamente a esta clase
    @ManyToOne
    private Usuario usuario;



    public Producto() {
    }

    public Producto(Integer id, String nombre, String descripcion,
                    String imagen, int cantidad, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.cantidad = cantidad;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
