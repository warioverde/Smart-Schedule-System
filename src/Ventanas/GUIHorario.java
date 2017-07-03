/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import ClasesPrincipales.GestorArchivo;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*; //librerias de JFrame,JButton,JLabel,etc.
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge
 */
public class GUIHorario extends JFrame implements ActionListener,MouseListener {
    
    

    //protected JLabel ;
    protected JButton bVolver;
    protected JTable tHorario;
    
    /**
    * Constructor de la clase e iniciador de los componentes de la ventana.
    */
    protected GUIHorario(){ 
        super();
        
         String col[]={"Periodo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"}; 
         //--------jButton------------------------------------------------------
            bVolver=new JButton("VOLVER");  
            bVolver.setBounds(250,410,100, 30);
            bVolver.addActionListener(this); 
            bVolver.setActionCommand("volver");    
            add(bVolver);    
        //----------------------------------------------------------------------
        //--------JTable---------------------------------------------------------
            String[][] horario=getHorario();
            tHorario=new JTable(horario,col);
            tHorario.setRowHeight(33);
            tHorario.setBounds(5,5,600,395);
            tHorario.setBackground(new java.awt.Color(184, 223, 254));
            
            tHorario.addMouseListener(this);
    
            DefaultTableModel tableModel = new DefaultTableModel(horario, col) {

             @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
            }
            };

            tHorario.setModel(tableModel);
            
            
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
    
    /**
    * Metodo que se acciona al realizarse una accion sobreun boton
    * @param ae ActionEvent
    */
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
        
            case "volver": this.dispose();
            break;
        }
    }
    
    
    /**
    * Retorna un String bidimensional con el horario de clases (Periodo x Dia).
    * @return Un String bidimensional de horario de clases (Periodo x Dia).
    */
    public String[][] getHorario(){
        GestorArchivo gestor=new GestorArchivo();
        gestor.creadorAsignatura();
        gestor.mkHorario();
        gestor.hacerHorasDeEstudio();
        String horario[][]=gestor.getHorario().getHorario();
        return horario;
        
    }
    
    /**
    * Metodo que se ejecuta al realizar un click sobre una celda del JTable.
    * @param me MouseEvent
    */
    @Override
    public void mouseClicked(MouseEvent me) {
        int row = tHorario.rowAtPoint(me.getPoint());
        int column = tHorario.columnAtPoint(me.getPoint());
        GestorArchivo gestor=new GestorArchivo();
        gestor.creadorAsignatura();
        gestor.mkHorario();
        gestor.hacerHorasDeEstudio();
        JOptionPane.showMessageDialog(null, gestor.getHorario().getHorarioInfo(row, column));
        
    }

    /**
    * Metodo que se ejecuta al mantener un click sobre una celda del JTable.
    * @param me MouseEvent
    */
    @Override
    public void mousePressed(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
    * Metodo que se ejecuta al soltar un click sobre una celda del JTable.
    * @param me MouseEvent
    */
    @Override
    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
    * Metodo que se ejecuta al pasar sobre una celda del JTable.
    * @param me MouseEvent
    */
    @Override
    public void mouseEntered(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
    * Metodo que se ejecuta al salir de una celda del JTable.
    * @param me MouseEvent
    */
    @Override
    public void mouseExited(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}



    
    
   
    
