/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoprogra1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //librerias de JFrame,JButton,JLabel,etc.

/**
 *
 * @author Jorge
 */
public class GUIIndex extends JFrame implements ActionListener  {
    
    

    protected JLabel lIngresar,lNotificacion,lHorario;
    protected JButton bIr,bNotificacion,bHorario;
    
    protected GUIIndex(){ 
        super();
        
        //-------Button---------------------------------------------------------[]//Seccion JButton
        
            //bClick=new JButton("nombre"); //----------------------------------//Instanciacion de JButton como bClick 
            //bClick.setBounds(x,y,w, h);//-------------------------------------//Con SetBounds se especifica su posicion en la ventana
            //bClick.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
            //bClick.setActionCommand("String");    //--------------------------//Establecer un string que se recibirá al accionar el boton
            //add(boton);    //-------------------------------------------------//Añadir el boton
            
            bIr=new JButton("Ir"); //----------------------------------//Instanciacion de JButton como bClick 
            bIr.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
            bIr.setActionCommand("Ir");    //--------------------------//Establecer un string que se recibirá al accionar el boton
            bIr.setBounds(40,100, 100,30);
            
            bNotificacion=new JButton("Notificaciones"); //----------------------------------//Instanciacion de JButton como bClick 
            bNotificacion.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
            bNotificacion.setActionCommand("Notificacion");    //--------------------------//Establecer un string que se recibirá al accionar el boton
            bNotificacion.setBounds(170,100, 100,30);
            
            bHorario=new JButton("Horario"); //----------------------------------//Instanciacion de JButton como bClick 
            bHorario.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
            bHorario.setActionCommand("Horario");    //--------------------------//Establecer un string que se recibirá al accionar el boton
            bHorario.setBounds(300,100, 100,30);
            
            add(bIr);add(bNotificacion);add(bHorario);
        //----------------------------------------------------------------------
        //--------JLabel--------------------------------------------------------[]//Seccion JLabel
        
            //lValor=new JLabel(contador+"");  //---------------------------------//Instanciacion de JLabel como lValor
            //lValor.setBounds(50,50, 100,30);    //------------------------------//Mediante SetBounds se especifica su pocicion en la frame
            //add(lValor);
            
            lIngresar=new JLabel("Ingresar asignatura");  //---------------------------------//Instanciacion de JLabel como lValor
            lIngresar.setBounds(40,50, 150,30);    //------------------------------//Mediante SetBounds se especifica su pocicion en la frame
            
            
            lNotificacion=new JLabel("Ver notificaciones");  //---------------------------------//Instanciacion de JLabel como lValor
            lNotificacion.setBounds(170,50, 150,30);    //------------------------------//Mediante SetBounds se especifica su pocicion en la frame
            
            
            lHorario=new JLabel("Ver horario");  //---------------------------------//Instanciacion de JLabel como lValor
            lHorario.setBounds(310,50, 150,30);    //------------------------------//Mediante SetBounds se especifica su pocicion en la frame
            add(lIngresar);add(lNotificacion);add(lHorario);
        //----------------------------------------------------------------------
        //---------JFrame-------------------------------------------------------[]//Seccion JFrame
        
            setSize(500,300);  //-----------------------------------------------//Se establece el tamaño de la frame
            setLayout(null);//------------------------------------------------//No se establece un layout, puesto que se eligio la posicion anteriormente
            setVisible(true);  //-----------------------------------------------//Se permite la visibilidad a la frame y sus partes (lValor y bClick)
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //--------//Se especifica que al cerrar la frame se detenga la ejecucion
    }
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
        
            case "Ir": ingresarAsignatura();
            break;
            case "Notificacion": verNotificaciones();
            break;
            case "Horario": verHorario();
            break;
        }
    }
    public void ingresarAsignatura(){GUIIngreso ingreso=new GUIIngreso();}
    
    public void verNotificaciones(){
        GUINotificacion notificacion=new GUINotificacion(); 
    }
    
    public void verHorario(){}

    
}



    
    
   
    
