/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoprogra1;

import com.toedter.calendar.JCalendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //librerias de JFrame,JButton,JLabel,etc.

/**
 *
 * @author Jorge
 */
public class GUIIngreso extends JFrame implements ActionListener  {
    
    

    protected JLabel lAsignatura,lFecha;
    protected JButton bIngresar;
    protected JTextField tfAsignatura;
    protected JCalendar cEvaluacion;
    
    protected GUIIngreso(){ 
        super();
        
        //-------Button---------------------------------------------------------[]//Seccion JButton
        
            //bClick=new JButton("nombre"); //----------------------------------//Instanciacion de JButton como bClick 
            //bClick.setBounds(x,y,w, h);//-------------------------------------//Con SetBounds se especifica su posicion en la ventana
            //bClick.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
            //bClick.setActionCommand("String");    //--------------------------//Establecer un string que se recibirá al accionar el boton
            //add(boton);    //-------------------------------------------------//Añadir el boton
            bIngresar=new JButton("Ingresar"); 
            bIngresar.setBounds(50,320,150,30);
            bIngresar.addActionListener(this);
            add(bIngresar);
        //----------------------------------------------------------------------
        //--------JLabel--------------------------------------------------------[]//Seccion JLabel
        
            //lValor=new JLabel(contador+"");  //---------------------------------//Instanciacion de JLabel como lValor
            //lValor.setBounds(50,50, 100,30);    //------------------------------//Mediante SetBounds se especifica su pocicion en la frame
            //add(lValor);
            lAsignatura=new JLabel("Ingrese nombre asignatura");
            lAsignatura.setBounds(50,40,200,30);
            lFecha=new JLabel("Selecciona fecha evaluacion");
            lFecha.setBounds(50,100,200,30);
            add(lAsignatura);add(lFecha);
        //----------------------------------------------------------------------
        //--------JTextField----------------------------------------------------
        
            tfAsignatura=new JTextField();
            tfAsignatura.setBounds(50,70,150,30);
            add(tfAsignatura);
        //----------------------------------------------------------------------
        //--------JCalendar-----------------------------------------------------
            cEvaluacion=new JCalendar();
            cEvaluacion.setBounds(50,130,200,200);
            add(cEvaluacion);
        //----------------------------------------------------------------------
        //---------JFrame-------------------------------------------------------[]//Seccion JFrame
        
            setSize(300,400);  //-----------------------------------------------//Se establece el tamaño de la frame
            setLayout(null);  //------------------------------------------------//No se establece un layout, puesto que se eligio la posicion anteriormente
            setVisible(true);  //-----------------------------------------------//Se permite la visibilidad a la frame y sus partes (lValor y bClick)
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //--------//Se especifica que al cerrar la frame se detenga la ejecucion
    }
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
        
            case "plus": ;
            break;
        }
    }

    
}



    
    
   
    
