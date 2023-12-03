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
import java.util.ArrayList;


public class Main {
	
	static ArrayList<Proveedores> proveedores = new ArrayList<Proveedores>();
	//se necesitara para cuando se modifique proveedores, ya que es static
	//Proveedores auxProveedor;

    public static void main(String[] args) {
        // TODO code application logic here
        //Model model = new Model();
        //View vista = new View();
        //Controller controller = new Controller(model, vista);
    	
    	proveedores.add(new Proveedores("12332","Jose","Correa","3123442246","Cra. 15 10-54",
				"are31425",60000,50));
    	
    	String txt = proveedores.get(0).readInformation();
    	
    	System.out.println(txt);
    	
    }
    
}
