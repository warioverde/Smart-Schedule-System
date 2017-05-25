package proyectoprogra1;

import java.awt.Color;
import javax.swing.*; //librerias de JFrame
import java.awt.event.*; //Librerias de eventos
import java.awt.color.*;
import javax.swing.event.ChangeListener;

public class GuiIndex extends JFrame  {
    
    
    
    JFrame f;
    JButton bCerrar;
    //final JTextField ;
    //JLabel ;
    //final JComboBox ;
    //JTextArea ;
    //JScrollPane ;
    //ButtonGroup ;
    //JRadioButton ;
            
    

    GuiIndex(){ 
        f = new JFrame("Tarea Ayud08");
        //----------TextField------------
            //tfNombre=new JTextField("");
            //tfNombre.setBounds(30,80,100,20);
            //f.add(tfNombre);
        //----------------------------------------------------------------------
        //---------ComboBox-----------------------------------------------------
            //String filas[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
            //cbFilas=new JComboBox(filas);    
            //cbFilas.setBounds(50, 20,90,20);    
        
            //cbFilas.addActionListener (new ActionListener () {
            //public void actionPerformed(ActionEvent e) {
            
            //}
            //});
            //f.add(cbFilas);
        //-------------------------------
        //-------Button------------------
            //Boton guardar datos
            //guardar=new JButton("Guardar");//create button  
            //guardar.setBounds(250,150,100, 40);  
            //guardar.addActionListener(new java.awt.event.ActionListener() {
                //public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //clickOnGuardar(evt);
                //}
            //});
            //Boton cerrar programa
            bCerrar=new JButton("Cerrar");//create button  
        bCerrar.setBounds(250,20,75, 20);
        bCerrar.setBackground( Color.RED );    
        bCerrar.setForeground( Color.WHITE);
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });
        
        f.add(bCerrar);
        
        //----------------------------------------------------------------------
        //-----------------TextArea---------------------------------------------
            //taBusca=new JTextArea();
            //taBusca.setColumns(20);
            //taBusca.setRows(3);
            //taBusca.setBounds(50,210, 200,320);  
            //f.add(taBusca);

            
        //----------------------------------------------------------------------
        //--------RadioButton--------------------------------------------------------------
            //rNombre=new JRadioButton("Nombre");    
            //rNombre.setBounds(260,190,100,30);    
            //bg=new ButtonGroup();    
            //bg.add(rNombre); 
            //f.add(rNombre);
        //----------------------------------------------------------------------
        
        //--------JLabel--------------------------------------------------------
            //lNombre=new JLabel("Nombre");  
            //lNombre.setBounds(50,50, 100,30);
            //f.add(lNombre);
        //-------------------------------
         
          
        //f.add(b);//adding button on frame  
        f.setSize(400,600);  
        f.setLayout(null);  
        f.setVisible(true);  
    }
}