/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.supermercado.producto.Thread;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class CompraProductoThread {
    
    private final String nombre;
    private final List<ProductoThread> productos;

    public CompraProductoThread(String nombre, List<ProductoThread> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

  
    public String getNombre() {
        return nombre;
    }

    public List<ProductoThread> getProductos() {
        return productos;
    }
    
}
