/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPrincipales;

/**
 *
 * @author Jorge
 */
public class Horario {
    String horario[][];
    public Horario(){
        horario=new String[7][12];
    }

    public String[][] getHorario() {
        return horario;
    }

    public void setHorarioInicial(){
        String[] periodos={"Periodo","1°","2°","3°","4°","Almuerzo","5°","6°","7°","8°","9°","10°"};
        this.horario[0]=periodos;
        String[] dias={"Periodo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        for (int i = 0; i < 7; i++) {
            this.horario[i][0]=dias[i];
        }
        for (int i = 0; i < 7; i++) {
            this.horario[i][5]="Almuerzo";
        }
    }
    public void setHorario(int dia,int periodo,String asignatura) {
        if(periodo<5){
            this.horario[dia][periodo] += asignatura;
        }else{
            this.horario[dia][periodo+1] += asignatura;
        }
        
        
    }
    
    public void showXConsola(){
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(this.horario[j][i]+"   ");
            }
            System.out.println("");
        }
    }
    
    
    
    
}
