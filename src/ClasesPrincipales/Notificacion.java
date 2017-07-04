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

    /**
     * + * Retorna los dias restantes a la fecha respecto a la fecha ingresada.
     * + * + * @param diaE Dia a calcular de tipo entero. + * @param mesE Mes a
     * calcular de tipo entero. + * @param añoE Año a calcular de tipo entero. +
     * * @return Dias restantes a la fecha. +
     */
    public int tiempoRestante(int diaE, int mesE, int añoE) {
        Calendario calendario = new Calendario();
        int diaA = calendario.getDay();
        int mesA = calendario.getMonth();
        int añoA = calendario.getYear();
        int diasRestantes = contadorDiasE(diaE, mesE, añoE, añoA) - contadorDias(diaA, mesA, añoA);  //Se crea una variable diasRestantes, que guarde la diferencia de dias entre la fecha actual y la de la evaluacion
        return diasRestantes;  //retorna la diferencia de los dias
    }

    //Metodos internos de la clase
    /**
     * + * Retorna los dias desde la fecha hasta el principio del año + * + *
     * @param dia Dia de la fecha a evaluar. + * @param mes Mes de la fecha a
     * evaluar. + * @param añoE Año de la fecha a evaluar. + * @param añoA Año
     * de la fecha actual. + * @return Retorna los dias desde la fecha hasta el
     * principio del año +
     */
    public int contadorDiasE(int dia, int mes, int añoE, int añoA) {               //Metodo que tiene de fin calcular los dias desde la fecha de la evaluacion hasta el primer dia del año actual
        int dias = contadorDias(dia, mes, añoE);
        for (int i = (añoE - 1); i >= (añoA); i--) {
            dias = dias + contadorDias(31, 12, i);
        }
        return dias;
    }

    /**
     * + * Contador de dias de la fecha al principio del año. + * + * @param dia
     * Dia de la fecha a calcular. + * @param mes Mes de la fecha a calcular. +
     * * @param año Año de la fecha a calcular. + * @return dias de la fecha
     * hasta el principio del año. +
     */
    public int contadorDias(int dia, int mes, int año) {
        int dias = dia;

        for (int i = (mes - 1); i > 0; i--) {
            dias = dias + verificarMes(i, año);
        }

        return dias;
    }

    /**
     * + * Retorna los dias de un mes segun su año + * @param mes Mes de la
     * fecha a calcular + * @param año Año de la fecha a calcular + * @return
     * Dias del mes respecto a la fecha recibida. +
     */
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
