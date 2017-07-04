/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import ClasesPrincipales.Evaluacion;
import ClasesPrincipales.GestorArchivo;
import ClasesPrincipales.Notificacion;
import java.awt.Font;
import javax.swing.border.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*; //librerias de JFrame,JButton,JLabel,etc.

/**
 *
 * @author Jorge
 */
public class GUINotificacion extends JFrame implements ActionListener {

    protected JLabel lAsignatura, lNotificacion, lFecha;
    protected JPanel pNotificacion;
    protected JButton bVolver, bSiguiente;
    private int contadorNotificaciones;

    /**
     * + * Constructor de la clase GUINotificacion. +
     */
    protected GUINotificacion() {
        super();
    }

    /**
     * + * Iniciador de los componentes de la ventana. +
     */

    public void init() {
        try {

            //----------------------------------------------------------------------
            //-------Button---------------------------------------------------------[]//Seccion JButton
            //bClick=new JButton("nombre"); //----------------------------------//Instanciacion de JButton como bClick 
            //bClick.setBounds(x,y,w, h);//-------------------------------------//Con SetBounds se especifica su posicion en la ventana
            //bClick.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
            //bClick.setActionCommand("String");    //--------------------------//Establecer un string que se recibirá al accionar el boton
            //add(boton);    //-------------------------------------------------//Añadir el boton
            bVolver = new JButton("Volver al menu principal");
            bVolver.setBounds(70, 200, 200, 30);
            bVolver.addActionListener(this);
            bVolver.setActionCommand("volver");

            bSiguiente = new JButton("Siguiente notificacion");
            bSiguiente.setBounds(320, 200, 200, 30);
            bSiguiente.addActionListener(this);
            bSiguiente.setActionCommand("siguiente");

            add(bVolver);
            add(bSiguiente);
            //----------------------------------------------------------------------
            //---------JPanel-------------------------------------------------------
            pNotificacion = new JPanel();
            pNotificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            pNotificacion.setBounds(70, 80, 450, 60);
            add(pNotificacion);
            //----------------------------------------------------------------------
            //--------JLabel--------------------------------------------------------[]//Seccion JLabel
            Font fontNotificacion = new Font("TimesRoman", Font.BOLD, 20);
            Font fontAsignatura = new Font("TimesRoman", 0, 23);
            //lValor=new JLabel(contador+"");  //---------------------------------//Instanciacion de JLabel como lValor
            //lValor.setBounds(50,50, 100,30);    //------------------------------//Mediante SetBounds se especifica su pocicion en la frame
            //add(lValor);
            lAsignatura = new JLabel();
            lAsignatura.setBounds(230, 20, 450, 60);
            lAsignatura.setFont(fontAsignatura);
            lNotificacion = new JLabel();
            lNotificacion.setBounds(80, 100, 450, 60);
            lNotificacion.setFont(fontNotificacion);
            lFecha = new JLabel();
            lFecha.setBounds(210, 150, 300, 60);
            lFecha.setFont(fontAsignatura);
            actualizarLabels();

            add(lAsignatura);
            pNotificacion.add(lNotificacion);
            add(lFecha);
            //----------------------------------------------------------------------

            //---------JFrame-------------------------------------------------------[]//Seccion JFrame
            setSize(600, 300);  //-----------------------------------------------//Se establece el tamaño de la frame
            setLayout(null);  //------------------------------------------------//No se establece un layout, puesto que se eligio la posicion anteriormente
            setVisible(true);  //-----------------------------------------------//Se permite la visibilidad a la frame y sus partes (lValor y bClick)
            setLocationRelativeTo(null);
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);  //--------//Se especifica que al cerrar la frame se detenga la ejecucion
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No existen evaluaciones en el sistema");

        }
    }

    /**
     * + * Metodo que se ejecuta al realizar un click sobre un boton. + * @param
     * ae ActionEvent +
     */
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {

            case "siguiente":
                actualizarLabels();
                break;
            case "volver":
                this.dispose();
        }
    }

    /**
     * + * Retorna los dias restantes para la evaluacion ingresada. + * @param
     * dia Dia de la evaluacion de tipo entero. + * @param mes Mes de la
     * evaluacion de tipo entero. + * @param año Año de la evaluacion de tipo
     * entero. + * @return Dias restantes para la evaluacion ingresada +
     */
    public int getDiasRestantes(int dia, int mes, int año) {
        Notificacion notificacion = new Notificacion();
        return notificacion.tiempoRestante(dia, mes, año);
    }

    //Conectar con el gestor
    /**
     * + * Metodo que se encarga de cambiar las notificaciones y pasar
     * evaluacion a evaluacion. +
     */
    public void actualizarLabels() {
        GestorArchivo gestor = new GestorArchivo();
        ArrayList<Evaluacion> evaluaciones = gestor.EvaluacionesMasCercanas();
        gestor.creadorAsignatura();
        try {
            if (!(this.contadorNotificaciones > evaluaciones.size() - 1)) {             //Si el contador no sobrepasa los limites del array
                int mes = evaluaciones.get(this.contadorNotificaciones).getMes();
                int dia = evaluaciones.get(this.contadorNotificaciones).getDia();
                int año = evaluaciones.get(this.contadorNotificaciones).getAño();
                int dias = getDiasRestantes(dia, mes, año);
                if (dias >= 0) {                                                      //Si la evaluacion no ha ocurrido aún
                    String nombreAsignatura = gestor.buscarAsignatura(evaluaciones.get(this.contadorNotificaciones).getCodigo()).getNombre();
                    lAsignatura.setText(nombreAsignatura);
                    lFecha.setText(evaluaciones.get(this.contadorNotificaciones).getTipo() + " el " + dia + "/" + mes + "/" + año);
                    this.contadorNotificaciones++;
                    lNotificacion.setText(dias + " dias restantes para la siguiente evaluacion");
                    if (nombreAsignatura.equals("")) {
                        this.dispose();
                    }
                    if (dias == 0) {
                        lNotificacion.setText("La evaluacion es hoy!!!");
                        JOptionPane.showMessageDialog(null, "SSS(fs) te desea que vaya exelente en tu evaluacion :)");
                    } else {
                        if (dias < 3) {
                            JOptionPane.showMessageDialog(null, "Aviso: Menos de 3 dias restantes \n Accion recomendada: Postergar toda actividad para liberar este tiempo \n y utilizar este tiempo para estudiar, obvio.");
                        } else if (dias < 7) {
                            JOptionPane.showMessageDialog(null, "Aviso: Menos de una semana restante \n Accion recomendada: Estudiar o trabajar inmediatamente.");
                        }
                    }
                } else {
                    this.contadorNotificaciones++;
                    actualizarLabels();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No quedan mas evaluaciones que mostrar");
                this.dispose();
            }
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No quedan mas evaluaciones que mostrar");
            this.dispose();
        }
    }

}
