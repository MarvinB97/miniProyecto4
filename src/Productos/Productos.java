package Productos;

import java.util.ArrayList;

public class Productos {

    private ArrayList<String> productos = new ArrayList<String>();

    public Productos(String codProducto, String idProveedor, String costoProducto, String cantProducto) {
        productos.add(codProducto);
        productos.add(idProveedor);
        productos.add(costoProducto);
        productos.add(cantProducto);
    }
    
	//METODOS PARA READ LA INFORMACION
	//lectura para pantalla
	public String readInformation() {
		String info = "<html><h1>INFORMACION DEL PRODUCTO</h1>";
		info = info + "<p> cod. Producto:    " + productos.get(0) + "</p>";
		info = info + "<p> Id. Proveedor:    " + productos.get(1) + "</p>";
		info = info + "<p> Costo Producto:   " + productos.get(2) + "</p>";
		info = info + "<p> Cant. Producto:   " + productos.get(3) + "</p>";

		return info;
	}
	
    public String lineInformation() {
        StringBuilder info = new StringBuilder("");
        for (String producto : productos) {
            info.append(producto).append("\t");
        }
        info.append("\n");
        return info.toString();
    }
    
    
    //METODOS PARA OBTENER "GETTERS" INFORMACION DEL PROVEEDOR USADOS POR OTRAS CLASES
  	public String getCodProducto() {
  		return this.productos.get(0);
  	}
  	public String getIdProveedor() {
  		return this.productos.get(1);
  	}
  	public String getCostoProducto() {
  		return this.productos.get(2);
  	}
  	public String getCantProducto() {
  		return this.productos.get(3);
  	}
  	
  	
  	

    public void updateDatosBasicos(String codProducto, String idProveedor, String costoProducto, String cantProducto) {
    	productos.set(0, codProducto);
    	productos.set(1, idProveedor);
    	productos.set(2, costoProducto);
    	productos.set(3, cantProducto);
    }
    
    /*
    public void borrarProducto(String codProducto) {
        productos.removeIf(producto -> producto.get(0).equals(codProducto));
    }*/
}
