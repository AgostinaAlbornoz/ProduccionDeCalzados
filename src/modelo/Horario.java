/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Horario {
    
    private int horaI;
    private int horaF;

    public Horario() {
    }

    public Horario(int horaI, int horaF) {
        this.horaI = horaI;
        this.horaF = horaF;
    }

    public int getHoraI() {
        return horaI;
    }

    public void setHoraI(int horaI) {
        this.horaI = horaI;
    }

    public int getHoraF() {
        return horaF;
    }

    public void setHoraF(int horaF) {
        this.horaF = horaF;
    }

    @Override
    public String toString() {
        return "Horario{" + "horaI=" + horaI + ", horaF=" + horaF + '}';
    }
    
    
    
}
