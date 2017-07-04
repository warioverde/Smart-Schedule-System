/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipales;

import java.util.Date;

/**
 *
 * @author Jorge
 */
public class Notificacion {

    public int tiempoRestante(int diaE, int mesE, int añoE) {
        Calendario calendario = new Calendario();
        int diaA = calendario.getDay();
        int mesA = calendario.getMonth();
        int añoA = calendario.getYear();
        int diasRestantes = contadorDiasE(diaE, mesE, añoE, añoA) - contadorDias(diaA, mesA, añoA);  //Se crea una variable diasRestantes, que guarde la diferencia de dias entre la fecha actual y la de la evaluacion
        return diasRestantes;  //retorna la diferencia de los dias
    }

    //Metodos internos de la clase
    public int contadorDiasE(int dia, int mes, int añoE, int añoA) {               //Metodo que tiene de fin calcular los dias desde la fecha de la evaluacion hasta el primer dia del año actual
        int dias = contadorDias(dia, mes, añoE);
        for (int i = (añoE - 1); i >= (añoA); i--) {
            dias = dias + contadorDias(31, 12, i);
        }
        return dias;
    }

    public int contadorDias(int dia, int mes, int año) {
        int dias = dia;

        for (int i = (mes - 1); i > 0; i--) {
            dias = dias + verificarMes(i, año);
        }

        return dias;
    }

    public int verificarMes(int mes, int año) {
        int mesVer;
        if (mes <= 7) {
            if (mes % 2 == 0) {
                mesVer = 31;//tiene 31 dias
            } else {
                if (mes == 2) {
                    if (año % 4 == 0) {
                        mesVer = 29;//tiene 29 dias
                    } else {
                        mesVer = 28;/*  tiene 28 dias */
                    }
                } else {
                    mesVer = 30;//tiene 30 dias                
                }
            }
        } else {
            if (mes % 2 == 0) {
                mesVer = 30;//tiene 30 dias
            } else {
                mesVer = 31;
                /*   tiene 31 dias   */
            }

        }
        return mesVer;
    }

}
