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
public class GestorArchivo {
    
    public GestorArchivo(){}
    
    /*public void addAsignatura(String asignatura){
    //Llamar al archivo de asignaturas y añadir una nueva
    }
    public void addEvaluacion(String evaluacion){
    //Llamar al archivo de evaluaciones y añadir una nueva junto con el codigo de asignatura
    }
    
    public String getAsignatura(String codigo){
    //Buscar asignatura de codigo
    //retornar nombre,codigo u horario
    return "";
    }
    public String getEvaluacion(String codigo,int i){
    //Buscar evaluacion por codigo de asignatura
    //Retornar la evaluacion en la linea "i"
    return "";
    }*/
    
    //Para testeo
    
    String asignatura[]=new String[5];
    
    public void addAsignatura(String asignatura){
        //
    }
    public String searchAsignatura(String codigo){
        for (int i = 0; i < this.asignatura.length; i++) {
            String contador="";
            for (int j = 0; j < asignatura[i].length(); j++) {
                if (asignatura[i].charAt(j)==','){
                    if (contador.equals(codigo)){
                        return asignatura[i];
                    }
                    break;
                    
                }
            }
            
        }
        return "";
    }
    
    public void addEvaluacion(String evaluacion){
        //
    }
}
