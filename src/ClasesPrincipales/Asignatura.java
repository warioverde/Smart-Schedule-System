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
public class Asignatura {

    private ArrayList<Evaluacion> pruebas;
    private String nombre;
    private String codigo;
    private int horasExtra;
    private String[][] horario;

    /**
     * + * Constructor de la clase Asignatura + * @param codigo Codigo de la
     * asignatura de tipo String + * @param nombre Nombre de la asignatura de
     * tipo String + * @param horasExtra Horas extra de la asignatura de tipo
     * entero + * @param horario Horario de la clase, un arreglo bidimencional
     * {Dia,Periodo] X Clase) de tipo String[][] +
     */
    public Asignatura(String codigo, String nombre, int horasExtra, String[][] horario) {
        this.pruebas = new ArrayList<Evaluacion>();
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasExtra = horasExtra;
        this.horario = horario;
    }

    /**
     * + * Agrega una evaluacion. + * @param codigo Codigo de la asignatura a la
     * que esta asociada la evaluacion de tipo String + * @param año Año de la
     * evaluacion de tipo entero + * @param mes Mes de la evaluacion de tipo
     * entero + * @param dia Dia de la evaluacion de tipo entero +
     */
    public void agregarPrueba(String codigo, int año, int mes, int dia, String tipo) {
        Evaluacion evaluacion = new Evaluacion(codigo, tipo, dia, mes, año);
        this.pruebas.add(evaluacion);
        //return true;
    }

    /**
     * + * Agrega una evaluacion. + * @param eva Objeto de tipo evaluacion +
     */
    public void agregarPrueba(Evaluacion eva) {
        this.pruebas.add(eva);
        //return true;
    }

    /**
     * + * Retorna el horario de clases ({Dia,Periodo} x clase } de tipo String
     * + * @param dia Dia de clases de tipo entero. + * @param periodo Periodo
     * de clases de tipo entero. + * @return Retorna un string con el horario de
     * clases +
     */
    public String getHorario(int dia, int periodo) {
        return horario[dia][periodo];
    }

    /**
     * + * Retorna el horario de clases ({Dia,Periodo} x clase } de tipo
     * String[][] + * @return Retorna el horario de clases ({Dia,Periodo} x
     * clase } de tipo String[][] +
     */
    public String[][] getHorario() {
        return horario;
    }

    /**
     * + * Establece los periodos de clase de la asignatura + * @param horario
     * Un arreglo bidimensional +
     */
    public void setHorario(String[][] horario) {
        this.horario = horario;
    }

    /**
     * + * Retorna el nombre de la asignatura de tipo String + * @return Retorna
     * el nombre de la asignatura de tipo String +
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * + * Retorna el nombre de la asignatura de tipo String + * @return Retorna
     * el nombre de la asignatura de tipo String +
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * + * Retorna el codigo de la asignatura de tipo String + * @return Retorna
     * el codigo de la asignatura de tipo String +
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * + * Retorna las horas extra de la asignatura de tipo entero + * @return
     * Retorna las horas extra de la asignatura de tipo String +
     */
    public int getHorasExtra() {
        return horasExtra;
    }

    /**
     * + * Establece el codigo de la asignatura. + * @param codigo Un codigo de
     * tipo String +
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
