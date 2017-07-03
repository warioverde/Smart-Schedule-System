/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import ClasesPrincipales.GestorArchivo;
import com.toedter.calendar.JCalendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //librerias de JFrame,JButton,JLabel,etc.

/**
 *
 * @author Jorge
 */
public class GUIIngresoAsign extends JFrame implements ActionListener  {
    
    

    protected JLabel lAsignatura,lHoras,lCodigo,lLunes,lMartes,lMiercoles,lJueves,lViernes,lSabado,lPrimero,lSegundo,lTercero,lCuarto,lAlmuerzo,lQuinto,lSexto,lSeptimo,lOctavo,lNoveno,lDecimo,lPeriodo;
    protected JButton bIngresar;
    protected JTextField tfNombre,tfHoras,tfCodigo;
    protected JCheckBox cbL1,cbL2,cbL3,cbL4,cbL5,cbL6,cbL7,cbL8,cbL9,cbL10,cbMar1,cbMar2,cbMar3,cbMar4,cbMar5,cbMar6,cbMar7,cbMar8,cbMar9,cbMar10,cbMie1,cbMie2,cbMie3,cbMie4,cbMie5,cbMie6,cbMie7,cbMie8,cbMie9,cbMie10,cbJ1,cbJ2,cbJ3,cbJ4,cbJ5,cbJ6,cbJ7,cbJ8,cbJ9,cbJ10,cbV1,cbV2,cbV3,cbV4,cbV5,cbV6,cbV7,cbV8,cbV9,cbV10,cbS1,cbS2,cbS3,cbS4,cbS5,cbS6,cbS7,cbS8,cbS9,cbS10;
    protected boolean checkMatrix;
    protected String cbMatrix;
    protected GUIIngresoAsign(){ 
        super();
        
        //-------Button---------------------------------------------------------[]//Seccion JButton
        
            //bClick=new JButton("nombre"); //----------------------------------//Instanciacion de JButton como bClick 
            //bClick.setBounds(x,y,w, h);//-------------------------------------//Con SetBounds se especifica su posicion en la ventana
            //bClick.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
            //bClick.setActionCommand("String");    //--------------------------//Establecer un string que se recibirá al accionar el boton
            //add(boton);    //-------------------------------------------------//Añadir el boton
            bIngresar=new JButton("Ingresar"); 
            bIngresar.setBounds(460,290,150,30);
            bIngresar.addActionListener(this);
            bIngresar.setActionCommand("guardar");
            add(bIngresar);
        //----------------------------------------------------------------------
        //--------JLabel--------------------------------------------------------[]//Seccion JLabel
        
            //lValor=new JLabel(contador+"");  //---------------------------------//Instanciacion de JLabel como lValor
            //lValor.setBounds(50,50, 100,30);    //------------------------------//Mediante SetBounds se especifica su pocicion en la frame
            //add(lValor);
            lAsignatura=new JLabel("Ingrese nombre asignatura");
            lAsignatura.setBounds(50,30,200,30);
            lHoras=new JLabel("Horas extra aula");
            lHoras.setBounds(280,30,200,30);
            lCodigo=new JLabel("Codigo asignatura");
            lCodigo.setBounds(450,30,200,30);
            lLunes=new JLabel("Lunes");
            lLunes.setBounds(110,80,60,30);
            lMartes=new JLabel("Martes");
            lMartes.setBounds(160,80,60,30);
            lMiercoles=new JLabel("Miercoles");
            lMiercoles.setBounds(220,80,60,30);
            lJueves=new JLabel("Jueves");
            lJueves.setBounds(280,80,60,30);
            lViernes=new JLabel("Viernes");
            lViernes.setBounds(340,80,60,30);
            lSabado=new JLabel("Sabado");
            lSabado.setBounds(400,80,60,30);
            lPrimero=new JLabel("Primero");
            lPrimero.setBounds(50,100,100,30);
            lSegundo=new JLabel("Segundo");
            lSegundo.setBounds(50,120,100,30);
            lTercero=new JLabel("Tercero");
            lTercero.setBounds(50,140,100,30);
            lCuarto=new JLabel("Cuarto");
            lCuarto.setBounds(50,160,100,30);
            lQuinto=new JLabel("Quinto");
            lQuinto.setBounds(50,200,100,30);
            lSexto=new JLabel("Sexto");
            lSexto.setBounds(50,220,100,30);
            lSeptimo=new JLabel("Septimo");
            lSeptimo.setBounds(50,240,100,30);
            lOctavo=new JLabel("Octavo");
            lOctavo.setBounds(50,260,100,30);
            lNoveno=new JLabel("Noveno");
            lNoveno.setBounds(50,280,100,30);
            lDecimo=new JLabel("Decimo");
            lDecimo.setBounds(50,300,100,30);
            lPeriodo=new JLabel("Periodo");
            lPeriodo.setBounds(50,80,60,30);
            lAlmuerzo=new JLabel("Almuerzo");
            lAlmuerzo.setBounds(50,180,100,30);
            add(lAsignatura);add(lHoras);add(lCodigo);add(lLunes);add(lMartes);add(lMiercoles);add(lJueves);add(lViernes);add(lSabado);add(lPrimero);add(lSegundo);add(lTercero);add(lCuarto);add(lAlmuerzo);add(lQuinto);add(lSexto);add(lSeptimo);add(lOctavo);add(lNoveno);add(lDecimo);add(lPeriodo);
            
            
        //----------------------------------------------------------------------
        //--------JTextField----------------------------------------------------
        
            tfNombre=new JTextField();
            tfNombre.setBounds(50,55,150,30);
            tfHoras=new JTextField();
            tfHoras.setBounds(250,55,150,30);
            tfCodigo=new JTextField();
            tfCodigo.setBounds(450,55,150,30);
            add(tfNombre);add(tfHoras);add(tfCodigo);
            
        //----------------------------------------------------------------------
        //--------JCheckBox-----------------------------------------------------
            cbL1 = new JCheckBox("");  
            cbL1.setBounds(115,105, 20,20);
            cbL2 = new JCheckBox("");  
            cbL2.setBounds(115,125, 20,20);
            cbL3 = new JCheckBox("");  
            cbL3.setBounds(115,145, 20,20);
            cbL4 = new JCheckBox("");  
            cbL4.setBounds(115,165, 20,20);
            cbL5 = new JCheckBox("");  
            cbL5.setBounds(115,205, 20,20);
            cbL6 = new JCheckBox("");  
            cbL6.setBounds(115,225, 20,20);
            cbL7 = new JCheckBox("");  
            cbL7.setBounds(115,245, 20,20);
            cbL8 = new JCheckBox("");  
            cbL8.setBounds(115,265, 20,20);
            cbL9 = new JCheckBox("");  
            cbL9.setBounds(115,285, 20,20);
            cbL10 = new JCheckBox("");  
            cbL10.setBounds(115,305, 20,20);
            cbMar1 = new JCheckBox("");  
            cbMar1.setBounds(165,105, 20,20);
            cbMar2 = new JCheckBox("");  
            cbMar2.setBounds(165,125, 20,20);
            cbMar3 = new JCheckBox("");  
            cbMar3.setBounds(165,145, 20,20);
            cbMar4 = new JCheckBox("");  
            cbMar4.setBounds(165,165, 20,20);
            cbMar5 = new JCheckBox("");  
            cbMar5.setBounds(165,205, 20,20);
            cbMar6 = new JCheckBox("");  
            cbMar6.setBounds(165,225, 20,20);
            cbMar7 = new JCheckBox("");  
            cbMar7.setBounds(165,245, 20,20);
            cbMar8= new JCheckBox("");  
            cbMar8.setBounds(165,265, 20,20);
            cbMar9= new JCheckBox("");  
            cbMar9.setBounds(165,285, 20,20);
            cbMar10= new JCheckBox("");  
            cbMar10.setBounds(165,305, 20,20);
            cbMie1= new JCheckBox("");  
            cbMie1.setBounds(225,105, 20,20);
            cbMie2 = new JCheckBox("");  
            cbMie2.setBounds(225,125, 20,20);
            cbMie3= new JCheckBox("");  
            cbMie3.setBounds(225,145, 20,20);
            cbMie4= new JCheckBox("");  
            cbMie4.setBounds(225,165, 20,20);
            cbMie5= new JCheckBox("");  
            cbMie5.setBounds(225,205, 20,20);
            cbMie6= new JCheckBox("");  
            cbMie6.setBounds(225,225, 20,20);
            cbMie7= new JCheckBox("");  
            cbMie7.setBounds(225,245, 20,20);
            cbMie8= new JCheckBox("");  
            cbMie8.setBounds(225,265, 20,20);
            cbMie9= new JCheckBox("");  
            cbMie9.setBounds(225,285, 20,20);
            cbMie10= new JCheckBox("");  
            cbMie10.setBounds(225,305, 20,20);
            cbJ1= new JCheckBox("");  
            cbJ1.setBounds(285,105, 20,20);
            cbJ2= new JCheckBox("");  
            cbJ2.setBounds(285,125, 20,20);
            cbJ3= new JCheckBox("");  
            cbJ3.setBounds(285,145, 20,20);
            cbJ4= new JCheckBox("");  
            cbJ4.setBounds(285,165, 20,20);
            cbJ5= new JCheckBox("");  
            cbJ5.setBounds(285,205, 20,20);
            cbJ6= new JCheckBox("");  
            cbJ6.setBounds(285,225, 20,20);
            cbJ7= new JCheckBox("");  
            cbJ7.setBounds(285,245, 20,20);
            cbJ8= new JCheckBox("");  
            cbJ8.setBounds(285,265, 20,20);
            cbJ9= new JCheckBox("");  
            cbJ9.setBounds(285,285, 20,20);
            cbJ10= new JCheckBox("");  
            cbJ10.setBounds(285,305, 20,20);
            cbV1= new JCheckBox("");  
            cbV1.setBounds(345,105, 20,20);
            cbV2= new JCheckBox("");  
            cbV2.setBounds(345,125, 20,20);
            cbV3= new JCheckBox("");  
            cbV3.setBounds(345,145, 20,20);
            cbV4= new JCheckBox("");  
            cbV4.setBounds(345,165, 20,20);
            cbV5= new JCheckBox("");  
            cbV5.setBounds(345,205, 20,20);
            cbV6= new JCheckBox("");  
            cbV6.setBounds(345,225, 20,20);
            cbV7= new JCheckBox("");  
            cbV7.setBounds(345,245, 20,20);
            cbV8= new JCheckBox("");  
            cbV8.setBounds(345,265, 20,20);
            cbV9= new JCheckBox("");  
            cbV9.setBounds(345,285, 20,20);
            cbV10= new JCheckBox("");  
            cbV10.setBounds(345,305, 20,20);
            cbS1= new JCheckBox("");  
            cbS1.setBounds(405,105, 20,20);
            cbS2= new JCheckBox("");  
            cbS2.setBounds(405,125, 20,20);
            cbS3= new JCheckBox("");  
            cbS3.setBounds(405,145, 20,20);
            cbS4= new JCheckBox("");  
            cbS4.setBounds(405,165, 20,20);
            cbS5= new JCheckBox("");  
            cbS5.setBounds(405,205, 20,20);
            cbS6= new JCheckBox("");  
            cbS6.setBounds(405,225, 20,20);
            cbS7= new JCheckBox("");  
            cbS7.setBounds(405,245, 20,20);
            cbS8= new JCheckBox("");  
            cbS8.setBounds(405,265, 20,20);
            cbS9= new JCheckBox("");  
            cbS9.setBounds(405,285, 20,20);
            cbS10= new JCheckBox("");  
            cbS10.setBounds(405,305, 20,20);
           
            add(cbL1);add(cbL2);add(cbL3);add(cbL4);add(cbL5);add(cbL6);add(cbL7);add(cbL8);add(cbL9);add(cbL10);add(cbMar1);add(cbMar2);add(cbMar3);add(cbMar4);add(cbMar5);add(cbMar6);add(cbMar7);add(cbMar8);add(cbMar9);add(cbMar10);add(cbMie1);add(cbMie2);add(cbMie3);add(cbMie4);add(cbMie5);add(cbMie6);add(cbMie7);add(cbMie8);add(cbMie9);add(cbMie10);add(cbJ1);add(cbJ2);add(cbJ3);add(cbJ4);add(cbJ5);add(cbJ6);add(cbJ7);add(cbJ8);add(cbJ9);add(cbJ10);add(cbV1);add(cbV2);add(cbV3);add(cbV4);add(cbV5);add(cbV6);add(cbV7);add(cbV8);add(cbV9);add(cbV10);add(cbS1);add(cbS2);add(cbS3);add(cbS4);add(cbS5);add(cbS6);add(cbS7);add(cbS8);add(cbS9);add(cbS10);
        //----------------------------------------------------------------------
        //---------JFrame-------------------------------------------------------[]//Seccion JFrame
        
            setSize(640,400);  //-----------------------------------------------//Se establece el tamaño de la frame
            setLayout(null);  //------------------------------------------------//No se establece un layout, puesto que se eligio la posicion anteriormente
            setVisible(true);  //-----------------------------------------------//Se permite la visibilidad a la frame y sus partes (lValor y bClick)
            //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //--------//Se especifica que al cerrar la frame se detenga la ejecucion
    }
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
        
            case "guardar": 
                GestorArchivo gestor=new GestorArchivo();
                gestor.codUnico(tfCodigo.getText());
                if (chkNombre() && chkHoras() && chkCodigo() && chkBoxes() ){
                    if (matchesCodigo() && intHoras() && validarCodUnico()) {
                        String horario=returnHorario();
                        System.out.println(tfCodigo.getText()+","+tfNombre.getText()+","+tfHoras.getText()+","+horario);
                        gestor.addAsignatura(tfCodigo.getText(),tfNombre.getText(),tfHoras.getText(),horario);
                        JOptionPane.showMessageDialog(null, "Asignatura ingresada exitosamente");
                        this.dispose();
                    }
                }else{
                    int ax = JOptionPane.showConfirmDialog(null, "Se han encontrado campos incompletos, ¿desea volver al menu principal?");
                    if(ax == JOptionPane.YES_OPTION)
                        this.dispose();
                    
                        
                }
            break;
        }
    }
    
    //Validaciones internas
    
    public boolean matchesCodigo(){
        if(tfCodigo.getText().matches("[a-zA-Z]{3}[0-9]{3}")){                  //formato "aaa111"
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "El codigo de asignatura debe seguir el siguiente formato 'aaa111'");
            return false;
        }
    }

    public boolean intHoras(){
        if(tfHoras.getText().matches("[1-9]{1}")){                              //Considero numeros entre 1 y 9                  
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar numeros enteros entre 1 y 9 dentro de el apartado de 'Horas'");
            return false;
        }
    }

    public boolean chkNombre(){
        if (tfNombre.getText().equals("")){return false;}
        else{return true;}
    }
    
    public boolean chkHoras(){
        if(tfHoras.getText().equals("")){return false;}
        else{return true;}
    }
    
    public boolean chkCodigo(){
        if(tfCodigo.getText().equals("")){return false;}
        else{return true;}
    }
    
    public boolean chkBoxes(){
        boolean localMatrix[]={cbL1.isSelected(),cbL2.isSelected(),cbL3.isSelected(),cbL4.isSelected(),cbL5.isSelected(),cbL6.isSelected(),cbL7.isSelected(),cbL8.isSelected(),cbL9.isSelected(),cbL10.isSelected(),cbMar1.isSelected(),cbMar2.isSelected(),cbMar3.isSelected(),cbMar4.isSelected(),cbMar5.isSelected(),cbMar6.isSelected(),cbMar7.isSelected(),cbMar8.isSelected(),cbMar9.isSelected(),cbMar10.isSelected(),cbMie1.isSelected(),cbMie2.isSelected(),cbMie3.isSelected(),cbMie4.isSelected(),cbMie5.isSelected(),cbMie6.isSelected(),cbMie7.isSelected(),cbMie8.isSelected(),cbMie9.isSelected(),cbMie10.isSelected(),cbJ1.isSelected(),cbJ2.isSelected(),cbJ3.isSelected(),cbJ4.isSelected(),cbJ5.isSelected(),cbJ6.isSelected(),cbJ7.isSelected(),cbJ8.isSelected(),cbJ9.isSelected(),cbJ10.isSelected(),cbV1.isSelected(),cbV2.isSelected(),cbV3.isSelected(),cbV4.isSelected(),cbV5.isSelected(),cbV6.isSelected(),cbV7.isSelected(),cbV8.isSelected(),cbV9.isSelected(),cbV10.isSelected(),cbS1.isSelected(),cbS2.isSelected(),cbS3.isSelected(),cbS4.isSelected(),cbS5.isSelected(),cbS6.isSelected(),cbS7.isSelected(),cbS8.isSelected(),cbS9.isSelected(),cbS10.isSelected()};
        for (int i = 0; i < localMatrix.length; i++) {
            if(localMatrix[i]==true){ return true;}
        }
        return false;
    }
    
    public String returnHorario(){
        String horario="";
        boolean localMatrix[][]={{cbL1.isSelected(),cbL2.isSelected(),cbL3.isSelected(),cbL4.isSelected(),cbL5.isSelected(),cbL6.isSelected(),cbL7.isSelected(),cbL8.isSelected(),cbL9.isSelected(),cbL10.isSelected()},{cbMar1.isSelected(),cbMar2.isSelected(),cbMar3.isSelected(),cbMar4.isSelected(),cbMar5.isSelected(),cbMar6.isSelected(),cbMar7.isSelected(),cbMar8.isSelected(),cbMar9.isSelected(),cbMar10.isSelected()},{cbMie1.isSelected(),cbMie2.isSelected(),cbMie3.isSelected(),cbMie4.isSelected(),cbMie5.isSelected(),cbMie6.isSelected(),cbMie7.isSelected(),cbMie8.isSelected(),cbMie9.isSelected(),cbMie10.isSelected()},{cbJ1.isSelected(),cbJ2.isSelected(),cbJ3.isSelected(),cbJ4.isSelected(),cbJ5.isSelected(),cbJ6.isSelected(),cbJ7.isSelected(),cbJ8.isSelected(),cbJ9.isSelected(),cbJ10.isSelected()},{cbV1.isSelected(),cbV2.isSelected(),cbV3.isSelected(),cbV4.isSelected(),cbV5.isSelected(),cbV6.isSelected(),cbV7.isSelected(),cbV8.isSelected(),cbV9.isSelected(),cbV10.isSelected()},{cbS1.isSelected(),cbS2.isSelected(),cbS3.isSelected(),cbS4.isSelected(),cbS5.isSelected(),cbS6.isSelected(),cbS7.isSelected(),cbS8.isSelected(),cbS9.isSelected(),cbS10.isSelected()}};
        String dia[]={"1","2","3","4","5","6"};
        String hora[]={"1","2","3","4","5","6","7","8","9","10"};
        for (int i = 0; i < localMatrix.length; i++) {
            for (int j = 0; j < localMatrix[0].length; j++) {
                if (localMatrix[i][j]){
                    horario+=dia[i]+"@"+hora[j]+";";
                }
            }
        }
        return horario;
    }
    
    public boolean validarCodUnico(){
        GestorArchivo gestor=new GestorArchivo();
        if(gestor.codUnico(tfCodigo.getText())){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "El codigo de asignatura debe ser unico");
            return false;
        }
    
    }
    
}



    
    
   
    
