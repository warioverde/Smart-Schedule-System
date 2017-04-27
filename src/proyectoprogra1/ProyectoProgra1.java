/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class ProyectoProgra1 {
    static int diaA;
    static int mesA;
    static int añoA;
    
    
        
        Calendar c = new GregorianCalendar();
        
    public void fechaActual(){
        String diaS = Integer.toString(c.get(Calendar.DATE));
        String mesS = Integer.toString(c.get(Calendar.MONTH));
        String añoS = Integer.toString(c.get(Calendar.YEAR));
        this.diaA=Integer.parseInt(diaS);
        this.mesA=Integer.parseInt(mesS)+1;
        this.añoA=Integer.parseInt(añoS);
        
        
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Notificacion alert= new Notificacion();
        Evaluacion prueba1=new Evaluacion();
        prueba1.set(12, 05, 2017);
       
        
        
        Evaluacion prueba2= new Evaluacion();
        Asignatura algebra = new Asignatura(prueba2,"Algebra");
        prueba2.asociarAsignatura(algebra);
        
       //ArrayList<Asignatura>horario = new ArrayList();
       Asignatura [][] horario = new Asignatura[2][2];
        
        horario [0][0] = new Asignatura(prueba1,"Calculo"); 
        prueba1.asociarAsignatura(horario [0][0]);
        horario[1][0] = horario [0][0];
        
        horario[0][1] = algebra;
        horario[1][1]=algebra;
        
        for (int i = 0; i < horario.length; i++) {
            
            for (int j = 0; j < horario.length; j++) {
                
                System.out.print(horario[i][j].getNombre()+"\t");
                
                
            }
            System.out.println();
        }
       
        

        
        
        
        
        ProyectoProgra1 min = new ProyectoProgra1();
        min.fechaActual();
       
        
        
        
        
        
        
        
//        System.out.println(diaA+"-"+mesA+"-"+añoA+" fecha evaluacion "+prueba1.getDia()+"-"+prueba1.getMes()+"-"+prueba1.getAño());
//        alert.tiempoRestante(diaA, mesA, añoA, prueba1.getDia(), prueba1.getMes(), prueba1.getAño());
//        alert.tiempoRestante(diaA, mesA, añoA, prueba2.getDia(), prueba2.getMes(), prueba2.getAño());
//        alert.tiempoRestante(diaA, mesA, añoA, prueba3.getDia(), prueba3.getMes(), prueba3.getAño());
//        
        
        //System.out.println(dia);
        //System.out.println((Integer.parseInt(mes)+1));
        //System.out.println(año);
        
        //los primeros 7 meses si es impar {tiene 31 dias, }sino{ si es febrero y bisiesto {tiene 29 dias, }sino{ 28, }sino {tiene 30 dias}
        //los ultimos 5 meses, si es par tiene 31 dias, sino tiene 30.
        
        
  
      }
    
}
