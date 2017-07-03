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

    public Horario() {
        horario = new String[12][7];
        horarioObjetos = new Asignatura[12][7][10 /* asignaturas */];
    }

    public String[][] getHorario() {
        return horario;
    }

    public void setHorarioInicial() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 7; j++) {
                this.horario[i][j] = "";
            }
        }
        String[] dias = {"Periodo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        this.horario[0] = dias;
        String[] periodos = {"Periodo", "1°", "2°", "3°", "4°", "Almuerzo", "5°", "6°", "7°", "8°", "9°", "10°"};
        for (int i = 0; i < 12; i++) {
            this.horario[i][0] = periodos[i];

        }
        for (int i = 0; i < 7; i++) {
            String[][] alm = {{"5", "1"}, {"5", "2"}, {"5", "3"}, {"5", "4"}, {"5", "5"}, {"5", "6"}};
            Asignatura almuerzo = new Asignatura("alm", "Almuerzo", 0, alm);
            this.horarioObjetos[5][i][0] = almuerzo;
            this.horario[5][i] = "Almuerzo";
        }

    }

    public void setHorario(int dia, int periodo, Asignatura asignatura) {
        if (periodo < 5) {
            this.horario[periodo][dia] += asignatura.getNombre();
            for (int i = 0; i < 10 /* limitacion */; i++) {
                if (this.horarioObjetos[periodo][dia][i] == null) {
                    this.horarioObjetos[periodo][dia][i] = asignatura;
                    break;
                }
            }
        } else {
            this.horario[periodo + 1][dia] += asignatura.getNombre();
            for (int i = 0; i < 10 /* limitacion */; i++) {
                if (this.horarioObjetos[periodo + 1][dia][i] == null) {
                    this.horarioObjetos[periodo + 1][dia][i] = asignatura;
                    break;
                }
            }
        }

    }

    public void showXConsola() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(this.horario[i][j] + "   ");
            }
            System.out.println("");
        }
    }

    public Asignatura getHorarioObjetos(int periodo, int dia, int objeto) {
        return horarioObjetos[periodo][dia][objeto];
    }

    public String getHorarioInfo(int periodo, int dia) {
        String linea = "";
        for (int i = 0; i < 10; i++) {
            if (getHorarioObjetos(periodo, dia, i) != null) {
                linea += getHorarioObjetos(periodo, dia, i).getNombre() + " " + tipoClase(getHorarioObjetos(periodo, dia, i).getCodigo())+ "\n";
            }

        }
        return linea;
    }
    
    public String tipoClase(String codigo){
        if(codigo.equals("Hora_extra")){
            return codigo;
        }else{
            return "Clase";
        }
    }

    public int getEspaciosLibresHorario() {
        int espaciosVacios = 0;
        for (int i = 1; i < this.horario.length; i++) {
            if (i == 5) {
                i++;
            }
            for (int j = 1; j < this.horario[0].length; j++) {
                if (horario[i][j].equals("")) {
                    espaciosVacios++;
                }
            }
        }
        return espaciosVacios;
    }

    public void planEstudios(ArrayList<Asignatura> asignaturas) {
        int indiceAsignaturas = 0;

        for (int i = 1; i < this.horario[0].length; i++) {

            for (int j = 1; j < this.horario.length-1; j++) {

                if (j < 5) {
                    if (indiceAsignaturas == asignaturas.size()) {
                        break;
                    }
                    if (horario[j][i].equals("")) {

                        setHorario(i, j, asignaturas.get(indiceAsignaturas));
                        indiceAsignaturas++;
                    }
                } else {
                    if (indiceAsignaturas == asignaturas.size()) {
                        break;
                    }
                    if (horario[j+1][i].equals("")) {

                        setHorario(i, j, asignaturas.get(indiceAsignaturas));
                        indiceAsignaturas++;
                    }
                }

            }
        }
    }

}
