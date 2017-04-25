/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

/**
 *
 * @author Jorge
 */
public class Evaluacion {
   private Asignatura clase;
   private String fecha;
    
   private int añoE;
   private int mesE;
   private int diaE;
   
   
    public void set(int dia, int mes,int año){
        this.añoE=año; this.mesE=mes; this.diaE=dia;
    }
    
    public int getDia(){return this.diaE;}
    public int getMes(){return this.mesE;}
    public int getAño(){return this.añoE;}
    
    public boolean asociarAsignatura(Asignatura ramo){
       this.clase=ramo;
       return true;
    }
    
}
