package MVC;

import Productos.Productos;

import java.util.ArrayList;

import Clientes.Clientes;
import Proveedores.Proveedores;
import Productos.Productos;
import RegistroVentas.RegistroVentas;

import File.File; //lectura y actualización de datos en memoria


public class Model {

	//identificador de tipo (proveedor, cliente, regi.Venta, producto)
	String tipo;
	//id o cod para las consultas
	String IdCod;
	//funcion
	String funcion;
	
	//--para las copias de seguridad
	static File file = new File();
	
	
	//vectores de los objetos
    private ArrayList<Proveedores> proveedores = new ArrayList<Proveedores>();
    private ArrayList<Clientes> clientes = new ArrayList<Clientes>();
    private ArrayList<Productos> productos = new ArrayList<Productos>();
    private ArrayList<RegistroVentas> registroVentas = new ArrayList<RegistroVentas>();
    
	
	public Model() {
		// TODO Auto-generated constructor stub
	}
	
	//Metodos setters
	public void setTipo(String type) {
		this.tipo = type;
	}
	
	public void setIdCod(String IdCod) {
		this.IdCod = IdCod;
	}
	
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	
	//Metodos Getters
	public String getFuncion() {
		return this.funcion;
	}
	
	public String getVal1() {
		String valor = "";
		
		if(tipo == "proveedores") {
			valor = proveedores.get(indice()).getId();
		}else if(tipo == "clientes"){
			valor = clientes.get(indice()).getId();
		}else if(tipo == "productos"){
			valor = productos.get(indice()).getCodProducto();
		}else if(tipo == "registroVentas"){
			valor = registroVentas.get(indice()).getIdCliente();
		}
		return valor;
	}
	
	public String getVal2() {
		String valor = "";
		
		if(tipo == "proveedores") {
			valor = proveedores.get(indice()).getNombre();
		}else if(tipo == "clientes"){
			valor = clientes.get(indice()).getNombre();
		}else if(tipo == "productos"){
			valor = productos.get(indice()).getNombreProducto();
		}else if(tipo == "registroVentas"){
			valor = registroVentas.get(indice()).getCodProducto();
		}
		return valor;
	}
	
	public String getVal3() {
		String valor = "";
		
		if(tipo == "proveedores") {
			valor = proveedores.get(indice()).getApellido();
		}else if(tipo == "clientes"){
			valor = clientes.get(indice()).getApellido();
		}else if(tipo == "productos"){
			valor = productos.get(indice()).getIdProveedor();
		}else if(tipo == "registroVentas"){
			valor = registroVentas.get(indice()).getFecha();
		}
		return valor;
	}
	
	public String getVal4() {
		String valor = "";
		
		if(tipo == "proveedores") {
			valor = proveedores.get(indice()).getTel();
		}else if(tipo == "clientes"){
			valor = clientes.get(indice()).getTel();
		}else if(tipo == "productos"){
			valor = productos.get(indice()).getCostoProducto();
		}else if(tipo == "registroVentas"){
			valor = registroVentas.get(indice()).getCantProductos();
		}
		return valor;
	}
	
	public String getVal5() {
		String valor = "";
		
		if(tipo == "proveedores") {
			valor = proveedores.get(indice()).getDireccion();
		}else if(tipo == "clientes"){
			valor = clientes.get(indice()).getDireccion();
		}else if(tipo == "productos"){
			valor = productos.get(indice()).getCantProducto();
		}else if(tipo == "registroVentas"){
			valor = registroVentas.get(indice()).getCostoTotal();
		}
		return valor;
	}
	
	
	
	
	
	//--------------------METODOS DE AGREGAR---------------------------
	public void addInformation(String val1, String val2,String val3,
			String val4, String val5) {
		if(tipo == "proveedores") {
			proveedores.add(new Proveedores(val1, val2, val3, val4, val5));
			//String id String nombre, String apellido, String tel, String direccion
		}else if(tipo == "clientes"){
			clientes.add(new Clientes(val1, val2, val3, val4, val5));
			//String id, String nombre, String apellido, String tel, String direccion
		}else if(tipo == "productos"){
			productos.add(new Productos(val1, val2, val3, val4, val5));
			//String codProducto, String idProveedor, String costoProducto, String cantProducto
		}else if(tipo == "registroVentas"){
			registroVentas.add(new RegistroVentas(val1, val2, val3, val4, val5));
		}
	}
	
	//--------------------METODOS DE ACTUALIZAR---------------------------
	//se debe meter los valores en los inputs
	public void updateInformation(String val1, String val2,String val3,
			String val4, String val5) {
		if(tipo == "proveedores") {
			proveedores.set(indice(), new Proveedores(val1, val2, val3, val4, val5));
			//String id String nombre, String apellido, String tel, String direccion
		}else if(tipo == "clientes"){
			clientes.set(indice(), new Clientes(val1, val2, val3, val4, val5));
			//String id, String nombre, String apellido, String tel, String direccion
		}else if(tipo == "productos"){
			productos.set(indice(), new Productos(val1, val2, val3, val4, val5));
			//String codProducto, String idProveedor, String costoProducto, String cantProducto
		}else if(tipo == "registroVentas"){
			registroVentas.set(indice(), new RegistroVentas(val1, val2, val3, val4, val5));
			//String idCliente, String codProducto, String fecha, String cantProductos, String valorTotal
		}
	}
	

	//--------------------METODOS DE BORRAR---------------------------
	public void eraseInformation(){
		if(tipo == "proveedores") {
			proveedores.remove(indice());
		    //String id String nombre, String apellido, String tel, String direccion
		}else if(tipo == "clientes"){
			clientes.remove(indice());
			//String id, String nombre, String apellido, String tel, String direccion
		}else if(tipo == "productos"){
			productos.remove(indice());
			//String codProducto, String idProveedor, String costoProducto, String cantProducto
		}else if(tipo == "registroVentas"){
			registroVentas.remove(indice());
			//String idCliente, String codProducto, String fecha, String cantProductos, String valorTotal
		}
}
		
		
	//--------------------METODOS DE MOSTRAR---------------------------

	public String showInformation(){
		String txt = "";
		if(tipo == "proveedores") {
			txt = proveedores.get(indice()).readInformation();
			//String id String nombre, String apellido, String tel, String direccion
		}else if(tipo == "clientes"){
			txt = clientes.get(indice()).readInformation();
			//String id, String nombre, String apellido, String tel, String direccion
		}else if(tipo == "productos"){
			txt = productos.get(indice()).readInformation();
			//String codProducto, String idProveedor, String costoProducto, String cantProducto
		}else if(tipo == "registroVentas"){
			txt = registroVentas.get(indice()).readInformation();
			//String idCliente, String codProducto, String fecha, String cantProductos, String valorTotal
			
		}
		return txt;
	}

	
	
	
	//--------METODOS DE CREAR Y RECUPERAR COPIA DE SEGURIDAD----------

	public void vaciarVectores() {
		for(int i = 0; i < proveedores.size();i++) {
			proveedores.remove(0);
		}
		for(int i = 0; i < clientes.size();i++) {
			clientes.remove(0);
		}		
		for(int i = 0; i < productos.size();i++) {
			productos.remove(0);
		}
		for(int i = 0; i < registroVentas.size();i++) {
			registroVentas.remove(0);
		}
	}
	
	
 	public void createBackup() {
		ArrayList<String> vectNull = new ArrayList<String>();		
		ArrayList<String> vectAux = new ArrayList<String>();
		
	    for(int i=0;i<proveedores.size();i++) {
	    	vectAux.add(proveedores.get(i).lineInformation());
	    	}
	    file.updateFile("Proveedores", vectAux);
	    vectAux = vectNull;
	    
		for(int i=0;i<clientes.size();i++) {
	   		vectAux.add(clientes.get(i).lineInformation());
	   	}
	   	file.updateFile("Clientes", vectAux);
	    vectAux = vectNull;
	   	
		for(int i=0;i<productos.size();i++) {
    		vectAux.add(productos.get(i).lineInformation());
    	}
    	file.updateFile("Productos", vectAux);
	    vectAux = vectNull;
	
		for(int i=0;i<registroVentas.size();i++) {
    		vectAux.add(registroVentas.get(i).lineInformation());
    	}
    	file.updateFile("RegistroVentas", vectAux);
	    vectAux = vectNull;

	}
	
	public void recoverBackup() {
		String[] tipoAux = {"Proveedores", "Clientes", "Productos", "RegistroVentas"};
	    vaciarVectores();
		
	    int k=0;
		while(k<4) {
			String txt = file.readFile(tipoAux[k]);
			String[] lineas = txt.split("\n");

			// Crear un vector para almacenar las líneas   
			String[] vectorDeLineas = new String[lineas.length];
			int n;
        
            // Almacenar cada línea en el vector
            n = lineas.length;
            for (int i = 0; i < n; i++) {
            	vectorDeLineas[i] = lineas[i];
            }
        
            for (int i = 0; i < n; i++) {
            	String text = vectorDeLineas[i];
        	    String[] val = text.split("\t");
        	    
        	    //System.out.println(val[4]);
        	    
        	    if(k==0) {
                	proveedores.add(new Proveedores(val[0],val[1],val[2],val[3],val[4]));
        	    }else if(k==1) {
        			clientes.add(new Clientes(val[0],val[1],val[2],val[3],val[4]));
        	    }else if(k==2) {
        			productos.add(new Productos(val[0],val[1],val[2],val[3],val[4]));
        	    }else if(k==3) {
        			registroVentas.add(new RegistroVentas(val[0],val[1],val[2],val[3],val[4]));
        	    }
            }
            
            k++;
		}
		
	}
	
	
	
	
	
	
	
	
	public int indice() {
		int ind = -1;
		String str = "";
		if(tipo == "proveedores") {
			for(int i=0;i<proveedores.size();i++) {
				str = proveedores.get(i).getId();
				if(this.IdCod.equals(str)) {
					ind = i;
				}
			}
		}else if(tipo == "clientes"){
			for(int i=0;i<clientes.size();i++) {
				str = clientes.get(i).getId();
				if(this.IdCod.equals(str)) {
					ind = i;
				}
			}
		}else if(tipo == "productos"){
			for(int i=0;i<productos.size();i++) {
				str = productos.get(i).getCodProducto();
				if(this.IdCod.equals(str)) {
					ind = i;
				}
			}
		}else if(tipo == "registroVentas"){
			for(int i=0;i<registroVentas.size();i++) {
				str = registroVentas.get(i).getIdCliente();
				if(this.IdCod.equals(str)) {
					ind = i;
				}
			}
		}
		return ind;
	}
	

	
	
	
	
	
}
