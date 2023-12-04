package Productos;

import java.util.ArrayList;

public class Productos {

    private ArrayList<ArrayList<String>> productos = new ArrayList<>();

    public void crearProducto(String codProducto, String idProveedor, String costoProducto, String cantProducto) {
        ArrayList<String> producto = new ArrayList<>();
        producto.add(codProducto);
        producto.add(idProveedor);
        producto.add(costoProducto);
        producto.add(cantProducto);
        productos.add(producto);
    }

    public String leerProductos() {
        StringBuilder info = new StringBuilder("INFORMACION DE PRODUCTOS\n");
        for (ArrayList<String> producto : productos) {
            info.append("Código: ").append(producto.get(0)).append(", Id Proveedor: ").append(producto.get(1))
                .append(", Costo: ").append(producto.get(2)).append(", Cantidad: ").append(producto.get(3)).append("\n");
        }
        return info.toString();
    }

    public void actualizarProducto(String codProducto, String idProveedor, String costoProducto, String cantProducto) {
        for (ArrayList<String> producto : productos) {
            if (producto.get(0).equals(codProducto)) {
                producto.set(1, idProveedor);
                producto.set(2, costoProducto);
                producto.set(3, cantProducto);
                break;
            }
        }
    }

    public void borrarProducto(String codProducto) {
        productos.removeIf(producto -> producto.get(0).equals(codProducto));
    }
}
