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
        view.btnRestaurarListener(new buttonRestaurarListener());
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
        
        
        

    }
     
    
  //---CONTROLLER VENTANA INICIO
    class buttonMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("menu");
        }
    }
    class buttonCrearCopiaSeguridadListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	//model.
        }
    }
    class buttonRestaurarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	//model.
        }
    }
    
    
  //---CONTROLLER VENTANA MENU
    class buttonProveedoresListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("funciones");
        	//model. va a proveedores
        }
    }
    class buttonClientesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("funciones");
        	//model. va a clientes
        }
    }
    class buttonProductosListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("funciones");
        	//model. va a productos
        }
    }
    class buttonRegistroVentasListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("funciones");
        	//model. va a registro V.
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
        	//view.cambiarVentana("agregar");
        }
    }
    class buttonActualizarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	//view.cambiarVentana("Actualizar");
        }
    }
    class buttonBorrarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	//view.cambiarVentana("Borrar");
        }
    }
    class buttonMostrarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	//view.cambiarVentana("Mostrar")
        }
    }
    class buttonAtrasFuncionesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	view.cambiarVentana("menu");
        }
    }
    
    
    
}
