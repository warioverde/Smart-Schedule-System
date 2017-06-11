/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipales;

import Archivos.ArchivoAsignatura;
import Archivos.ArchivoEvaluacion;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class GestorArchivo {
    
    private ArrayList<Asignatura> asignaturas= new ArrayList();

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    
    public void creadorAsignatura(){
    String array [][] = this.separarDatosAsignatura();
        for (int i = 0; i < array.length; i++) {
            Asignatura asignatura = new Asignatura(array[i][0],array[i][1]);
            this.asignaturas.add(asignatura);
        }
        
    }
    
    public String[] getNombres(){
        //String arrayy[][]=this.separarDatosAsignatura();
        String[] nombres=new String[this.asignaturas.size()];
        for (int i = 0; i < this.asignaturas.size(); i++) {
            nombres[i]=this.asignaturas.get(i).getNombre();
            
        }
        return nombres;
    }

    public GestorArchivo() {
    }

    /*public void addAsignatura(String asignatura){
    //Llamar al archivo de asignaturas y añadir una nueva
    }
    public void addEvaluacion(String evaluacion){
    //Llamar al archivo de evaluaciones y añadir una nueva junto con el codigo de asignatura
    }
    
    public String getAsignatura(String codigo){
    //Buscar asignatura de codigo
    //retornar nombre,codigo u horario
    return "";
    }
    public String getEvaluacion(String codigo,int i){
    //Buscar evaluacion por codigo de asignatura
    //Retornar la evaluacion en la linea "i"
    return "";
    }*/
    //Para testeo
    String asignatura[] = new String[5];

    public void addAsignatura(String codigo, String nombre, String horas, String horario) {
        //
        ArchivoAsignatura añadir = new ArchivoAsignatura();
        añadir.escribirArchivo(codigo + "," + nombre + "," + horas + "," + horario + ",");
    }

    public String searchAsignatura(String codigo) {
        ArchivoAsignatura buscador = new ArchivoAsignatura();
        String asignaturas[] = buscador.leerArchivo();
        for (int i = 0; i < this.asignatura.length; i++) {
            String contador = "";
            for (int j = 0; j < asignatura[i].length(); j++) {
                if (asignatura[i].charAt(j) == ',') {
                    if (contador.equals(codigo)) {
                        return asignatura[i];
                    }
                    break;

                }
            }

        }
        return "";
    }

    public void addEvaluacion(Asignatura asignatura, String tipo, int dia, int mes, int año) {
        Evaluacion evaluacion = new Evaluacion(año, mes, dia, tipo);
        asignatura.agregarPrueba(evaluacion);
        ArchivoEvaluacion añadir = new ArchivoEvaluacion();

        //  Asignatura asignatura = new Asignatura();
        añadir.escribirArchivo(asignatura.getNombre() + "," + tipo + "," + dia + "," + mes + "," + año + ",");
    }

    //nuevo, recuperar datos
    public String[][] separarDatosEvaluacion() {
        ArchivoEvaluacion archivo = new ArchivoEvaluacion();
        ArrayList<String> datos = archivo.leerArchivo();
        int contador = 0;
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i) == null) {
                break;
            } else {
                contador++;
            }
        }
        String datosSeparados[][] = new String[contador][5];

        for (int i = 0; i < contador; i++) {
            String cadena = "";
            int posDato = 0;
            for (int j = 0; j < datos.get(i).length(); j++) {

                if (datos.get(i).charAt(j) == ',') {
                    datosSeparados[i][posDato] = cadena;
                    cadena = "";
                    posDato++;
                } else {
                    cadena += datos.get(i).charAt(j);
                }
                if (posDato >= 5) {     //Metodo para limitar la lectura de datos por linea  
                    break;
                }

            }

        }
        return datosSeparados;
    }

    public String[][] separarDatosAsignatura() {
        ArchivoAsignatura archivo = new ArchivoAsignatura();
        String[] datos = archivo.leerArchivo();
        int contador = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == null) {
                break;
            } else {
                contador++;
            }
        }
        String datosSeparados[][] = new String[contador][4];

        for (int i = 0; i < contador; i++) {
            String cadena = "";
            int posDato = 0;
            for (int j = 0; j < datos[i].length(); j++) {

                if (datos[i].charAt(j) == ',') {
                    datosSeparados[i][posDato] = cadena;
                    cadena = "";
                    posDato++;
                } else {
                    cadena += datos[i].charAt(j);
                }
                //Pendiente: separar los periodos de la asignatura
                if (posDato >= 4) {     //Metodo para limitar la lectura de datos por linea  
                    break;
                }
            }

        }
        return datosSeparados;
    }

}
