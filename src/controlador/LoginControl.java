/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import vistas.*;

/**
 *
 * @author gabri
 */
public class LoginControl { // esta clase controla la ventana principal/inicial
    
    static String Error = "Error";
    
    public static VentanaLogin ventana = new VentanaLogin();
    
    
    public static void mostrar(){ventana.setVisible(true);} // muestra la ventana inicial
    public static void ocultar(){ventana.setVisible(false);} // oculta la ventana inicial
    
    public static void eventoLoggearse(){ // se activa al dar clic en el boton INGRESAR
        // se usan getters en las ventanas donde se escriben y/o seleccionan campos para poder llamarlas al controlador ya que son privadas
        String usuario = (String)ventana.getjComboBox1().getSelectedItem();
        String contraseña = ventana.getjPasswordField1().getText();
        
        
        
        if(usuario.equals("Supervisor de Linea") && contraseña.equals("44721") || usuario.equals("Supervisor de Linea") && contraseña.equals("46392") || usuario.equals("Supervisor de Linea") && contraseña.equals("46395")){
            
            ocultar(); // oculta la ventana login
            SupLineaControl.mostrar(); // muestra la ventana principal del supervisor de linea
            
        }else if (usuario.equals("Supervisor de Calidad") && contraseña.equals("43630") || usuario.equals("Supervisor de Calidad") && contraseña.equals("44538")){
                
            ocultar(); // oculta la ventana login
            SupCalidadControl.mostrar(); // muestra la ventana principal del supervisor de calidad
            
        }else{
            
            //System.out.println("Contraseña incorrecta");
            //JOptionPane.showMessageDialog(null, "Contraseña incorrecta",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta, por favor intentar nuevamente", Error, 0);
            
        }
        
    }
    
}
