/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MVC;

//import Modelo.Sonido;
import javax.swing.*;

import java.awt.*;
//import java.util.*;
import java.awt.event.ActionListener;

/**
 *
 * @author Xavier , Marvin Nuñez, Genaro Vegas
 * 
*/


public class View {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	CardLayout cardLayout;
	
	//PANELES DE LAS DIFERENTES VENTANAS
	JPanel  panelInicio = new JPanel(), panelMenu = new JPanel(), 
			panelFunciones = new JPanel();
	//----Se introduce en un subpanel los botones
	JPanel btnPanelInicio = new JPanel(), btnPanelMenu = new JPanel(), 
			btnPanelFunciones = new JPanel();
	
	//TITULOS DE LAS DIFERENTES VENTANAS
	JLabel labelInicio, labelMenu, labelFunciones;
	
	
	//BOTONES DEL INICIO
	JButton btnMenu, btnCrearCopiaSeguridad, btnRestaurar;
	//BOTONES DEL MENU
	JButton btnClientes, btnProveedores, 
	        btnProductos, btnRegistroVentas, btnAtrasMenu;
	//BOTONES DE LAS FUNCIONES
	JButton btnAgregar, btnActualizar, btnBorrar, btnMostrar, btnAtrasFunciones;
	

	//atributos de la clase (informacion)
	//nota: esto se debe utilizar en las ventanas de agregar y actualizar informacion
	JTextField inputId, inputNombre, inputApellido, inputTelefono,
		           inputDireccion, inputCodProducto, 
		           inputCostoProducto, inputCantProducto, inputFecha, 
		           inputCantProductos, inputValorTotal; 
	
	
	public View() {
     
        frame.setSize(400, 600);
        
        cardLayout = new CardLayout();
        
        panel.setLayout(cardLayout);
        panelInicio.setLayout(new BorderLayout());
        panelMenu.setLayout(new BorderLayout());
        panelFunciones.setLayout(new BorderLayout());
        
        panel.add(panelInicio, "inicio");
        panel.add(panelMenu, "menu");
        panel.add(panelFunciones, "funciones");
        
       

        
        //TITULOS DE CADA VENTANA
        labelInicio = new JLabel("<html><center><h2>Supermercado</h2>"
      		            + "<h1>UV</h1></center></html>");
        labelMenu = new JLabel("<html><center><h2>Menu</h2></html>");
        labelFunciones = new JLabel("<html><center><h2>Opciones</h2></html>");
      
        
        //------------BOTONES DEL INICIO---------------------
        btnMenu = new JButton("Clientes");
        btnCrearCopiaSeguridad = new JButton("Crear Copia de Seguridad");
        btnRestaurar = new JButton("Restaurar");
        //------------BOTONES DEL MENU---------------------
        btnClientes = new JButton("Clientes");
        btnProveedores = new JButton("Proveedores");
        btnProductos = new JButton("Productos");
        btnRegistroVentas = new JButton("Registro Ventas");
        btnAtrasMenu = new JButton("Atras");
        //-------------BOTONES DE LAS FUNCIONES---------------
        btnAgregar =  new JButton("Agregar");
        btnActualizar =  new JButton("Actualizar");
        btnBorrar =  new JButton("Borrar");
        btnMostrar = new JButton("Mostrar");
        btnAtrasFunciones = new JButton("Atras");
        
        
        
        
        //--------------EJEMPLOS DE LOS INPUTS
        //-------------INPUTS AGREGAR CONTACTOS-----------
        /*JLabel Id = new JLabel("Id");
        JLabel Nombre = new JLabel("Nombre");
        JLabel Apellido = new JLabel("Apellido");
        JLabel Direccion = new JLabel("Direccion");
        JLabel Telefono = new JLabel("Telefono");
        
        inputId = new JTextField();
        inputNombre = new JTextField();
        inputApellido = new JTextField();
        inputDireccion = new JTextField();
        inputTelefono = new JTextField();
        */
        
        
        
        
        //------------------SUBPANELES DE LOS BLOQUES DE BOTONES
        
        btnPanelInicio.setLayout(new GridLayout(3,1,10,10));//1 columna, 3 filas
        btnPanelMenu.setLayout(new GridLayout(4,1,50,50));
        btnPanelFunciones.setLayout(new GridLayout(4,1,50,50));        
        //inputPanelAgregarContacto.setLayout(new GridLayout(6,2,5,5));
        

        
        //-------------SE AÑADEN LOS BOTONES A SUS RESPECTIVOS PANELES------
        btnPanelInicio.add(btnMenu);
        btnPanelInicio.add(btnCrearCopiaSeguridad);
        btnPanelInicio.add(btnRestaurar);
        
        btnPanelMenu.add(btnProveedores);
        btnPanelMenu.add(btnClientes);
        btnPanelMenu.add(btnProductos);
        btnPanelMenu.add(btnRegistroVentas);
        
        btnPanelFunciones.add(btnAgregar);
        btnPanelFunciones.add(btnActualizar);
        btnPanelFunciones.add(btnBorrar);
        btnPanelFunciones.add(btnMostrar);
        
        /*
        inputPanelAgregarContacto.add(Id);
        inputPanelAgregarContacto.add(inputId);
        inputPanelAgregarContacto.add(Nombre);
        inputPanelAgregarContacto.add(inputNombre);
        inputPanelAgregarContacto.add(Apellido);
        inputPanelAgregarContacto.add(inputApellido);
        inputPanelAgregarContacto.add(Direccion);
        inputPanelAgregarContacto.add(inputDireccion);
        inputPanelAgregarContacto.add(Telefono);
        inputPanelAgregarContacto.add(inputTelefono);
        */
   
        
        //--------------------LOS BLOQUES SE AÑADEN A CADA PANEL DE UNA VENTANA
        
        //---VENTANA INICIO---
        panelInicio.add(labelInicio, BorderLayout.NORTH);
        panelInicio.add(btnPanelInicio, BorderLayout.SOUTH);
        
        //---VENTANA MENU--
        panelMenu.add(labelMenu, BorderLayout.NORTH);
        panelMenu.add(btnPanelMenu, BorderLayout.CENTER); 
        panelMenu.add(btnAtrasMenu, BorderLayout.SOUTH); 
        
        //---VENTANA FUNCIONES--
        panelFunciones.add(labelFunciones, BorderLayout.NORTH);
        panelFunciones.add(btnPanelFunciones, BorderLayout.CENTER);
        panelFunciones.add(btnAtrasFunciones, BorderLayout.SOUTH);
        
        
        //--VENTANA INPUTS--
        /*
        panel3.add(label3, BorderLayout.NORTH);
        panel3.add(inputPanelAgregarContacto, BorderLayout.CENTER);
        panel3.add(btnPanelAgregarContacto, BorderLayout.SOUTH);
        */
        
        //---EL PANEL PRINCIPAL QUE CONTIENE LOS PANELES DE LAS VENTANAS Y 
        //A SU VEZ ELLOS TIENEN LOS SUBPANELES DE BOTONES, SE AÑADE A EL FRAME
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
   }
	
	
	
	
	
	
	//----------CAMBIAR PANEL-----------
	public void cambiarVentana(String window) {
		this.cardLayout.show(panel, window);
	}
	
	//SIRVEN COMO EJEMPLO DE LOS INPUTS EN CLIENTES, PROVEE, ETC
	//--------getters-Inputs-----------
	public String getId() {
		return this.inputId.getText();
	}
	public String getNombre() {
		return this.inputNombre.getText();
	}
	public String getApellido() {
		return this.inputApellido.getText();
	}
	public String getDireccion() {
		return this.inputDireccion.getText();
	}
	public String getTelefono() {
		return this.inputTelefono.getText();
	}
	
	
	
	
	//-----------ACTIONS LISTENER DE LA VENTANA INICIO------------
	public void btnMenuListener(ActionListener listener) {
	    btnMenu.addActionListener(listener);
	}
	public void btnCrearCopiaSeguridadListener(ActionListener listener) {
	    btnCrearCopiaSeguridad.addActionListener(listener);
	}
	public void btnRestaurarListener(ActionListener listener) {
	    btnRestaurar.addActionListener(listener);
	}
	
	//-----------ACTIONS LISTENER DE LA VENTANA MENU------------
	public void btnProveedoresListener(ActionListener listener) {
	    btnProveedores.addActionListener(listener);
	}
	public void btnClientesListener(ActionListener listener) {
	    btnClientes.addActionListener(listener);
	}
	public void btnProductosListener(ActionListener listener) {
	    btnProductos.addActionListener(listener);
	}
	public void btnRegistroVentasListener(ActionListener listener) {
	    btnRegistroVentas.addActionListener(listener);
	}
	public void btnAtrasMenuListener(ActionListener listener) {
	    btnAtrasMenu.addActionListener(listener);
	}
	
	//-----------ACTIONS LISTENER DE LA VENTANA FUNCIONES------------
	public void btnAgregarListener(ActionListener listener) {
	    btnAgregar.addActionListener(listener);
	}
	public void btnActualizarListener(ActionListener listener) {
	    btnActualizar.addActionListener(listener);
	}
	public void btnBorrarListener(ActionListener listener) {
	    btnBorrar.addActionListener(listener);
	}
	public void btnMostrarListener(ActionListener listener) {
	    btnMostrar.addActionListener(listener);
	}
	public void btnAtrasFuncionesListener(ActionListener listener) {
	    btnAtrasFunciones.addActionListener(listener);
	}	
	
	
	/*
	public void btnInicioListener(ActionListener listener) {
	    btnMenu1.addActionListener(listener);
	    btnMenu2.addActionListener(listener);
	    btnMenu3.addActionListener(listener);
	}
	
	public void btnProfesorListener(ActionListener listener) {
		btntipoProfesores.addActionListener(listener);
	}
	public void btnEstudianteListener(ActionListener listener) {
		btntipoEstudiantes.addActionListener(listener);
	}
	public void btnEmpleadoListener(ActionListener listener) {
		btntipoEmpleados.addActionListener(listener);
	}
	
	public void btnGuardarListener(ActionListener listener) {
	    btnGuardar.addActionListener(listener);
	}*/
}
