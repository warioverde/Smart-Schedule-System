/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import ClasesPrincipales.GestorArchivo;
import ClasesPrincipales.Notificacion;
import java.awt.Font;
import javax.swing.border.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //librerias de JFrame,JButton,JLabel,etc.

/**
 *
 * @author Jorge
 */
public class GUINotificacion extends JFrame implements ActionListener  {
    
    

    protected JLabel lAsignatura,lNotificacion,lFecha;
    protected JPanel pNotificacion;
    protected JButton bVolver,bSiguiente;
    
    protected String[][] evaluaciones;                                          //Evaluaciones de [1-n] y [nombreAsignatura,tipoEvaluacion,dia,mes,año]
    private int contadorNotificaciones;
    /*protected String asignatura="Calculo de una variable";
    Notificacion notificacion=new Notificacion();                                 //Borrar
    int fecha[]={25,8,2017};
    protected String dia=notificacion.tiempoRestante(fecha[0], fecha[1], fecha[2])+"";*/
    protected GUINotificacion(){ 
        super();
        //-------Apartado para obtener la informacion de las evaluaciones-------[]
            GestorArchivo gestor = new GestorArchivo();
            this.evaluaciones=gestor.separarDatosEvaluacion();
        //----------------------------------------------------------------------
        //-------Button---------------------------------------------------------[]//Seccion JButton
            
            //bClick=new JButton("nombre"); //----------------------------------//Instanciacion de JButton como bClick 
            //bClick.setBounds(x,y,w, h);//-------------------------------------//Con SetBounds se especifica su posicion en la ventana
            //bClick.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
            //bClick.setActionCommand("String");    //--------------------------//Establecer un string que se recibirá al accionar el boton
            //add(boton);    //-------------------------------------------------//Añadir el boton
            bVolver=new JButton("Volver al menu principal");
            bVolver.setBounds(40,200,200,30);
            bVolver.addActionListener(this);
            bVolver.setActionCommand("volver");
            
            bSiguiente=new JButton("Siguiente notificacion");
            bSiguiente.setBounds(290,200,200,30);
            bSiguiente.addActionListener(this);
            bSiguiente.setActionCommand("siguiente");
            
            add(bVolver);add(bSiguiente);
        //----------------------------------------------------------------------
        //---------JPanel-------------------------------------------------------
            pNotificacion=new JPanel();
            pNotificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            pNotificacion.setBounds(40,100,450,60);
            add(pNotificacion);
        //----------------------------------------------------------------------
        //--------JLabel--------------------------------------------------------[]//Seccion JLabel
            Font fontNotificacion = new Font("TimesRoman", Font.BOLD, 20);
            Font fontAsignatura = new Font("TimesRoman", 0, 20);
            //lValor=new JLabel(contador+"");  //---------------------------------//Instanciacion de JLabel como lValor
            //lValor.setBounds(50,50, 100,30);    //------------------------------//Mediante SetBounds se especifica su pocicion en la frame
            //add(lValor);
            lAsignatura=new JLabel();
            lAsignatura.setBounds(150,50,450,60);
            lAsignatura.setFont(fontAsignatura);
            lNotificacion=new JLabel();
            lNotificacion.setBounds(50,100,450,60);
            lNotificacion.setFont(fontNotificacion);
            lFecha=new JLabel();
            lFecha.setBounds(240,150,300,60);
            lFecha.setFont(fontAsignatura);
            actualizarLabels();
            /*lHora=new JLabel("");
            lHora.setBounds(150,50,450,60);
            lTipo=new JLabel("");
            lTipo.setBounds(150,50,450,60);
            lPorcentaje=new JLabel(asignatura);
            lPorcentaje.setBounds(150,50,450,60);*/
            
            add(lAsignatura);pNotificacion.add(lNotificacion);add(lFecha);
        //----------------------------------------------------------------------
        
        //---------JFrame-------------------------------------------------------[]//Seccion JFrame
        
            setSize(600,300);  //-----------------------------------------------//Se establece el tamaño de la frame
            setLayout(null);  //------------------------------------------------//No se establece un layout, puesto que se eligio la posicion anteriormente
            setVisible(true);  //-----------------------------------------------//Se permite la visibilidad a la frame y sus partes (lValor y bClick)
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);  //--------//Se especifica que al cerrar la frame se detenga la ejecucion
            
    }
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
        
            case "siguiente": actualizarLabels();
            break;
        }
    }
    
    public int getDiasRestantes(int dia,int mes,int año){
        Notificacion notificacion = new Notificacion();
        return notificacion.tiempoRestante(dia, mes, año);
    }
    
    //Conectar con el gestor
    
    public void actualizarLabels(){
        if (!(this.contadorNotificaciones>evaluaciones.length-1)){
            System.out.println(evaluaciones[this.contadorNotificaciones][2]+"/"+evaluaciones[this.contadorNotificaciones][3]+"/"+evaluaciones[this.contadorNotificaciones][4]);
            lAsignatura.setText(evaluaciones[this.contadorNotificaciones][0]);
            int dia=Integer.parseInt(evaluaciones[this.contadorNotificaciones][2]);
            int mes=Integer.parseInt(evaluaciones[this.contadorNotificaciones][3]);
            int año=Integer.parseInt(evaluaciones[this.contadorNotificaciones][4]);
            int dias=getDiasRestantes(dia,mes,año);
            lNotificacion.setText(dias+" dias restantes para la siguiente evaluacion");
            lFecha.setText(evaluaciones[this.contadorNotificaciones][1]+"-"+dia+"/"+mes+"/"+año);
            this.contadorNotificaciones++;
        }
        else{
            this.dispose();
        }
        
        
    }

    
}



    
    
   
    
