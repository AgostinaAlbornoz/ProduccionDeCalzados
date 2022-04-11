/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Calzado {
    
    private String calidad;

    public Calzado() {
    }
    
    public Calzado(String calidad) {
        this.calidad = calidad;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    @Override
    public String toString() {
        return "Calzado{" + "calidad=" + calidad + '}';
    }
     
}
