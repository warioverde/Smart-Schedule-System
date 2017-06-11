/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipales;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Asignatura {
   private ArrayList<Evaluacion> pruebas;
   private String nombre;
   private String codigo;
   
    public Asignatura(Evaluacion evaluacion, String nombre) {
        
        this.pruebas = new ArrayList<Evaluacion>();
        this.nombre = nombre;
        //agregarPrueba(evaluacion);
    }
    
    public Asignatura(String codigo,String nombre){
        this.pruebas = new ArrayList<Evaluacion>();
        this.codigo=codigo;
        this.nombre=nombre;
    }
   public void agregarPrueba(Evaluacion prueba){
       this.pruebas.add(prueba);
       //return true;
      }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    
}
