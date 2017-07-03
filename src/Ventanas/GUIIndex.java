/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //librerias de JFrame,JButton,JLabel,etc.

/**
 *
 * @author Jorge
 */
public class GUIIndex extends JFrame implements ActionListener  {
    
    

    protected JLabel lIngresar,lNotificacion,lHorario,lIngresarEval,lTitulo,lSubtitulo;
    protected JButton bIr,bNotificacion,bHorario,bIngresarEval;
    protected JSeparator jSeparador;
    
    public GUIIndex(){ 
        super();
        
        //-------Button---------------------------------------------------------[]//Seccion JButton
        
            //bClick=new JButton("nombre"); //----------------------------------//Instanciacion de JButton como bClick 
            //bClick.setBounds(x,y,w, h);//-------------------------------------//Con SetBounds se especifica su posicion en la ventana
            //bClick.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
            //bClick.setActionCommand("String");    //--------------------------//Establecer un string que se recibirá al accionar el boton
            //add(boton);    //-------------------------------------------------//Añadir el boton
            
            bIr=new JButton("Ingresar"); //----------------------------------//Instanciacion de JButton como bClick 
            bIr.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
            bIr.setActionCommand("Ir");    //--------------------------//Establecer un string que se recibirá al accionar el boton
            bIr.setBounds(40,200, 100,30);
            
            bNotificacion=new JButton("Notificaciones"); //----------------------------------//Instanciacion de JButton como bClick 
            bNotificacion.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
            bNotificacion.setActionCommand("Notificacion");    //--------------------------//Establecer un string que se recibirá al accionar el boton
            bNotificacion.setBounds(290,200, 115,30);
            
            bHorario=new JButton("Horario"); 
            bHorario.addActionListener(this);
            bHorario.setActionCommand("Horario");   
            bHorario.setBounds(430,200, 100,30);
            
            bIngresarEval=new JButton("Ingresar"); 
            bIngresarEval.addActionListener(this);
            bIngresarEval.setActionCommand("evaluacion");   
            bIngresarEval.setBounds(170,200, 100,30);
            
            add(bIr);add(bNotificacion);add(bHorario);add(bIngresarEval);
        //----------------------------------------------------------------------
        //--------JLabel--------------------------------------------------------[]//Seccion JLabel
        
            //lValor=new JLabel(contador+"");  //---------------------------------//Instanciacion de JLabel como lValor
            //lValor.setBounds(50,50, 100,30);    //------------------------------//Mediante SetBounds se especifica su pocicion en la frame
            //add(lValor);
            Font fontSSS = new Font("TimesRoman", Font.BOLD, 25);
            
            lIngresar=new JLabel("Ingresar asignatura"); 
            lIngresar.setBounds(40,150, 150,30);   
            
            lIngresarEval=new JLabel("Ingresar Evaluacion"); 
            lIngresarEval.setBounds(170,150, 150,30);  
            
            
            lNotificacion=new JLabel("Ver notificaciones");  
            lNotificacion.setBounds(300,150, 150,30);   
            
            
            lHorario=new JLabel("Ver horario"); 
            lHorario.setBounds(430,150, 150,30);
            lTitulo=new JLabel("SMART SCHEDULE SYSTEM"); 
            lTitulo.setBounds(120,40, 350,60);
            lTitulo.setFont(fontSSS);
            add(lIngresar);add(lNotificacion);add(lHorario);add(lIngresarEval);add(lTitulo);
        //----------------------------------------------------------------------
        //-----------JSeparator-------------------------------------------------
        
             jSeparador= new JSeparator();
             jSeparador.setBounds(0,100,600,5);
             add(jSeparador);
        //----------------------------------------------------------------------
        //---------JFrame-------------------------------------------------------[]//Seccion JFrame
        
            setSize(560,300);  //-----------------------------------------------//Se establece el tamaño de la frame
            setLayout(null);//------------------------------------------------//No se establece un layout, puesto que se eligio la posicion anteriormente
            setVisible(true);  //-----------------------------------------------//Se permite la visibilidad a la frame y sus partes (lValor y bClick)
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //--------//Se especifica que al cerrar la frame se detenga la ejecucion
            setLocationRelativeTo(null);

    }
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
        
            case "Ir": ingresarAsignatura();
            break;
            case "Notificacion": verNotificaciones();
            break;
            case "Horario": verHorario();
            break;
            case "evaluacion": ingresarEvaluacion();
            break;
        }
    }
    public void ingresarAsignatura(){GUIIngresoAsign ingreso=new GUIIngresoAsign();}
    
    public void ingresarEvaluacion(){GUIIngresoEval ingreso=new GUIIngresoEval();}
    
    public void verNotificaciones(){GUINotificacion notificacion=new GUINotificacion();}
    
    public void verHorario(){ GUIHorario horario=new GUIHorario();}

    
}



    
    
   
    
