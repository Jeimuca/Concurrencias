
package com.iudigital.concurrency.Dominio;

/**
 *
 * Jeison Castañeda 
 */
public class Producto {
    
    private String Nombre;
    private float Precio; 
    private int Cantidad; 
    public float getCantidad;
    public float getPrecio;

    public Producto(String Nombre, float Precio, int Cantidad) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
}
