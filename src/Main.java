/*
 * ------------------------------------------------------------
 * Name Proyecto: miniProyecto-4
 * nombre participantes: Xavier Lopez, Marvin Nuñez
 * File: Main.java
 * Relaciones: clase principal en donde se ejecuta el codigo
 * Ultima modificacion 03-12-23
 * ------------------------------------------------------------
 */


//Se importan las librerias
//import javax.swing.*;



/*import Controller.Controller;
import Model.Model;
import View.View;
*/

/**
 *
 * @author Xavier Lopez, Marvin Nuñez
 */

import Clientes.Clientes;
import Productos.Productos;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Clientes y Productos
        Clientes clientes = new Clientes();
        Productos productos = new Productos();

        // Crear algunos clientes y productos
        clientes.crearCliente("1", "Juan", "Perez", "123456789", "Calle 123");
        clientes.crearCliente("2", "Ana", "Lopez", "987654321", "Avenida XYZ");

        productos.crearProducto("P001", "Prov001", "10.50", "100");
        productos.crearProducto("P002", "Prov002", "20.75", "50");

        // Mostrar información inicial
        System.out.println("Información inicial de Clientes:");
        System.out.println(clientes.leerClientes());

        System.out.println("Información inicial de Productos:");
        System.out.println(productos.leerProductos());

        // Actualizar un cliente y un producto
        clientes.actualizarCliente("1", "Juan", "Perez", "999999999", "Calle Nueva");
        productos.actualizarProducto("P001", "Prov001", "12.00", "120");

        // Mostrar información después de la actualización
        System.out.println("Información después de la actualización de Clientes:");
        System.out.println(clientes.leerClientes());

        System.out.println("Información después de la actualización de Productos:");
        System.out.println(productos.leerProductos());

        // Borrar un cliente y un producto
        clientes.borrarCliente("2");
        productos.borrarProducto("P002");

        // Mostrar información después de la eliminación
        System.out.println("Información después de la eliminación de Clientes:");
        System.out.println(clientes.leerClientes());

        System.out.println("Información después de la eliminación de Productos:");
        System.out.println(productos.leerProductos());
    }
}

//Informacion importante
/*Los txt tienen las columnas con los siguientes nombres
 * Proveedores.txt
 * Id	Nombre	Apellido	Tel	Direccion
 * Productos.txt
 * codProductos IdProveedor	costoProductos	cantProductos
 */




