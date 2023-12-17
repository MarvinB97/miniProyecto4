/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MVC;

//import Modelo.Sonido;
import javax.swing.*;

import Clientes.Clientes;
import Productos.Productos;
import Proveedores.Proveedores;
import RegistroVentas.RegistroVentas;

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
	
	//Icono
	JLabel etiquetaImagen = new JLabel();

	
	CardLayout cardLayout;
	
	//PANELES DE LAS DIFERENTES VENTANAS
	JPanel  panelInicio = new JPanel(), panelMenu = new JPanel(), 
			panelFunciones = new JPanel(), panelAgregar = new JPanel(),
			panelConsulta = new JPanel(), panelMostrar = new JPanel(),
			panelExito = new JPanel(), panelError = new JPanel();
	
	      //nota: primero pregunta en actualizar, borrar y mostrar, el id o cod.
	      // en actualizar redirige a agregar para actualizar los campos
	
	
	//----Se introduce en un subpanel los botones e inputs
	JPanel btnPanelInicio = new JPanel(), btnPanelMenu = new JPanel(), 
		   btnPanelFunciones = new JPanel(), inputPanelAgregarContacto = new JPanel(),
		   inputPanelConsulta = new JPanel();
	
	//TITULOS DE LAS DIFERENTES VENTANAS
	JLabel labelInicio, labelMenu, labelFunciones, labelAgregar,labelConsulta, 
	       labelMostrar, labelExito,labelError;
	
	//BOTONES DEL INICIO
	JButton btnMenu, btnCrearCopiaSeguridad, btnRestaurarCopiaSeguridad;
	//BOTONES DEL MENU
	JButton btnClientes, btnProveedores, 
	        btnProductos, btnRegistroVentas, btnAtrasMenu;
	//BOTONES DE LAS FUNCIONES
	JButton btnAgregar, btnActualizar, btnBorrar, btnMostrar, btnAtrasFunciones;
	

	//LABELS E INPUTS AGREGAR - ACTUALIZAR
	JTextField inputVal1, inputVal2, inputVal3, inputVal4, inputVal5;
	JLabel lblVal1, lblVal2, lblVal3, lblVal4, lblVal5;
	JButton btnGuardarAgregar;
	
	
	//LABELS E INPUTS CONSULTA .. ACTUALIZAR, BORRAR, MOSTRAR (PREGUNTA EL ID O COD)
	JLabel lblIdCodConsulta;
	JTextField inputIdCodConsulta;
	JButton btnAceptarConsulta;
	
	//LABELS MOSTRAR 
	JLabel lblMostrarInformacion;
	JButton btnIrInicioMostrar;
	
	
	
	//-----VENTANAS MENSAJES DE ERROR-----------
	JLabel lblExito,lblError;
	JButton btnIrInicioError, btnAtrasError;
	
	
	
	public View() {
     
        frame.setSize(400, 600);
        
        cardLayout = new CardLayout();
        
        panel.setLayout(cardLayout);
        panelInicio.setLayout(new BorderLayout());
        panelMenu.setLayout(new BorderLayout());
        panelFunciones.setLayout(new BorderLayout());
        panelAgregar.setLayout(new BorderLayout());
        panelConsulta.setLayout(new BorderLayout());
        panelMostrar.setLayout(new BorderLayout());

        
        
        panel.add(panelInicio, "inicio");
        panel.add(panelMenu, "menu");
        panel.add(panelFunciones, "funciones");
        panel.add(panelAgregar, "agregar");
        panel.add(panelConsulta, "consulta");//sirve para actualizar, borrar y mostrar
        panel.add(panelMostrar, "mostrar");
        
        
        panel.add(panelExito, "exito");
        panel.add(panelError, "error");
        
        
        //----COLOR DE FONDO DE LAS VENTANAS
        panelInicio.setBackground(Color.BLACK);
        panelMenu.setBackground(Color.BLACK);
        panelFunciones.setBackground(Color.BLACK);
        panelAgregar.setBackground(Color.BLACK);
        panelConsulta.setBackground(Color.BLACK);
        panelMostrar.setBackground(Color.BLACK);
        panelExito.setBackground(Color.BLACK);
        panelError.setBackground(Color.BLACK);
        
        
        
        
        //TITULOS DE CADA VENTANA
        labelInicio = new JLabel("<html><h2 style = 'color: white;'>Supermercado</h2>"
      		            + "<center><h1 style = 'color: white;'>UV</h1></center></html>", SwingConstants.CENTER);
        labelMenu = new JLabel("<html><h2 style = 'color: white;'>Menu</h2></html>", SwingConstants.CENTER);
        labelFunciones = new JLabel("<html><h2 style = 'color: white;'>Opciones</h2></html>", SwingConstants.CENTER);
        labelAgregar =  new JLabel("<html><h2 style = 'color: white;'>LLENA LOS CAMPOS</h2></html>", SwingConstants.CENTER);
        labelConsulta = new JLabel("<html><h2 style = 'color: white;'>Ingresa el Id o Cod</h2></html>", SwingConstants.CENTER);
        labelMostrar = new JLabel("<html><h2 style = 'color: white;'>Información Almacenada</h2></html>", SwingConstants.CENTER);
        
        labelExito =  new JLabel("<html><h2 style = 'color: white;'>Fue un Exito,</h2>"
        		              + "<p style = 'color: white;'>Regresa al inicio.</p></html>", SwingConstants.CENTER);
        labelError = new JLabel("<html><h2 style = 'color: white;'>A ocurrido un Error,</h2>"
  		              + "<p style = 'color: white;'>Vuelve a intentarlo.</p></html>", SwingConstants.CENTER);
        
        
        //--color letra titulos
        
        
        
        //------------BOTONES DEL INICIO---------------------
        btnMenu = new JButton("Menu");
        btnCrearCopiaSeguridad = new JButton("Crear Copia de Seguridad");
        btnRestaurarCopiaSeguridad = new JButton("Restaurar Copia de Seguridad");
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
        //-------------LABELS E INPUTS DE AGREGAR---------------
        inputVal1 = new JTextField();
        inputVal2 = new JTextField();
        inputVal3 = new JTextField();
        inputVal4 = new JTextField();
        inputVal5 = new JTextField();
    	lblVal1 = new JLabel("VAL1");
    	lblVal2 = new JLabel("VAL2");
    	lblVal3 = new JLabel("VAL3");
    	lblVal4 = new JLabel("VAL4");
    	lblVal5 = new JLabel("VAL5");
    	btnGuardarAgregar = new JButton("Guardar");
       
    	//-------------LABELS E INPUTS DE CONSULTA---ACTUALIZAR, BORRAR, MOSTRAR---------------
    	//CONSULTA
    	lblIdCodConsulta = new JLabel("Id o Cod");
    	inputIdCodConsulta = new JTextField();
        btnAceptarConsulta = new JButton("Aceptar");
    	
    	
        //-------------BOTONES DE LAS MOSTRAR---------------
        lblMostrarInformacion = new JLabel("");
        btnIrInicioMostrar = new JButton("Ir al inicio");
        
        
    	
    	//-------------BOTONES DE LAS EXITO-ERROR---------------
        btnIrInicioError = new JButton("Ir al Inicio");
    	btnAtrasError = new JButton("Ir al Inicio");
        
    	
    	
        //------------------SUBPANELES DE LOS BLOQUES DE BOTONES E INPUTS
        
        btnPanelInicio.setLayout(new GridLayout(3,1,10,10));//1 columna, 3 filas
        btnPanelMenu.setLayout(new GridLayout(4,1,50,50));
        btnPanelFunciones.setLayout(new GridLayout(4,1,50,50));        
        inputPanelAgregarContacto.setLayout(new GridLayout(10,1,5,5));
        inputPanelConsulta.setLayout(new GridLayout(3,1,5,5));
        
        

        
        //-------------SE AÑADEN LOS BOTONES A SUS RESPECTIVOS PANELES------
        btnPanelInicio.add(btnMenu);
        btnPanelInicio.add(btnCrearCopiaSeguridad);
        btnPanelInicio.add(btnRestaurarCopiaSeguridad);
        
        btnPanelMenu.add(btnProveedores);
        btnPanelMenu.add(btnClientes);
        btnPanelMenu.add(btnProductos);
        btnPanelMenu.add(btnRegistroVentas);
        
        btnPanelFunciones.add(btnAgregar);
        btnPanelFunciones.add(btnActualizar);
        btnPanelFunciones.add(btnBorrar);
        btnPanelFunciones.add(btnMostrar);
        
        
        inputPanelAgregarContacto.add(lblVal1);
        inputPanelAgregarContacto.add(inputVal1);
        inputPanelAgregarContacto.add(lblVal2);
        inputPanelAgregarContacto.add(inputVal2);
        inputPanelAgregarContacto.add(lblVal3);
        inputPanelAgregarContacto.add(inputVal3);
        inputPanelAgregarContacto.add(lblVal4);
        inputPanelAgregarContacto.add(inputVal4);
        inputPanelAgregarContacto.add(lblVal5);
        inputPanelAgregarContacto.add(inputVal5);
        
   
        //consulta
        inputPanelConsulta.add(lblIdCodConsulta);
        inputPanelConsulta.add(inputIdCodConsulta);
        inputPanelConsulta.add(btnAceptarConsulta);

        
        
        
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

        //---VENTANA AGREGAR--
        panelAgregar.add(labelAgregar, BorderLayout.NORTH);
        panelAgregar.add(inputPanelAgregarContacto, BorderLayout.CENTER);
        panelAgregar.add(btnGuardarAgregar, BorderLayout.SOUTH);
        
        
        //---VENTANA CONSULTA--
        panelConsulta.add(labelConsulta, BorderLayout.NORTH);
        panelConsulta.add(inputPanelConsulta, BorderLayout.SOUTH);
        
        
        //---VENTANA MOSTRAR--
        panelMostrar.add(labelMostrar, BorderLayout.NORTH);
        panelMostrar.add(lblMostrarInformacion, BorderLayout.CENTER);
        panelMostrar.add(btnIrInicioMostrar, BorderLayout.SOUTH);
    	
        
        //---VENTANA EXITO-ERROR--
        panelExito.add(labelExito, BorderLayout.CENTER);
        panelExito.add(btnIrInicioError, BorderLayout.SOUTH);
        
        panelError.add(labelError, BorderLayout.CENTER);
        panelError.add(btnAtrasError, BorderLayout.SOUTH);
        
        
        
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
	
	
	//-----------ACTIONS LISTENER DE LA VENTANA INICIO------------
	public void btnMenuListener(ActionListener listener) {
	    btnMenu.addActionListener(listener);
	}
	public void btnCrearCopiaSeguridadListener(ActionListener listener) {
	    btnCrearCopiaSeguridad.addActionListener(listener);
	}
	public void btnRestaurarCopiaSeguridadListener(ActionListener listener) {
		btnRestaurarCopiaSeguridad.addActionListener(listener);
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
	    btnIrInicioError.addActionListener(listener);
	    btnIrInicioMostrar.addActionListener(listener);
	    btnAtrasError.addActionListener(listener);
	}
	
	
	//cambiar etiquetas de los labels en agregar
	public void setTipo(String tipo) {
		if((tipo == "proveedores")||(tipo == "clientes")) {
	    	lblVal1.setText("Id");
	    	lblVal2.setText("Nombre");
	    	lblVal3.setText("Apellido");
	    	lblVal4.setText("Tel");
	    	lblVal5.setText("Direccion");
		}else if(tipo == "productos"){
			lblVal1.setText("Codigo");
	    	lblVal2.setText("Nombre");
	    	lblVal3.setText("Id Proveedor");
	    	lblVal4.setText("Costo Producto");
	    	lblVal5.setText("Cantidad Producto");
		}else if(tipo == "registroVentas"){
			lblVal1.setText("Id Cliente");
	    	lblVal2.setText("Cod. Producto");
	    	lblVal3.setText("Fecha");
	    	lblVal4.setText("Cantidad Producto");
	    	lblVal5.setText("Valor Total");
		}
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
	
	
	//-----------ACTIONS LISTENER DE LA VENTANA AGREGAR------------
	//--------getters-Inputs-----------
	public String getVal1() {
		return this.inputVal1.getText();
	}
	public String getVal2() {
		return this.inputVal2.getText();
	}
	public String getVal3() {
		return this.inputVal3.getText();
	}
	public String getVal4() {
		return this.inputVal4.getText();
	}
	public String getVal5() {
		return this.inputVal5.getText();
	}
	
	
	public void btnGuardarAgregarListener(ActionListener listener) {
	    btnGuardarAgregar.addActionListener(listener);
	}
	
	
	//-----------ACTIONS LISTENER DE LA VENTANA CONSULTA------------
	//--------getters-Inputs-----------
	public String getConsulta() {
		return this.inputIdCodConsulta.getText();
	}
	
	public void btnAceptarConsultaListener(ActionListener listener) {
		btnAceptarConsulta.addActionListener(listener);
	}
	
	public void setInformation(String val1, String val2, String val3, String val4,
			String val5) {
		inputVal1.setText(val1);
        inputVal2.setText(val2);
        inputVal3.setText(val3);
        inputVal4.setText(val4);
        inputVal5.setText(val5);	
	}

	
	
	//-----------ACTIONS LISTENER DE LA VENTANA MOSTRAR------------
	
	public void setInformationShow(String lbl) {
		lblMostrarInformacion.setText(lbl);
	}
	
	
	
	
}
