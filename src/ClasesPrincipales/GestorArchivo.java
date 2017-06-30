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
            Asignatura asignatura = new Asignatura(array[i][0],array[i][1],Integer.parseInt(array[i][2]));
            this.asignaturas.add(asignatura);
            
            ArrayList<Evaluacion> evaluaciones = creadorEvaluaciones();
            
            for (int j = 0; j < evaluaciones.size(); j++) {
                if (evaluaciones.get(j).getCodigo()==asignatura.getCodigo()){
                    asignaturas.get(i).agregarPrueba(evaluaciones.get(j));
                    
                }
            }
        }
        
    }
    public ArrayList<Evaluacion> creadorEvaluaciones(){
    String array [][] = this.separarDatosEvaluacion();
    ArrayList<Evaluacion> evaluaciones=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            Evaluacion eva = new Evaluacion(array[i][0],array[i][1],Integer.parseInt(array[i][2]),Integer.parseInt(array[i][3]),Integer.parseInt(array[i][4]));
            evaluaciones.add(eva);
        }
        return evaluaciones;
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
        añadir.escribirArchivo(codigo + "," + nombre + "," + horas + "," + horario);
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
        
        ArchivoEvaluacion añadir = new ArchivoEvaluacion();

        añadir.escribirArchivo(asignatura.getCodigo() + "," + tipo + "," + dia + "," + mes + "," + año);
    }

    public String[][] separarDatosEvaluacion() {
        ArchivoEvaluacion archivo = new ArchivoEvaluacion();
        ArrayList<String> datos = archivo.leerArchivo();
        int contador = 0;
        
        String datosSeparados[][] = new String[datos.size()][5];

        for (int i = 0; i < datos.size(); i++) {
            datosSeparados[i]=datos.get(i).split(",");
        }
        return datosSeparados;
    }

    public String[][] separarDatosAsignatura() {
        ArchivoAsignatura archivo = new ArchivoAsignatura();
        String[] datos = archivo.leerArchivo();
        int contador = 0;
        
        String datosSeparados[][] = new String[datos.length][4];

        for (int i = 0; i < datos.length; i++) {
            datosSeparados[i]=datos[i].split(",");
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
    
    public Asignatura buscarAsignatura(String codigo){
        for (int i = 0; i < asignaturas.size(); i++) {
            if (asignaturas.get(i).getCodigo()==codigo){
                return asignaturas.get(i);
            }
            
        }
        return null;
    }
}
