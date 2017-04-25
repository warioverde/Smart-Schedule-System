/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Jorge
 */
public class ProyectoProgra1 {
    int añoE;
    int mesE;
    int diaE;
    public void set(int dia, int mes,int año){
        this.añoE=año; this.mesE=mes; this.diaE=dia;
        System.out.println("adasd");
    }
    
    
        
        Notificacion alert= new Notificacion();
        Calendar c = new GregorianCalendar();
        
    public void metodo(){
        String diaS = Integer.toString(c.get(Calendar.DATE));
        String mesS = Integer.toString(c.get(Calendar.MONTH));
        String añoS = Integer.toString(c.get(Calendar.YEAR));
        int diaA=Integer.parseInt(diaS);
        int mesA=Integer.parseInt(mesS)+1;
        int añoA=Integer.parseInt(añoS);
        
        set(1,1,2017);
        System.out.println(diaA+"-"+mesA+"-"+añoA+" fecha evaluacion "+diaE+"-"+mesE+"-"+añoE);
        alert.tiempoRestante(diaA, mesA, añoA, diaE, mesE, añoE);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProyectoProgra1 min = new ProyectoProgra1();
        min.metodo();
        
        
        //System.out.println(dia);
        //System.out.println((Integer.parseInt(mes)+1));
        //System.out.println(año);
        
        //los primeros 7 meses si es impar {tiene 31 dias, }sino{ si es febrero y bisiesto {tiene 29 dias, }sino{ 28, }sino {tiene 30 dias}
        //los ultimos 5 meses, si es par tiene 31 dias, sino tiene 30.
        
        
  
      }
    
}
