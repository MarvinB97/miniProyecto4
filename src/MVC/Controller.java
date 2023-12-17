package MVC;

import MVC.View;
import MVC.Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Xavier , Marvin Nuñez, Genaro Vegas
 */
public class Controller {
    private Model model;
    private View view;
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        
      //---CONTROLLER VENTANA INICIO
        view.btnMenuListener(new buttonMenuListener());
        view.btnCrearCopiaSeguridadListener(new buttonCrearCopiaSeguridadListener());
        view.btnRestaurarCopiaSeguridadListener(new buttonRestaurarCopiaSeguridadListener());
      //---CONTROLLER VENTANA MENU
        view.btnProveedoresListener(new buttonProveedoresListener());
        view.btnClientesListener(new buttonClientesListener());
        view.btnProductosListener(new buttonProductosListener());
        view.btnRegistroVentasListener(new buttonRegistroVentasListener());
        view.btnAtrasMenuListener(new buttonAtrasMenuListener());
      //---CONTROLLER VENTANA FUNCIONES
        view.btnAgregarListener(new buttonAgregarListener());
        view.btnActualizarListener(new buttonActualizarListener());
        view.btnBorrarListener(new buttonBorrarListener());
        view.btnMostrarListener(new buttonMostrarListener());
        view.btnAtrasFuncionesListener(new buttonAtrasFuncionesListener());
      //---CONTROLLER VENTANA AGREGAR
        view.btnGuardarAgregarListener(new buttonGuardarAgregarListener());
      //---CONTROLLER VENTANA CONSULTA 
        view.btnAceptarConsultaListener(new buttonAceptarConsultaListener());
        
        

    }
     
    
  //---CONTROLLER VENTANA INICIO
    class buttonMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("menu");
        }
    }
    class buttonCrearCopiaSeguridadListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	model.createBackup();
        	view.cambiarVentana("exito");
        }
    }
    class buttonRestaurarCopiaSeguridadListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	model.recoverBackup();
        	view.cambiarVentana("exito");
        }
    }
    
    
  //---CONTROLLER VENTANA MENU
    class buttonProveedoresListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("funciones");
        	view.setTipo("proveedores");
        	model.setTipo("proveedores");
        }
    }
    class buttonClientesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("funciones");
        	view.setTipo("clientes");
        	model.setTipo("clientes");
        }
    }
    class buttonProductosListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("funciones");
        	view.setTipo("productos");
        	model.setTipo("productos");
        }
    }
    class buttonRegistroVentasListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("funciones");
        	view.setTipo("registroVentas");
        	model.setTipo("registroVentas");
        }
    }
    class buttonAtrasMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("inicio");
        }
    }
    
    
  //---CONTROLLER VENTANA FUNCIONES
    class buttonAgregarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	model.setFuncion("agregar");
        	view.cambiarVentana("agregar");
        }
    }
    class buttonActualizarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	model.setFuncion("actualizar");
        	view.cambiarVentana("consulta");
        }
    }
    class buttonBorrarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	model.setFuncion("borrar");
        	view.cambiarVentana("consulta");
        }
    }
    class buttonMostrarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	model.setFuncion("mostrar");
        	view.cambiarVentana("consulta");
        }
    }
    class buttonAtrasFuncionesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("menu");
        }
    }
    
    
    
    
  //---CONTROLLER VENTANA AGREGAR
    class buttonGuardarAgregarListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
        	try {
        		model.addInformation(view.getVal1(), view.getVal2(), view.getVal3(),
        			view.getVal4(), view.getVal5());
        		view.cambiarVentana("exito");
        		view.setInformation("","","","","");//limpia los inputs
        	}catch(Exception e){
            	view.cambiarVentana("error");
        	}
        }
    }
    
    
   
  //---CONTROLLER VENTANA CONSULTA
    class buttonAceptarConsultaListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
        	try {
        		if(model.getFuncion().equals("actualizar")) {
        			model.setIdCod(view.getConsulta());
        			view.setInformation(model.getVal1(),model.getVal2(),model.getVal3(),
            				model.getVal4(),model.getVal5());
            		view.cambiarVentana("agregar");
				}else if(model.getFuncion().equals("borrar")) {
					model.setIdCod(view.getConsulta());
					if(model.indice() == -1) {
						view.cambiarVentana("error");
					}else {
						model.eraseInformation();
						view.cambiarVentana("exito");
					}
				}else if(model.getFuncion().equals("mostrar")) {
					model.setIdCod(view.getConsulta());
					if(model.indice() == -1) {
						view.cambiarVentana("error");
					}else {
						model.showInformation();
						view.setInformationShow(model.showInformation());
						view.cambiarVentana("mostrar");
					}
				}
        	}catch(Exception e){
            	view.cambiarVentana("error");
        	}
        }
    }
    
    
    
    
    
    
}
