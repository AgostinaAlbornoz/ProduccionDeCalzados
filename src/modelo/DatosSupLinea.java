/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vistas.*;
import controlador.*;

/**
 *
 * @author gabri
 */
public class DatosSupLinea {
    
    private String horaInicio;
    private String horaFinal;
    private String horaProduccion;
    private String modelo;
    private String color;
    private String nroLinea;

    public DatosSupLinea() {
    }

    public DatosSupLinea(String horaInicio, String horaFinal, String horaProduccion, String modelo, String color, String nroLinea) {
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.horaProduccion = horaProduccion;
        this.modelo = modelo;
        this.color = color;
        this.nroLinea = nroLinea;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getHoraProduccion() {
        return horaProduccion;
    }

    public void setHoraProduccion(String horaProduccion) {
        this.horaProduccion = horaProduccion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNroLinea() {
        return nroLinea;
    }

    public void setNroLinea(String nroLinea) {
        this.nroLinea = nroLinea;
    }
    

    @Override
    public String toString() {
        return "DatosSupLinea{" + "horaInicio=" + horaInicio + ", horaFinal=" + horaFinal + ", horaProduccion=" + horaProduccion + ", modelo=" + modelo + ", color=" + color + ", nroLinea=" + nroLinea + '}';
    }

    
    
    

    
}
