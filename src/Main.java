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

import Proveedores.Proveedores;
import File.File;

import java.util.ArrayList;


public class Main {
	
	static ArrayList<Proveedores> proveedores = new ArrayList<Proveedores>();
	//se necesitara para cuando se modifique proveedores, ya que es static
	//Proveedores auxProveedor;
	static File file = new File();

    public static void main(String[] args) {
    	
        // TODO code application logic here
        //Model model = new Model();
        //View vista = new View();
        //Controller controller = new Controller(model, vista);
    	
    	proveedores.add(new Proveedores("12332234","Jose","Correa","3123442246","Cra. 15 10-54"));
    	proveedores.add(new Proveedores("17363678","Pedro","Marin","3121419849","Calle 6B 11-35"));
    	proveedores.add(new Proveedores("14634439","Daniel","Perez","3637392321","Cra. 72C 47-26"));

    	//String txt = proveedores.get(0).readInformation();
    	
    	//System.out.println(txt);
    	ArrayList<String> prov = new ArrayList<String>();
    	
    	for(int i=0;i<proveedores.size();i++) {
    		prov.add(proveedores.get(i).lineInformation());
    	}
    	
    	file.writeFile("Proveedores", prov.get(0));
    	file.writeFile("Proveedores", prov.get(1));    	
    	
    	System.out.println("Datos escritos");
    	System.out.println(file.readFile("Proveedores"));
    	
    	file.updateFile("Proveedores", prov);
    	
    	System.out.println("Datos actualizados");    	
    	System.out.println(file.readFile("Proveedores"));
    	
    	
    	
    }
    
}

//Informacion importante
/*Los txt tienen las columnas con los siguientes nombres
 * Proveedores.txt
 * Id	Nombre	Apellido	Tel	Direccion
 * Productos.txt
 * codProductos IdProveedor	costoProductos	cantProductos
 */




