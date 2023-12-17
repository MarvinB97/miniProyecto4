package RegistroVentas;

import java.util.ArrayList;

public class RegistroVentas {
	
	ArrayList<String> registro = new ArrayList<String>();
	
	//METODO CONSTRUCTOR ES EL CREATE PARA LOS REGISTRO VENTAS
	//Se añade un registro -> requisito: tener cliente y producto registrado
	public RegistroVentas(String idCliente, String codProducto, String fecha, 
			String cantProductos, String valorTotal) {//, String cod, int costo, int cant) {
		this.registro.add(idCliente);
		this.registro.add(codProducto);
		this.registro.add(fecha);
		this.registro.add(cantProductos);
		this.registro.add(valorTotal);
	}
	
	//METODOS PARA READ LA INFORMACION
	//lectura para pantalla
	public String readInformation() {
		String info = "<html><h1>INFORMACION DEL PROVEERDOR</h1>";
		info = info + "<p> Id Cliente:          " + registro.get(0) + "</p>";
		info = info + "<p> cod. Producto:	    " + registro.get(1) + "</p>";
		info = info + "<p> Fecha:	            " + registro.get(2) + "</p>";
		info = info + "<p> Cant. de Productos:	" + registro.get(3) + "</p>";
		info = info + "<p> Total Pagado:	    " + registro.get(4) + "</p>";

		return info;
	}
	
	//lectura para archivo txt
	public String lineInformation() {
		String txt = registro.get(0)+"\t"+registro.get(1)+"\t"+
				registro.get(2)+"\t"+registro.get(3)+"\t"+
				registro.get(4);
		return txt;
	}
	
	//METODOS PARA OBTENER "GETTERS" INFORMACION DEL PROVEEDOR USADOS POR OTRAS CLASES
	public String getIdCliente() {
		return this.registro.get(0);
	}
	public String getCodProducto() {
		return this.registro.get(1);
	}
	public String getFecha() {
		return this.registro.get(2);
	}
	public String getCantProductos() {
		return this.registro.get(3);
	}
	public String getCostoTotal() {
		return this.registro.get(4);
	}
	
	//METODOS PARA UPDATE INFORMACION Y AÑADIR PRODUCTOS
	/*public void addProducto(String cod, int costo, int cant) {
		this.codProductos.add(cod);
		this.costoProductos.add(costo);
		this.cantProductos.add(cant);
	}*/
	
	public void updateRegistros(String idCliente, String codProducto, String fecha, 
			String cantProductos, String valorTotal) {
		this.registro.set(0,idCliente);
		this.registro.set(1,codProducto);
		this.registro.set(2,fecha);
		this.registro.set(3,cantProductos);
		this.registro.set(4,valorTotal);
	}
	
}
