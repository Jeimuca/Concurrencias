
package com.iudigital.concurrency.Dominio;

import java.util.List;

/**
 *
 * Jeison Castañeda 
 */
public class ProductoCliente {
    
    private final String Nombre; 
    
    private final List<Producto> productos; 

    public ProductoCliente(String Nombre, List<Producto> productos) {
        this.Nombre = Nombre;
        this.productos = productos;
    }

    public String getNombre() {
        return Nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    
    
}
