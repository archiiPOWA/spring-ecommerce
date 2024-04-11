package com.curso.ecomerce.Springecomerce.model;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Orden {
    private Integer id;
    private String  numero;
    private Date fechaCreacion;
    private Date    fechaRecibida;

    private double  total;

    public Orden() {
    }

    public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaRecibida=" + fechaRecibida +
                ", total=" + total +
                '}';
    }
}
