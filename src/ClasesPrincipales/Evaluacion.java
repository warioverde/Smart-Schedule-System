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
   private String codigo;

    public Evaluacion(String codigo,int diaE, int mesE, int añoE, String tipo) {
        this.añoE = añoE;
        this.mesE = mesE;
        this.diaE = diaE;
        this.tipo = tipo;
        this.codigo=codigo;
    }
   
   

   public void set(int dia, int mes,int año,String tipo){
        this.añoE=año; this.mesE=mes; this.diaE=dia; this.tipo=tipo;
    }
    
    public int getDia(){return this.diaE;}
    public int getMes(){return this.mesE;}
    public int getAño(){return this.añoE;}
    
    public String getTipo(){return this.tipo;}

    public void setAñoE(int añoE) {
        this.añoE = añoE;
    }

    public void setMesE(int mesE) {
        this.mesE = mesE;
    }

    public void setDiaE(int diaE) {
        this.diaE = diaE;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    
    
    
}
