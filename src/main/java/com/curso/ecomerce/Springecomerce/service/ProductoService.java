package com.curso.ecomerce.Springecomerce.service;

import com.curso.ecomerce.Springecomerce.model.Producto;

import java.util.Optional;

public interface ProductoService {
    //este metodo recibe como parametro objeto de tipo Producto y
    public Producto save(Producto producto);

    //usamos un opcional porque nos permite validar si existe el objeto
    //que estamos llamando de la base de datos
    public Optional<Producto> get(Integer id);

    //defino el metodo void porque no retorna nada solo nos permite actualizar
    //para lo cual recibe como parametro el objeto producto de tipo Producto
    public void update(Producto producto);

    //este metodo permite eliminar, por lo que solo recibe como parametro un valor
    //en este caso el id de tipo Entero correspondiente al producto a eliminar
    public void delete(Integer id);

}
