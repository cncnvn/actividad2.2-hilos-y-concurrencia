/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.supermercado.thread;

import com.mycompany.supermercado.supermercado.producto.Thread.CompraProductoThread;
import com.mycompany.supermercado.supermercado.producto.Thread.ProductoThread;

/**
 *
 * @author Usuario
 */
public class ProcesoCajeraThread extends Thread {
    
    private String nombre;
    private CompraProductoThread cliente;
    private long timeStamp;
    
    public ProcesoCajeraThread(String nombre,CompraProductoThread cliente, long timeStamp){
        this.nombre=nombre;
        this.cliente=cliente;
        this.timeStamp=timeStamp;
    }
    
    @Override
    public void run(){
        System.out.println("Cajera: "+ this.nombre +
                "\nBienvenido "+ cliente.getNombre() + " en el tiempo "+
                ((System.currentTimeMillis()- timeStamp)/1000)+ " segundos ");
        
        int contClie=1;
        
        for(ProductoThread produ: cliente.getProductos()){
            esperarXsegundos();
            System.out.println("\nProceso " + contClie + "\nproducto " + produ.getNombre()+
               "\nprecio " + produ.getPrecio()+
                    "\ncantidad " + produ.getCantidad()+
                    "\n costo total " + produ.getCantidad() * produ.getPrecio()+
                    "\ntiempo "+(System.currentTimeMillis()- timeStamp)/1000+" segundos ");
            contClie++;
        }
        
        System.out.println("Fue atendido por "+ this.nombre +" ha terminado de procesar "+
             cliente.getNombre()+ " en el tiempo "+
                ((System.currentTimeMillis()- timeStamp)/1000)+" segundos ");
    }
    
    private void esperarXsegundos(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    
}
