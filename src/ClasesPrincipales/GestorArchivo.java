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

/**
 *
 * @author Jorge
 */
public class GestorArchivo {

    private ArrayList<Asignatura> asignaturas = new ArrayList();
    private Horario horario = new Horario();

    /**
    * Constructor de la clase GestorArchivo.
    */
    public GestorArchivo() {
        this.horario.setHorarioInicial();
    }
    
    /**
    * Retorna un arrayList de asignaturas de tipo Asignatura
    * @return Retorna un arrayList de asignaturas de tipo Asignatura
    */
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    /**
    * metodo que crea los objetos del programa y los guarda en una arraylist de tipo Asignatura y evaluaciones dentro de sus respectivas asignaturas.
    */
    public void creadorAsignatura() {
        String array[][] = this.separarDatosAsignatura();
        for (int i = 0; i < array.length; i++) {
            Asignatura asignatura = new Asignatura(array[i][0], array[i][1], Integer.parseInt(array[i][2]), getPeriodosDeClase(array[i][3]));
            this.asignaturas.add(asignatura);

            ArrayList<Evaluacion> evaluaciones = creadorEvaluaciones();

            for (int j = 0; j < evaluaciones.size(); j++) {
                if (evaluaciones.get(j).getCodigo() == asignatura.getCodigo()) {
                    asignaturas.get(i).agregarPrueba(evaluaciones.get(j));

                }
            }
        }

    }

    /**
    * Crea y retorna una arrayList con objetos de tipo Evaluacion
    * @return ArrayList de tipo Evaluacion
    */
    public ArrayList<Evaluacion> creadorEvaluaciones() {
        String array[][] = this.separarDatosEvaluacion();
        ArrayList<Evaluacion> evaluaciones = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            Evaluacion eva = new Evaluacion(array[i][0], array[i][1], Integer.parseInt(array[i][2]), Integer.parseInt(array[i][3]), Integer.parseInt(array[i][4]));
            evaluaciones.add(eva);
        }
        return evaluaciones;
    }

    /**
    * Retorna un arreglo de nombres de asignaturas de tipo String
    * @return String[] con nombres de asignaturas
    */
    public String[] getNombres() {
        //String arrayy[][]=this.separarDatosAsignatura();
        String[] nombres = new String[this.asignaturas.size()];
        for (int i = 0; i < this.asignaturas.size(); i++) {
            nombres[i] = this.asignaturas.get(i).getNombre();

        }
        return nombres;
    }

    /**
    * Añade una asignatura al archivo
    * @param codigo Codigo de la asignatura de tipo String
    * @param nombre Nombre de la asignatura de tipo String
    * @param horas Horas extra de la asignatura de tipo String
    * @param horario Horario de la asignatura de tipo String
    */
    public void addAsignatura(String codigo, String nombre, String horas, String horario) {
        ArchivoAsignatura añadir = new ArchivoAsignatura();
        añadir.escribirArchivo(codigo + "," + nombre + "," + horas + "," + horario);
    }

    /**
    * Añade una evaluacion al archivo
    * @param asignatura Objeto de tipo Asignatura.
    * @param tipo Tipo de evaluacion de tipo String.
    * @param dia Dia de evaluacion de tipo entero.
    * @param mes Mes de la evaluacion de tipo entero.
    * @param año Año de la evaluacion de tipo entero.
    */
    public void addEvaluacion(Asignatura asignatura, String tipo, int dia, int mes, int año) {

        ArchivoEvaluacion añadir = new ArchivoEvaluacion();

        añadir.escribirArchivo(asignatura.getCodigo() + "," + tipo + "," + dia + "," + mes + "," + año);
    }

    /**
    * Separa los datos de evaluacion recibidos desde el archivo y retorna un arreglo bidimensional de tipo String[][]
    * @return String[][] de datos de evaluacion.
    */
    public String[][] separarDatosEvaluacion() {
        ArchivoEvaluacion archivo = new ArchivoEvaluacion();
        ArrayList<String> datos = archivo.leerArchivo();
        int contador = 0;

        String datosSeparados[][] = new String[datos.size()][5];

        for (int i = 0; i < datos.size(); i++) {
            datosSeparados[i] = datos.get(i).split(",");
        }
        return datosSeparados;
    }

    /**
    * Separa los datos de asignatura recibidos desde el archivo y retorna un arreglo bidimensional de tipo String[][]
    * @return String[][] de datos de evaluacion.
    */
    public String[][] separarDatosAsignatura() {
        ArchivoAsignatura archivo = new ArchivoAsignatura();
        String[] datos = archivo.leerArchivo();
        int contador = 0;

        String datosSeparados[][] = new String[datos.length][4];

        for (int i = 0; i < datos.length; i++) {
            datosSeparados[i] = datos[i].split(",");
        }
        return datosSeparados;
    }

    /**
    * Genera el horario ingresando horas de clase al objeto de tipo horario de esta clase.
    */
    public void mkHorario() {
        for (int i = 0; i < asignaturas.size(); i++) {
            for (int j = 0; j < asignaturas.get(i).getHorario().length; j++) {
                this.horario.setHorario(Integer.parseInt(asignaturas.get(i).getHorario(j, 0)), Integer.parseInt(asignaturas.get(i).getHorario(j, 1)), asignaturas.get(i));
            }

        }
    }

    /**
    * Retorna un objeto de tipo Horario.
    * @return Objeto de tipo Horario.
    */
    public Horario getHorario() {
        return this.horario;
    }

    /**
    * Buscador de Objetos de Asignatura por su codigo
    * @return Objeto de tipo Asignatura buscado y encontrado.
    */
    public Asignatura buscarAsignatura(String codigo) {
        for (int i = 0; i < asignaturas.size(); i++) {
            if (asignaturas.get(i).getCodigo().equals(codigo)) {
                return asignaturas.get(i);
            }

        }
        return null;
    }

    /**
    * Retorna los periodos de clase recibidos mediante el String y retorna un arreglo bidimensional con el dia y el periodo de clase por cada nivel {clase,{Dia,Periodo}}
    * @param horario Horario bruto de clases de tipo String
    * @return String[][] de datos de evaluacion.
    */
    public String[][] getPeriodosDeClase(String horario) {

        String[] periodos = horario.split(";");
        String[][] periodosClase = new String[periodos.length][2];
        for (int i = 0; i < periodos.length; i++) {
            periodosClase[i] = periodos[i].split("@");
        }

        return periodosClase;
    }

    /**
    * Retorna un arrayList de los objetos de tipo Evaluacion mas cercanos a la fecha actual.
    * @return ArrayList de Objetos de tipo Evaluacion.
    */
    public ArrayList<Evaluacion> EvaluacionesMasCercanas() {
        ArrayList<Evaluacion> evaluaciones = creadorEvaluaciones();

        ArrayList<Integer> diasRestantes = new ArrayList();
        Notificacion noti = new Notificacion();

        for (int i = 0; i < evaluaciones.size(); i++) {
            int diaE = evaluaciones.get(i).getDia();
            int mesE = evaluaciones.get(i).getMes();
            int añoE = evaluaciones.get(i).getAño();

            diasRestantes.add(noti.tiempoRestante(diaE, mesE, añoE));

        }

        for (int i = diasRestantes.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (diasRestantes.get(j) > diasRestantes.get(j + 1)) {
                    int temp = diasRestantes.get(j);
                    Evaluacion eva = evaluaciones.get(j);
                    diasRestantes.set(j, diasRestantes.get(j + 1));
                    evaluaciones.set(j, evaluaciones.get(j + 1));
                    diasRestantes.set(j + 1, temp);
                    evaluaciones.set(j + 1, eva);

                }
            }
        }
        return evaluaciones;
    }

    /**
    * Retorna un booleano segun si el codigo recibido se repite o no.
    * @return boolean (true/false)
    */
    public boolean codUnico(String cod) {
        String[][] cadena = this.separarDatosAsignatura();
        for (int i = 0; i < cadena.length; i++) {
            if (cod.equals(cadena[i][0])) {
                return false;
            }
        }
        return true;
    }

    /**
    * Retorna un arreglo de booleano (entero) y la diferencia entre espacios libres del horario y las horas extra recibidas.
    * @param horasExtra Un entero con las Horas extra de asignatura a ingresar
    * @return Arreglo de enteros con un booleano (entero) la diferencia entre espacios libres del horario y las horas extra recibidas.
    */
    public int[] checkHorasExtra(int horasExtra){
        int horasLibresHorario = this.horario.getEspaciosLibresHorario();
        if(horasLibresHorario>=horasExtra){
            int[] check={1,horasLibresHorario-horasExtra};// 1: true    0: false
            return check;
        }else{
            int[] check={0,horasLibresHorario-horasExtra};
            return check;
        }
        
    }
    
    /**
    * Agrega al objeto de tipo Horario de la clase horas extra de estudio
    */
    public void hacerHorasDeEstudio(){
        ArrayList<Asignatura> horasExtra=new ArrayList<>();
        
        /*for (int i = 0; i < asignaturas.size(); i++) {
        Asignatura ramo=new Asignatura("Hora extra",asignaturas.get(i).getNombre(),asignaturas.get(i).getHorasExtra(),auxiliar);
        horasExtra.add(ramo);
        }*/
        for (int i = 0; i < this.asignaturas.size(); i++) {
            for (int j = 0; j < this.asignaturas.get(i).getHorasExtra(); j++) {
                Asignatura ramo=new Asignatura(asignaturas.get(i).getCodigo(),asignaturas.get(i).getNombre(),asignaturas.get(i).getHorasExtra(),asignaturas.get(i).getHorario());
                horasExtra.add(ramo);
            }
        }
        horasExtra=ordenarArrayListEnPar(horasExtra);
        horasExtra=codigoToExtra(horasExtra);
        horario.planEstudios(horasExtra);
    }
    
    /**
    * Retorna una ArrayList de tipo Asignatura ordenada de par en par segun el codigo de asignatura 
    * @param ArrayList desordenada de tipo Asignatura.
    * @return ArrayList ordenada de tipo Asignatura.
    */
    public ArrayList<Asignatura> ordenarArrayListEnPar(ArrayList<Asignatura> asignaturas){
        String codigo="";
        int contador=0;
        
        for (int i = 0; i < asignaturas.size(); i++) {
            System.out.println(asignaturas.get(i).getCodigo());
            if(codigo==asignaturas.get(i).getCodigo()){
                contador++;
                if(contador>2){
                    asignaturas.add(asignaturas.get(i));
                    asignaturas.remove(i);
                    i--;
                    if(contador>15){break;}
                }
            }else{
                codigo=asignaturas.get(i).getCodigo();
                contador=1;
            }
        }
        return asignaturas;
    }
    
    /**
    * Retorna una ArrayList de tipo Asignatura con todos sus codigos cambiados a "Hora_extra".
    * @param ArrayList de tipo Asignatura.
    * @return ArrayList de tipo Asignatura con sus codigos cambiados a "Hora_extra".
    */
    public ArrayList<Asignatura> codigoToExtra(ArrayList<Asignatura> asignaturas){
        System.out.println(asignaturas.size());
        for (int i = 0; i < asignaturas.size(); i++) {
            
            asignaturas.get(i).setCodigo("Hora_extra");
        }
        return asignaturas;
    }
    
    
}
