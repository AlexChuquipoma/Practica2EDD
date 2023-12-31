/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2edd.vista;

import ec.edu.ups.practica2edd.modelo.Inventario;
import ec.edu.ups.practica2edd.modelo.Productos;
import java.util.Scanner;

/**
 *
 * @author alexr
 */
public class VistaProductos {
    
    private Scanner teclado;
    private Inventario inventario;
    
    public Productos ingresarProducto(){
        teclado = new Scanner (System.in);
        
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el codigo del producto: ");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de productos: ");
        int cantidad = teclado.nextInt();
        return new Productos (nombre, codigo, precio, cantidad);  
    }
    
    public int buscarProductoVenta(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el codigo del producto que se va a vender: ");
        int codigo = teclado.nextInt();
        return codigo;
    }
    
    public int ingresarCantidadVenta(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de producto que se va a vender: ");
        int cantidad = teclado.nextInt();
        return cantidad;
    }  
}
    
