/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class OrdenDeProduccion {
    
    private int objetivo;
    private int numeroOP;

    public OrdenDeProduccion() {
    }

    public OrdenDeProduccion(int objetivo, int numeroOP) {
        this.objetivo = objetivo;
        this.numeroOP = numeroOP;
    }
    
    public void iniciarOP(){
        
    }
    
    public void pausarOP(){
        
    }
    
    public void reanudarOP(){
        
    }
    
    public void finalizarOP(){
        
    }
    
    public int getNumeroOP() {
        return numeroOP;
    }

    public void setNumeroOP(int numeroOP) {
        this.numeroOP = numeroOP;
    }

    public int getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(int objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "OrdenDeProduccion{" + "objetivo=" + objetivo + ", numeroOP=" + numeroOP + '}';
    }
    
    
    
}
