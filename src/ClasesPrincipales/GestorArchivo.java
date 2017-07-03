/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipales;

import Archivos.ArchivoAsignatura;
import Archivos.ArchivoEvaluacion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
    //listo
    public void creadorAsignatura(){
    String array [][] = this.separarDatosAsignatura();
        for (int i = 0; i < array.length; i++) {
            Asignatura asignatura = new Asignatura(array[i][0],array[i][1],Integer.parseInt(array[i][2]),getPeriodosDeClase(array[i][3]));
            this.asignaturas.add(asignatura);
            ArrayList<Evaluacion> evaluaciones = creadorEvaluaciones();
            
            for (int j = 0; j < evaluaciones.size(); j++) {
                if (evaluaciones.get(j).getCodigo()==asignatura.getCodigo()){
                    asignaturas.get(i).agregarPrueba(evaluaciones.get(j));
                }
            }
        } 
    }
    //listo
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
    //listo
    public boolean codUnico(String cod){
        ArchivoAsignatura leerArch = new ArchivoAsignatura();
        String [][] cadena=this.separarDatosAsignatura();
        for (int i = 0; i < cadena.length; i++) {
            if(cod.equals(cadena[i][0])){
                    return false;
                }
        }
        return true;
    }
    
    //listo
    public void addAsignatura(String codigo, String nombre, String horas, String horario) {
        ArchivoAsignatura añadir = new ArchivoAsignatura();
        añadir.escribirArchivo(codigo + "," + nombre + "," + horas + "," + horario);
    }

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
    
    public void mkHorario(){
        for (int i = 0; i < asignaturas.size(); i++) {
            for (int j = 0; j < asignaturas.get(i).getHorario().length; j++) {
                this.horario.setHorario(Integer.parseInt(asignaturas.get(i).getHorario(j, 0)), Integer.parseInt(asignaturas.get(i).getHorario(j, 1)), asignaturas.get(i));
            }
        }
    }
    
    public String[][] getHorario(){
        return this.horario.getHorario();
    }
    
    public Asignatura buscarAsignatura(String codigo){
        for (int i = 0; i < asignaturas.size(); i++) {
            if (asignaturas.get(i).getCodigo().equals(codigo)){
                return asignaturas.get(i);
            }
            
        }
        return null;
    }
    
    public String[][] getPeriodosDeClase(String horario){        
        String[] periodos=horario.split(";");
        String[][] periodosClase=new String[periodos.length][2];
        for (int i = 0; i < periodos.length; i++) {
            periodosClase[i]=periodos[i].split("@");
        }
         
        return periodosClase;
    }
        
        
    
}
