/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.supermercado.producto;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class CompraProducto {
    
    private final String nombre;
    private final List<Producto> productos;

    public CompraProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public CompraProducto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }
    
    
}
