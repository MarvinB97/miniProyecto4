package Proveedores;

import java.util.ArrayList;

public class Proveedores {
	
	ArrayList<String> datosBasicos = new ArrayList<String>();
	//identificador del producto
	ArrayList<String> codProductos = new ArrayList<String>();
	//costo producto por unidad
	ArrayList<Integer> costoProductos = new ArrayList<Integer>();
	//total de la cantidad del producto compradas al mes
	ArrayList<Integer> cantProductos = new ArrayList<Integer>();
	
	//METODO CONSTRUCTOR ES EL CREATE PARA LOS PROVEEDORES
	//Se añade un proveedor con un producto -> Requisito
	public Proveedores(String id, String nombre, String apellido, 
			String tel, String direccion, String cod, int costo, int cant) {
		this.datosBasicos.add(id);
		this.datosBasicos.add(nombre);
		this.datosBasicos.add(apellido);
		this.datosBasicos.add(tel);
		this.datosBasicos.add(direccion);
		this.codProductos.add(cod);
		this.costoProductos.add(costo);
		this.cantProductos.add(cant);
	}
	
	//METODOS PARA READ LA INFORMACION
	public String readInformation() {
		String info = "<html><h1>INFORMACION DEL PROVEERDOR</h1>";
		info = info + "<p> Id:          " + datosBasicos.get(0) + "</p>";
		info = info + "<p> Nombre:	    " + datosBasicos.get(1) + "</p>";
		info = info + "<p> Apellido:	" + datosBasicos.get(2) + "</p>";
		info = info + "<p> Tel:	        " + datosBasicos.get(3) + "</p>";
		info = info + "<p> Direccion:	" + datosBasicos.get(4) + "</p>";
		info = info + "<p> ---------------------------</p>";
		info = info + "<p> Cod. Prod.     Costo     Cantidad </p>";
		
		for(int i=0; i<codProductos.size(); i++) {
			info = info + "<p>" + codProductos.get(i) + "  " 
		           + costoProductos.get(i) + "  " + cantProductos.get(i) + "</p>";
		}
		info = info + "<p> ---------------------------</p>";
		
		return info;
	}
	
	//METODOS PARA OBTENER "GETTERS" INFORMACION DEL PROVEEDOR USADOS POR OTRAS CLASES
	public String getId() {
		return this.datosBasicos.get(0);
	}
	public String getNombre() {
		return this.datosBasicos.get(1);
	}
	public String getApellido() {
		return this.datosBasicos.get(2);
	}
	public String getTel() {
		return this.datosBasicos.get(3);
	}
	public String getDireccion() {
		return this.datosBasicos.get(4);
	}
	
	public int getCantProductos() {
		return this.codProductos.size();
	}
	public String getCodProducto(int indice) {
		return this.codProductos.get(indice);
	}
	public int getCostoProducto(int indice) {
		return this.costoProductos.get(indice);
	}
	public int getCantProducto(int indice) {
		return this.cantProductos.get(indice);
	}
	
	
	//METODOS PARA UPDATE INFORMACION Y AÑADIR PRODUCTOS
	public void addProducto(String cod, int costo, int cant) {
		this.codProductos.add(cod);
		this.costoProductos.add(costo);
		this.cantProductos.add(cant);
	}
	
	public void updateDatosBasicos(String id, String nombre, String apellido, 
			String tel, String direccion) {
		this.datosBasicos.set(0,id);
		this.datosBasicos.set(1,nombre);
		this.datosBasicos.set(2,apellido);
		this.datosBasicos.set(3,tel);
		this.datosBasicos.set(4,direccion);
	}
	
	//actualizamos con este metodo el costo y la cant comprada al mes
	public void updateProducto(String cod, int costo, int cant) {
		int indice = codProductos.indexOf(cod);
		this.costoProductos.set(indice, costo);
		this.cantProductos.set(indice, cant);
	}
	
	//METODO PARA BORRAR PRODUCTO
	public void deleteProducto(String cod) {
		int indice = codProductos.indexOf(cod);
		this.codProductos.remove(indice);
		this.costoProductos.remove(indice);
		this.cantProductos.remove(indice);
	}
}
