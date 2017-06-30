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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge
 */
public class GUIHorario extends JFrame implements ActionListener  {
    
    

    //protected JLabel ;
    protected JButton bVolver;
    protected JTable tHorario;
    protected String hD[],h1[],h2[],h3[],h4[],hAlm[],h5[],h6[],h7[],h8[],h9[],h10[];
    protected GUIHorario(){ 
        super();
        hD=new String[7];hD[0]="Periodo";hD[1]="Lunes";hD[2]="Martes";hD[3]="Miercoles";hD[4]="Jueves";hD[5]="Viernes";hD[6]="Sabado";
        h1=new String[7];h1[0]="1°";h1[1]="-";h1[2]="-";h1[3]="-";h1[4]="-";h1[5]="-";h1[6]="-";
        h2=new String[7];h2[0]="2°";h2[1]="-";h2[2]="-";h2[3]="-";h2[4]="-";h2[5]="-";h2[6]="-";
        h3=new String[7];h3[0]="3°";h3[1]="-";h3[2]="-";h3[3]="-";h3[4]="-";h3[5]="-";h3[6]="-";
        h4=new String[7];h4[0]="4°";h4[1]="-";h4[2]="-";h4[3]="-";h4[4]="-";h4[5]="-";h4[6]="-";
        hAlm=new String[7];hAlm[0]="Almuerzo";hAlm[1]="-";hAlm[2]="-";hAlm[3]="-";hAlm[4]="-";hAlm[5]="-";hAlm[6]="-";
        h5=new String[7];h5[0]="5°";h5[1]="-";h5[2]="-";h5[3]="-";h5[4]="-";h5[5]="-";h5[6]="-";
        h6=new String[7];h6[0]="6°";h6[1]="-";h6[2]="-";h6[3]="-";h6[4]="-";h6[5]="-";h6[6]="-";
        h7=new String[7];h7[0]="7°";h7[1]="-";h7[2]="-";h7[3]="-";h7[4]="-";h7[5]="-";h7[6]="-";
        h8=new String[7];h8[0]="8°";h8[1]="-";h8[2]="-";h8[3]="-";h8[4]="-";h8[5]="-";h8[6]="-";
        h9=new String[7];h9[0]="9°";h9[1]="-";h9[2]="-";h9[3]="-";h9[4]="-";h9[5]="-";h9[6]="-";
        h10=new String[7];h10[0]="10°";h10[1]="-";h10[2]="-";h10[3]="-";h10[4]="-";h10[5]="-";h10[6]="-";
        
        
        String horario[][]={hD,h1,h2,h3,h4,hAlm,h5,h6,h7,h8,h9,h10};
        
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
            
            
            DefaultTableModel tableModel = new DefaultTableModel(getHorario(), col) {

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



    
    
   
    
