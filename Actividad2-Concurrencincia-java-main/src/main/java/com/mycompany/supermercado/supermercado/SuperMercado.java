/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.supermercado.supermercado;

import com.mycompany.supermercado.supermercado.producto.CompraProducto;
import com.mycompany.supermercado.supermercado.producto.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.List;

/**
 *
 * @author Usuario
 */
public class SuperMercado {
    

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        List<Producto> productos=new ArrayList<>();
        
        System.out.println("Ingrese su Nombre: ");
        String nombre=entrada.nextLine();
        
        System.out.println("Ingrese el numero de productos");
        int numProductos=entrada.nextInt();
        
        entrada.nextLine();
        
        for(int i=1;i<=numProductos;i++){
            System.out.println("Ingrese el nombre del producto "+i+": ");
            String nombreProducto=entrada.nextLine();
            
            System.out.println("Ingrese el precio del producto "+i+ ":");
            double precioProducto=entrada.nextDouble();
            
            System.out.println("Ingrese la cantidad del producto "+i+ ":");
            int cantidadProducto=entrada.nextInt();
            
            entrada.nextLine();
            
            Producto producto=new Producto(nombreProducto, precioProducto, cantidadProducto);
            productos.add(producto);
        }
        
      
        CompraProducto clientes=new CompraProducto(nombre,productos);
        
       ProcesoCajera cajera=new ProcesoCajera("Martina");
       cajera.ProcesoCompra(clientes, System.currentTimeMillis()/1000);
        
       
    }
}
