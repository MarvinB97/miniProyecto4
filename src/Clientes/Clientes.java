package Clientes;

import java.util.ArrayList;

public class Clientes {

    private ArrayList<String> clientes = new ArrayList<String>();

    public Clientes(String id, String nombre, String apellido, String tel, String direccion) {
        clientes.add(id);
        clientes.add(nombre);
        clientes.add(apellido);
        clientes.add(tel);
        clientes.add(direccion);
    }
    
	//METODOS PARA READ LA INFORMACION
	//lectura para pantalla
	public String readInformation() {
		String info = "<html><h1>INFORMACION DEL CLIENTE</h1>";
		info = info + "<p> Id:          " + clientes.get(0) + "</p>";
		info = info + "<p> Nombre:	    " + clientes.get(1) + "</p>";
		info = info + "<p> Apellido:	" + clientes.get(2) + "</p>";
		info = info + "<p> Tel:	        " + clientes.get(3) + "</p>";
		info = info + "<p> Direccion:	" + clientes.get(4) + "</p>";

		return info;
	}
    
    
	//lectura para archivo txt
    public String lineInformation() {
        StringBuilder info = new StringBuilder("");
        for (String cliente : clientes) {
            info.append(cliente).append("\t");
        }
        info.append("\n");
        return info.toString();
    }
    
  //METODOS PARA OBTENER "GETTERS" INFORMACION DEL CLIENTE USADOS POR OTRAS CLASES
  	public String getId() {
  		return this.clientes.get(0);
  	}
  	public String getNombre() {
  		return this.clientes.get(1);
  	}
  	public String getApellido() {
  		return this.clientes.get(2);
  	}
  	public String getTel() {
  		return this.clientes.get(3);
  	}
  	public String getDireccion() {
  		return this.clientes.get(4);
  	}

  	
  //METODOS PARA UPDATE INFORMACION
    public void updateDatosBasicos(String id, String nombre, String apellido, String tel, String direccion) {
        clientes.set(0, id);
        clientes.set(1, nombre);
        clientes.set(2, apellido);
        clientes.set(3, tel);
        clientes.set(4, direccion);
    }
    
    /*
    public void borrarCliente(String id) {
        clientes.removeIf(cliente -> cliente.get(0).equals(id));
    }
    */
}
