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
public class Horario {
    String horario[][];
    Asignatura[][][] horarioObjetos;
    public Horario(){
        horario=new String[12][7];
        horarioObjetos=new Asignatura[12][7][10 /* asignaturas */];
    }

    public String[][] getHorario() {
        return horario;
    }

    public void setHorarioInicial(){
        String[] dias={"Periodo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        this.horario[0]=dias;
        String[] periodos={"Periodo","1°","2°","3°","4°","Almuerzo","5°","6°","7°","8°","9°","10°"};
        for (int i = 0; i < 12; i++) {
            this.horario[i][0]=periodos[i];
        }
        for (int i = 0; i < 7; i++) {
            this.horario[5][i]="Almuerzo";
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 7; j++) {
                if(this.horario[i][j]==null){this.horario[i][j]="";}
            }
        }
    }
    public void setHorario(int dia,int periodo,Asignatura asignatura) {
        if(periodo<5){
            this.horario[periodo][dia] += asignatura.getNombre();
            for (int i = 0; i < 10; i++) {
                if (this.horarioObjetos[periodo][dia][i]==null) {
                    this.horarioObjetos[periodo][dia][i]=asignatura;
                    break;
                }
            }
        }else{
            this.horario[periodo+1][dia] += asignatura.getNombre();
            for (int i = 0; i < 10; i++) {
                if (this.horarioObjetos[periodo+1][dia][i]==null) {
                    this.horarioObjetos[periodo+1][dia][i]=asignatura;
                    break;
                }
            }
        }
        
        
    }
    
    public void showXConsola(){
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(this.horario[i][j]+"   ");
            }
            System.out.println("");
        }
    }
    
    public Asignatura getHorarioObjetos(int periodo, int dia,int objeto) {
        return horarioObjetos[periodo][dia][objeto];
    }
    
    public String getHorarioNombres(int periodo, int dia){
        String linea="";
        for (int i = 0; i < 10; i++) {
            if (getHorarioObjetos(periodo,dia,i)!=null) {
                linea+=getHorarioObjetos(periodo,dia,i).getNombre()+"\n";
            }
            
        }
        return linea;
    }
}
