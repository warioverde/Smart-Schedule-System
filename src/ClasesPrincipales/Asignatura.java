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
   private int horasExtra;
   private String[][] horario;
   
    
    public Asignatura(String codigo,String nombre,int horasExtra,String[][] horario){
        this.pruebas = new ArrayList<Evaluacion>();
        this.codigo=codigo;
        this.nombre=nombre;
        this.horasExtra=horasExtra;
        this.horario=horario;
    }
   public void agregarPrueba(String codigo,int año,int mes,int dia,String tipo){
       Evaluacion evaluacion = new Evaluacion(codigo,tipo,dia, mes, año);
       this.pruebas.add(evaluacion);
       //return true;
      }
   public void agregarPrueba(Evaluacion eva){
       this.pruebas.add(eva);
       //return true;
      }

    public String getHorario(int dia,int periodo) {
        return horario[dia][periodo];
    }
    
    public String[][] getHorario() {
        return horario;
    }

    public void setHorario(String[][] horario) {
        this.horario = horario;
    }
   
   
   
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
   
    
}
