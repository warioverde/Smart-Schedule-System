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
    //ArrayList<Asignatura> horarioObjetos[][];
    public Horario(){
        horario=new String[12][7];
        //horarioObjetos=new ArrayList[12][7];
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
            //this.horarioObjetos[periodo][dia].add(asignatura);
        }else{
            this.horario[periodo+1][dia] += asignatura.getNombre();
            //this.horarioObjetos[periodo+1][dia].add(asignatura);
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
    
    
    
    
}
