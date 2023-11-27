/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.supermercado.thread;

import com.mycompany.supermercado.supermercado.producto.Thread.CompraProductoThread;
import com.mycompany.supermercado.supermercado.producto.Thread.ProductoThread;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SuperMercadoThread {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        List<ProductoThread> productos=new ArrayList<>();
        
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre=entrada.nextLine();
        
        System.out.println("Ingrese el numero de productos: ");
        int numProductos=entrada.nextInt();
        
        
        entrada.nextLine();
        
        
        for (int i = 1; i <= numProductos; i++) {
            System.out.println("Ingrese el nombre del producto " + i + ": ");
            String nombreProducto = entrada.nextLine();

            System.out.println("Ingrese el precio del producto " + i + ": ");
            double precioProducto = entrada.nextDouble();

            System.out.println("Ingrese la cantidad del producto " + i + ": ");
            int cantidadProducto = entrada.nextInt();

            entrada.nextLine(); // Limpiar el búfer de entrada

            ProductoThread producto = new ProductoThread(nombreProducto, precioProducto, cantidadProducto);
            productos.add(producto);
        }

        CompraProductoThread cliente = new CompraProductoThread(nombre, productos);
        ProcesoCajeraThread cajera = new ProcesoCajeraThread("Martina", cliente, System.currentTimeMillis());
        cajera.start();
    }
}
