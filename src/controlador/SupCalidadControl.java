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
public class SupCalidadControl {
    
    public static VentanaSCalidad ventana = new VentanaSCalidad();
    
    public static void mostrar(){ventana.setVisible(true);} // muestra la ventana principal del SC
    public static void ocultar(){ventana.setVisible(false);} // oculta la ventana principal del SC
    
}
