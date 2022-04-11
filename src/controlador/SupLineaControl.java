/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vistas.*;

/**
 *
 * @author gabri
 */
public class SupLineaControl {
    
    
    public static VentanaSLinea ventana = new VentanaSLinea();
    
    public static void mostrar(){ventana.setVisible(true);} // muestra la ventana principal del SL
    public static void ocultar(){ventana.setVisible(false);} // oculta la ventana principal del SL
    
    String horaInicio = ventana.getjTextFieldHoraInicioSL().getText();
    String horaFinal = ventana.getjTextFieldHoraFinSL().getText();
    String modelo = (String)ventana.getjComboBoxModelo().getSelectedItem();
    String color = (String)ventana.getjComboBoxColor().getSelectedItem();
    String horaProduccion = ventana.getjTextFieldObjetivoProdSL().getText();
    String nroLinea = (String) ventana.getjComboBoxLineaTrabajo().getSelectedItem();
    
    
}
