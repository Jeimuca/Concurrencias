
package com.iudigital.concurrency.Hilos;

/**
 *
 * Jeison Castañeda 
 */
import com.iudigital.concurrency.Dominio.Producto;
import com.iudigital.concurrency.Dominio.ProductoCliente;
import java.util.List;

public class CajeraProducto extends Thread {
    private final String nombre;
    private final ProductoCliente productoCliente;

    public CajeraProducto(String nombre, ProductoCliente productoCliente) {
        this.nombre = nombre;
        this.productoCliente = productoCliente;
    }

    @Override
    public void run() {
        long tiempoInicioCajera = System.currentTimeMillis(); // Obtener el tiempo inicial de la cajera
        System.out.println("La cajera " + nombre + " está procesando la compra de " + productoCliente.getNombre()
                    + " en el tiempo " + (tiempoInicioCajera / 1000) + " segundos");

        List<Producto> productos = productoCliente.getProductos();
        double total = 0;
        // Calcular el tiempo total de procesamiento de los productos
        for (Producto producto : productos) {
            long tiempoInicioProducto = System.currentTimeMillis(); // Obtener el tiempo inicial de procesamiento del producto
            System.out.println("Procesando producto: " + producto.getNombre()
                    + ", Cantidad: " + producto.getCantidad()
                    + ", Precio: $" + producto.getPrecio()
                    + " costo total de los productos: " + producto.getCantidad() * producto.getPrecio()
                    + " -> Tiempo de inicio del producto: " + (tiempoInicioProducto - tiempoInicioCajera) + " milisegundos");
            total += producto.getCantidad() * producto.getPrecio();
        }
        // Simular un tiempo de pausa al final del proceso de compra
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Calcular el tiempo total de la transacción
        long tiempoTotal = (System.currentTimeMillis() - tiempoInicioCajera) / 1000;
        System.out.println("El total a pagar " + productoCliente.getNombre() + " por toda la compra es: $" + total
                        + " tiempo " + tiempoTotal + " segundos");
        System.out.println("==================================================================");
    }
}




