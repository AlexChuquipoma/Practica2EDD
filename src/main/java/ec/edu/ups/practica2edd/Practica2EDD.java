/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica2edd;

import ec.edu.ups.practica2edd.controlador.ControladorProductos;
import ec.edu.ups.practica2edd.modelo.Inventario;
import ec.edu.ups.practica2edd.vista.VistaProductos;
import java.util.Scanner;

/**
 *
 * @author alexr
 */
public class Practica2EDD {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int opcion = 0;
        VistaProductos vistaProducto = new VistaProductos ();
        Inventario inventario = new Inventario();
        ControladorProductos controladorProducto = new ControladorProductos(vistaProducto, inventario);
    
        do {
            System.out.println("*** MENU ***");
            System.out.println("1. Ingresar Producto");
            System.out.println("2. Vender Productos");
            System.out.println("3. Consultar inventario actual");
            System.out.println("4. Consultar el historial de transacciones de venta");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    controladorProducto.registrarProducto();
                    break;

                case 2:
                    controladorProducto.venderProducto();
                    break;

                case 3:
                    controladorProducto.consultarInventario();
                    break;
                case 4:
                    controladorProducto.consultarHistorialTransacciones();
                    break;
                case 5:
                    System.out.println("Gracias, saludos!");
                    break;
            }
        }
        while (opcion!=5);
    }
}
