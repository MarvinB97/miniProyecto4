package Clientes;

import java.util.ArrayList;

public class Clientes {

    private ArrayList<ArrayList<String>> clientes = new ArrayList<>();

    public void crearCliente(String id, String nombre, String apellido, String tel, String direccion) {
        ArrayList<String> cliente = new ArrayList<>();
        cliente.add(id);
        cliente.add(nombre);
        cliente.add(apellido);
        cliente.add(tel);
        cliente.add(direccion);
        clientes.add(cliente);
    }

    public String leerClientes() {
        StringBuilder info = new StringBuilder("INFORMACION DE CLIENTES\n");
        for (ArrayList<String> cliente : clientes) {
            info.append("Id: ").append(cliente.get(0)).append(", Nombre: ").append(cliente.get(1))
                .append(", Apellido: ").append(cliente.get(2)).append(", Tel: ").append(cliente.get(3))
                .append(", Direccion: ").append(cliente.get(4)).append("\n");
        }
        return info.toString();
    }

    public void actualizarCliente(String id, String nombre, String apellido, String tel, String direccion) {
        for (ArrayList<String> cliente : clientes) {
            if (cliente.get(0).equals(id)) {
                cliente.set(1, nombre);
                cliente.set(2, apellido);
                cliente.set(3, tel);
                cliente.set(4, direccion);
                break;
            }
        }
    }

    public void borrarCliente(String id) {
        clientes.removeIf(cliente -> cliente.get(0).equals(id));
    }
}

