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
        String nombre;
        Scanner leer = new Scanner(System.in);
        Notificacion alert= new Notificacion();
        Evaluacion prueba1=new Evaluacion();
        Asignatura calculo = new Asignatura(prueba1,"asdad");
        System.out.println("ingrese nombre asignatura");
        nombre = leer.nextLine();
        calculo.setNombre(nombre);
        System.out.println(calculo.getNombre());
        prueba1.asociarAsignatura(calculo);
        Evaluacion prueba2= new Evaluacion();
        Asignatura algebra = new Asignatura(prueba2,"Algebra");
        prueba2.asociarAsignatura(algebra);
        
        
        
        
        ProyectoProgra1 min = new ProyectoProgra1();
        min.fechaActual();
       
        
        
        
        
        
        int dia;
        int mes;
        int año;
        
        System.out.println("ingrese dia");
        dia = leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese mes");
        mes = leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese año");
        año= leer.nextInt();
        prueba1.set(dia,mes,año);
        
       
        
        
        System.out.println(diaA+"-"+mesA+"-"+añoA+" fecha evaluacion "+prueba1.getDia()+"-"+prueba1.getMes()+"-"+prueba1.getAño());
        alert.tiempoRestante(diaA, mesA, añoA, prueba1.getDia(), prueba1.getMes(), prueba1.getAño());
//        alert.tiempoRestante(diaA, mesA, añoA, prueba2.getDia(), prueba2.getMes(), prueba2.getAño());
//        alert.tiempoRestante(diaA, mesA, añoA, prueba3.getDia(), prueba3.getMes(), prueba3.getAño());
//        
        
        //System.out.println(dia);
        //System.out.println((Integer.parseInt(mes)+1));
        //System.out.println(año);
        
        //los primeros 7 meses si es impar {tiene 31 dias, }sino{ si es febrero y bisiesto {tiene 29 dias, }sino{ 28, }sino {tiene 30 dias}
        //los ultimos 5 meses, si es par tiene 31 dias, sino tiene 30.
        //
        
  
      }
    
}
