/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipales;

/**
 *
 * @author Jorge
 */
public class Evaluacion {
   
    
   private int añoE;
   private int mesE;
   private int diaE;
   private String tipo;
   private String codigoAsignatura;
   
   
    public void set(int dia, int mes,int año,String codigoAsignatura,String tipo){
        this.añoE=año; this.mesE=mes; this.diaE=dia; this.codigoAsignatura=codigoAsignatura;this.tipo=tipo;
    }
    
    public int getDia(){return this.diaE;}
    public int getMes(){return this.mesE;}
    public int getAño(){return this.añoE;}
    public String getCodigo(){return this.codigoAsignatura;}
    public String getTipo(){return this.tipo;}
    
    
}
