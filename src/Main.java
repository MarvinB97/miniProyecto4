/*
 * ------------------------------------------------------------
 * Name Proyecto: miniProyecto-4
 * nombre participantes: Xavier Lopez, Marvin Nuñez, Genaro Vegas
 * File: Main.java
 * Relaciones: clase principal en donde se ejecuta el codigo
 * Ultima modificacion 09-12-23
 * ------------------------------------------------------------
 */


//Se importan las librerias
//import javax.swing.*;

/**
 *
 * @author Xavier Lopez, Marvin Nuñez, Genaro Vegas
 */

//import Proveedores.Proveedores;
//import Clientes.Clientes;
//import File.File;
import MVC.*;



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
    
}
	//static ArrayList<Proveedores> proveedores = new ArrayList<Proveedores>();
	
	//static ArrayList<Clientes> clientes = new ArrayList<Clientes>();
	//se necesitara para cuando se modifique proveedores, ya que es static
	//Proveedores auxProveedor;
	//static File file = new File();
    	
    	
        // TODO code application logic here
        //Model model = new Model();
        //View vista = new View();
        //Controller controller = new Controller(model, vista);
    
    	/*
    	clientes.add(new Clientes("12332234","Jose","Correa","3123442246","Cra. 15 10-54"));
    	clientes.add(new Clientes("17363678","Pedro","Marin","3121419849","Calle 6B 11-35"));
    	clientes.add(new Clientes("14634439","Daniel","Perez","3637392321","Cra. 72C 47-26"));
    	
    	String txt = clientes.get(0).lineInformation();
    	
    	System.out.println(txt);
    	*/
    	/*
    	ArrayList<String> prov = new ArrayList<String>();
    	
    	for(int i=0;i<proveedores.size();i++) {
    		prov.add(proveedores.get(i).lineInformation());
    	}
    	*/
    	
    	/*
    	file.writeFile("Proveedores", prov.get(0));
    	file.writeFile("Proveedores", prov.get(1));    	
    	
    	System.out.println("Datos escritos");
    	System.out.println(file.readFile("Proveedores"));
    	
    	file.updateFile("Proveedores", prov);
    	
    	System.out.println("Datos actualizados");    	
    	System.out.println(file.readFile("Proveedores"));
    	
    	
    	
    }
    
}
/*
//Informacion importante
/*Los txt tienen las columnas con los siguientes nombres
 * Proveedores.txt
 * Id	Nombre	Apellido	Tel	Direccion
 * Productos.txt
 * codProductos IdProveedor	costoProductos	cantProductos
 */
