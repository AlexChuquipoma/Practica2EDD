/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2edd.modelo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author alexr
 */
public class Inventario<T> {
    
    private List<Productos> listaProductos;
    private Productos<T> cabeza;
    private int tamaño;
    private Stack <String> historialTransacciones;
    
    public Inventario(){
        listaProductos = new LinkedList();
        historialTransacciones = new Stack<>();
    }
    
    public void agregar(Productos productos){
        listaProductos.add(productos);
        Productos<T> nuevo = productos;
        if (cabeza == null){
            cabeza = nuevo;
        } else {
            Productos<T> ultimoNodo = obtenerUltimo();
            ultimoNodo.setSiguiente(nuevo);
        }
        tamaño++;
    }
    
    public Productos<T> obtenerUltimo(){
        Productos<T> actual = cabeza;
        while (actual.getSiguiente() != null){
            actual = actual.getSiguiente();
        }
        return actual;
    }
    
    public Productos buscarPorCodigo(Object codigo) {
    for (Productos producto : listaProductos) {
        if (producto.getCodigo().equals(codigo)) {
            return producto;
        }
    }
    System.out.println("El producto que acaba de ingresar no existe");
    return null;
    }
    
    public void venderProducto(Productos productos){
        Iterator<Productos> it = listaProductos.iterator();
        while (it.hasNext()){
            Productos c = it.next();
            if (c.getCodigo().equals(productos.getCodigo())){
                it.remove();
                String transaccion = "Venta: " + productos+ "";
                historialTransacciones.push(transaccion);
            }
            tamaño--;
        }
    }
    
    public void imprimirInventarioProductos(){
        for (Productos productos : listaProductos){
            System.out.println("Producto: " + productos.getNombre() +", Código: " + productos.getCodigo() +", Precio: $" + productos.getPrecio() +", Cantidad: " + productos.getCantidad());
        }
    }
    
    public void imprimirHistorialTransacciones(){
        System.out.println("Historial de transacciones de venta:");
        while (!historialTransacciones.isEmpty()){
            System.out.println(historialTransacciones.pop());
        }
    }
}
