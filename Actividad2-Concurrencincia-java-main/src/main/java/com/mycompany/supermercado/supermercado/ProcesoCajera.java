/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.supermercado;

import com.mycompany.supermercado.supermercado.producto.CompraProducto;
import com.mycompany.supermercado.supermercado.producto.Producto;


/**
 *
 * @author Usuario
 */
public class ProcesoCajera {
    
    private String nombre;

    public ProcesoCajera(String nombre) {
        this.nombre = nombre;
    }

    ProcesoCajera() {
        
    }
    
    public void ProcesoCompra(CompraProducto cliente, long timeStamp ){
        System.out.println("\nCajera: "+this.nombre+
                "\nbienvenido: " +cliente.getNombre()+"\nen el tiempo: "
                +(System.currentTimeMillis()-timeStamp/1000+" segundos "));
        
        int contClie=1;
        for(Producto produ:cliente.getProductos()){
            this.esperarXsegundos();
            System.out.println("\nproceso"+contClie+"\nproducto: "+produ.getNombre()+
                    "\nprecio: "+produ.getPrecio()+
                    "\ncantidad: " + produ.getCantidad()+
                    "\ncosto total: "+produ.getCantidad()* produ.getPrecio()+
                    "\ntiempo: " + (System.currentTimeMillis()-timeStamp)/1000+"segundo" );
        }
        
        System.out.println("fue atendido por "+ this.nombre+" ha terminado de procesar "+
                cliente.getNombre()+ " en el tiempo "
                +(System.currentTimeMillis()- timeStamp)/1000);
    }
    
    private void esperarXsegundos(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
