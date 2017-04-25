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
public class ClaseRepositorio {
    
    
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
