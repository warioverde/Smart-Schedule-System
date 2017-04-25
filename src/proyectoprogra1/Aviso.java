/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import java.util.Date;

/**
 *
 * @author Jorge
 */
public class Aviso {
    
    public void tiempoRestante(int diaA,int mesA, int añoA,/**/int diaE, int mesE, int añoE){
        //contadorDias= (metodo que invoque a la fecha de hoy en el calendario)
        int diasRestantes=contadorDiasE(diaE,mesE,añoE,añoA)-contadorDias(diaA,mesA,añoA);
        System.out.println(diasRestantes);
        //System.out.println("El tiempo restante para la evaluacion es de: "/*+(fechaEvaluacion separada en día y mes - fechaActual tambien separada en dia y mes*/);
    }
    
    public int contadorDiasE(int dia,int mes,int añoE, int añoA){
        int dias=contadorDias(dia,mes,añoE);
        for (int i = (añoE-1); i >= (añoA); i--) {
            dias=dias+contadorDias(31,12,i);
        }
        return dias;
    }
    public int contadorDias(int dia,int mes,int año){
        int dias=dia;
        
        for (int i = (mes-1); i > 0; i--) {
            dias=dias+verificarMes(i,año);      
        }
    
        return dias;
    }
    
    public int verificarMes(int mes,int año){
        int mesVer;
        if (mes<=7){
            if (mes%2==0){
                mesVer=31;//tiene 31 dias
            }else{
                if (mes==2){
                    if (año%4==0){
                        mesVer=29;//tiene 29 dias
                    }else{  mesVer=28;/*  tiene 28 dias */}
                }else{
                    mesVer=30;//tiene 30 dias                
        }}}else{
            if (mes%2==0){
                mesVer=30;//tiene 30 dias
            }else{  mesVer=31; /*   tiene 31 dias   */}
        
        }
    return mesVer;   
    }
    

}
