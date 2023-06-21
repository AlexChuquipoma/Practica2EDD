/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2edd.controlador;

import ec.edu.ups.practica2edd.modelo.Inventario;
import ec.edu.ups.practica2edd.modelo.Productos;
import ec.edu.ups.practica2edd.vista.VistaProductos;

/**
 *
 * @author alexr
 */
public class ControladorProductos {
    
    private VistaProductos vistaProducto;
    private Productos producto;
    private Inventario inventario;

    public ControladorProductos(VistaProductos vistaProducto, Productos producto, Inventario inventario) {
        this.vistaProducto = vistaProducto;
        this.producto = producto;
        this.inventario = inventario;
    }
    
    public ControladorProductos(VistaProductos vistaProducto, Inventario inventario) {
        this.vistaProducto = vistaProducto;
        this.inventario = inventario;
    }
    
    public void registrarProducto (){
        producto=vistaProducto.ingresarProducto();
        inventario.agregar(producto);
    }
    
    public void venderProducto() {
        int codigo = vistaProducto.buscarProductoVenta();
        producto = inventario.buscarPorCodigo(codigo);
        inventario.venderProducto(producto);
        System.out.println("Producto vendido exitosamente");
    } 
    
    public void consultarInventario() {
        inventario.imprimirInventarioProductos();
    }
    
    public void consultarHistorialTransacciones() {
        inventario.imprimirHistorialTransacciones();
    }
}
