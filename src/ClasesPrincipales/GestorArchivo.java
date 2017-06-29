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
    private Horario horario=new Horario();
    
    public GestorArchivo(){
        this.horario.setHorarioInicial();
    }
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

    

    public void addAsignatura(String codigo, String nombre, String horas, String horario) {
        ArchivoAsignatura añadir = new ArchivoAsignatura();
        añadir.escribirArchivo(codigo + "," + nombre + "," + horas + "," + horario + ",");
    }

    /*public String searchAsignatura(String codigo) {
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
    }*/

    public void addEvaluacion(Asignatura asignatura, String tipo, int dia, int mes, int año) {
        asignatura.agregarPrueba(año,mes,dia,tipo);
        ArchivoEvaluacion añadir = new ArchivoEvaluacion();

        añadir.escribirArchivo(asignatura.getNombre() + "," + tipo + "," + dia + "," + mes + "," + año + ",");
    }

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
    
    /*public void SepararDato() {
    ArchivoAsignatura archivo = new ArchivoAsignatura();
    
    String [] letras2 ;
    String[] letras = archivo.leerArchivo();
    String[] hola = letras[0].split("@");
    String [] alfa = archivo.leerArchivo()[0].split("@");
    String[] omega[]=new String[alfa.length][2];
    for (int i = 0; i < alfa.length-1; i++) {
    //System.out.println(alfa[i]);
    
    omega[i]=alfa[i].split("_");
    System.out.print(omega[i][0]+"---");
    System.out.println(omega[i][1]);
    
    
    }
    
    }*/
    
    /*public void mkHorario(){
    ArchivoAsignatura archivo = new ArchivoAsignatura();
    String[] datos = archivo.leerArchivo();
    String[] asignatura=datos[0].split(",");   //Actualmente lo hago para una sola asignatura
    String[] clases=asignatura[3].split(";");
    
    String[] diaPeriodo=clases[0].split("@");   //Actualmente solo para 1 periodo de clases
    
    this.horario.setHorario(Integer.parseInt(diaPeriodo[0]), Integer.parseInt(diaPeriodo[1]), asignatura[1]);
    
    //this.horario.showXConsola();
    
    }*/
    
    public void mkHorario(){
        ArchivoAsignatura archivo = new ArchivoAsignatura();
        String[] datos = archivo.leerArchivo();
        String asignatura[][]=new String[datos.length][5];
        
        for (int i = 0; i < datos.length; i++) {                              //
            asignatura[i]=datos[i].split(",");
        }
        
        for (int i = 0; i < asignatura.length; i++) {
            String[] clases=asignatura[i][3].split(";");
            
            
            for (int j = 0; j < clases.length; j++) {
                String[] diaPeriodo=clases[j].split("@");
                
                this.horario.setHorario(Integer.parseInt(diaPeriodo[0]), Integer.parseInt(diaPeriodo[1]), asignatura[i][1]);
            }
            
            
        }
        
        
        
        
           //Actualmente solo para 1 periodo de clases
        
        
        
        //this.horario.showXConsola();
        
    }
    
    public String[][] getHorario(){
        return this.horario.getHorario();
    }
    
}
