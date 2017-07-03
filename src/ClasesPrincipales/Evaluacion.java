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

   /**
    * Constructor de la clase Evaluacion.
    * @param codigo Codigo de la asignatura asociada a la evaluacion de tipo String
    * @param tipo Tipo de evaluacion de tipo String
    * @param diaE Dia de la evaluacion de tipo entero
    * @param mesE Mes de la evaluacion de tipo entero
    * @param añoE Año de la evaluacion de tipo entero
    */
    public Evaluacion(String codigo, String tipo,int diaE, int mesE, int añoE) {
        this.añoE = añoE;
        this.mesE = mesE;
        this.diaE = diaE;
        this.tipo = tipo;
        this.codigo=codigo;
    }
    
    /**
    * Retorna el dia de la evaluacion de tipo entero
    * @return Retorna el dia de la evaluacion de tipo entero
    */
    public int getDia(){return this.diaE;}
    
    /**
    * Retorna el dmes de la evaluacion de tipo entero
    * @return Retorna el mes de la evaluacion de tipo entero
    */
    public int getMes(){return this.mesE;}
    
    /**
    * Retorna el año de la evaluacion de tipo entero
    * @return Retorna el año de la evaluacion de tipo entero
    */
    public int getAño(){return this.añoE;}
    
    /**
    * Retorna el tipo de la evaluacion de tipo String
    * @return Retorna el tipo de la evaluacion de tipo String
    */
    public String getTipo(){return this.tipo;}

    /**
    * Establece el año de la evaluacion de tipo entero
    * @param añoE Año de la evaluacion de tipo entero
    */
    public void setAñoE(int añoE) {
        this.añoE = añoE;
    }

    /**
    * Establece el mes de la evaluacion de tipo entero
    * @param mesE mes de la evaluacion de tipo entero
    */
    public void setMesE(int mesE) {
        this.mesE = mesE;
    }

    /**
    * Establece el dia de la evaluacion de tipo entero
    * @param diaE dia de la evaluacion de tipo entero
    */
    public void setDiaE(int diaE) {
        this.diaE = diaE;
    }

    /**
    * Establece el tipo de evaluacion de tipo String
    * @param tipo Tipo de evaluacion de tipo String
    */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
    * Retorna el codigo de la asignatura asociada a la evaluacion.
    * @return Retorna el codigo de la asignatura asociada a la evaluacion.
    */
    public String getCodigo() {
        return codigo;
    }

    /**
    * Retorna la evaluacion como un String
    * @return Retorna la evaluacion como un String
    */
    @Override
    public String toString() {
        return "Evaluacion{" + "a\u00f1oE=" + añoE + ", mesE=" + mesE + ", diaE=" + diaE + ", tipo=" + tipo + ", codigo=" + codigo + '}';
    }
    
    
}
