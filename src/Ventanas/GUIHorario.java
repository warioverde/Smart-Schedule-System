/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import ClasesPrincipales.GestorArchivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //librerias de JFrame,JButton,JLabel,etc.

/**
 *
 * @author Jorge
 */
public class GUIHorario extends JFrame implements ActionListener  {
    
    

    //protected JLabel ;
    protected JButton bVolver;
    protected JTable tHorario;
    
    protected GUIHorario(){ 
        super();
        
        
        
        
         String col[]={"Periodo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"}; 
         //--------jButton------------------------------------------------------
            bVolver=new JButton("VOLVER");  
            bVolver.setBounds(500,200,100, 30);
            bVolver.addActionListener(this); 
            bVolver.setActionCommand("volver");    
            add(bVolver);    
        //----------------------------------------------------------------------
        //--------JTable---------------------------------------------------------
            tHorario=new JTable(getHorario(),col);
            tHorario.setBounds(50,50,440,192);
            
            tHorario.getColumnModel().getSelectionModel();
            
            add(tHorario);
        //----------------------------------------------------------------------
        //--------JLabel--------------------------------------------------------[]//Seccion JLabel
        
            //lValor=new JLabel(contador+"");  //---------------------------------//Instanciacion de JLabel como lValor
            //lValor.setBounds(50,50, 100,30);    //------------------------------//Mediante SetBounds se especifica su pocicion en la frame
            //add(lValor);
        //---------JFrame-------------------------------------------------------[]//Seccion JFrame
        
            setSize(620,500);  //-----------------------------------------------//Se establece el tamaño de la frame
            setLayout(null);  //------------------------------------------------//No se establece un layout, puesto que se eligio la posicion anteriormente
            setVisible(true);  //-----------------------------------------------//Se permite la visibilidad a la frame y sus partes (lValor y bClick)
            //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //--------//Se especifica que al cerrar la frame se detenga la ejecucion
    }
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
        
            case "volver": this.dispose();
            break;
            
        }
       
    }
    
    public String[][] getHorario(){
        GestorArchivo gestor=new GestorArchivo();
        gestor.creadorAsignatura();
        gestor.mkHorario();
        String horario[][]=gestor.getHorario();
        return horario;
        
    }

    
}



    
    
   
    
