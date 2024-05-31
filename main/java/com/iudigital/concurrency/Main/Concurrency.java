

package com.iudigital.concurrency.Main;

import com.iudigital.concurrency.Dominio.Producto;
import com.iudigital.concurrency.Dominio.ProductoCliente;
import com.iudigital.concurrency.Hilos.CajeraProducto;
import java.util.List;

/**
 *
 * Jeison Castañeda 
 */
public class Concurrency {

    public static void main(String[] args) {
    // Crear productos para el primer cliente
    Producto producto1Cliente1 = new Producto("Banano", 1200, 1);
    Producto producto2Cliente1 = new Producto("Pan", 3500, 2);
    Producto producto3Cliente1 = new Producto("Huevos", 18000, 1);

    // Crear lista de productos para el primer cliente
    List<Producto> listaProductosCliente1 = List.of(producto1Cliente1, producto2Cliente1, producto3Cliente1);

    // Crear primer cliente
    ProductoCliente cliente1 = new ProductoCliente("Jeison", listaProductosCliente1);

    // Crear productos para el segundo cliente
    Producto producto1Cliente2 = new Producto("Arroz", 52000, 3);
    Producto producto2Cliente2 = new Producto("Pasta", 2500, 2);

    // Crear lista de productos para el segundo cliente
    List<Producto> listaProductosCliente2 = List.of(producto1Cliente2, producto2Cliente2);

    // Crear segundo cliente
    ProductoCliente cliente2 = new ProductoCliente("Lina ", listaProductosCliente2);

    // Crear cajera 1 y procesar compra del cliente 1
    CajeraProducto cajera1 = new CajeraProducto("Laura", cliente1);
    cajera1.start();

    // Esperar a que la cajera 1 termine antes de continuar
    try {
        cajera1.join();
    } catch (InterruptedException e) {
    }

    // Crear cajera 2 y procesar compra del cliente 2
    CajeraProducto cajera2 = new CajeraProducto("Gloria", cliente2);
    cajera2.start();

    // Esperar a que la cajera 2 termine antes de continuar
    try {
        cajera2.join();
    } catch (InterruptedException e) {
    }
    }
}
