/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Archivos.ArchivoAsignatura;
import ClasesPrincipales.Asignatura;
import ClasesPrincipales.GestorArchivo;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*; //librerias de JFrame,JButton,JLabel,etc.

/**
 *
 * @author Jorge
 */
public class GUIIngresoEval extends JFrame implements ActionListener {

    protected JLabel lAsignatura, lTipo, lFecha;
    protected JButton bGuardar;
    protected JRadioButton rbPrueba, rbTrabajo, rbTaller, rbTarea, rbOtro;
    protected JComboBox cbAsignatura;
    protected JDateChooser dcFecha;
    protected JTextField tfOtro;
    protected ButtonGroup bgTipo;

    /**
     * + * Constructor de la clase +
     */
    protected GUIIngresoEval() {
        super();
        init();
    }

    /**
     * + * Iniciador de los componentes de la ventana. +
     */
    public void init() {

        //-------Button---------------------------------------------------------[]//Seccion JButton
        bGuardar = new JButton("Ingresar"); //----------------------------------//Instanciacion de JButton como bClick 
        bGuardar.setBounds(420, 200, 100, 60);//-------------------------------------//Con SetBounds se especifica su posicion en la ventana
        bGuardar.addActionListener(this); //--------------------------------//Añadir un actionListener a "esta" instancia
        bGuardar.setActionCommand("guardar");    //--------------------------//Establecer un string que se recibirá al accionar el boton
        add(bGuardar);    //-------------------------------------------------//Añadir el boton

        //----------------------------------------------------------------------
        //--------JRadioButton--------------------------------------------------
        rbPrueba = new JRadioButton("Prueba");
        rbPrueba.setName("Prueba");
        rbPrueba.setBounds(200, 100, 70, 30);
        rbTrabajo = new JRadioButton("Trabajo");
        rbTrabajo.setName("Trabajo");
        rbTrabajo.setBounds(200, 125, 70, 30);
        rbTaller = new JRadioButton("Taller");
        rbTaller.setName("Taller");
        rbTaller.setBounds(270, 100, 70, 30);
        rbTarea = new JRadioButton("Tarea");
        rbTarea.setName("Tarea");
        rbTarea.setBounds(270, 125, 70, 30);
        rbOtro = new JRadioButton("Otro");
        rbOtro.setBounds(340, 100, 70, 30);

        bgTipo = new ButtonGroup();
        bgTipo.add(rbPrueba);
        bgTipo.add(rbTrabajo);
        bgTipo.add(rbTaller);
        bgTipo.add(rbTarea);
        bgTipo.add(rbOtro);
        add(rbPrueba);
        add(rbTrabajo);
        add(rbTaller);
        add(rbTarea);
        add(rbOtro);
        //----------------------------------------------------------------------
        //-------JTextField-----------------------------------------------------
        tfOtro = new JTextField();
        tfOtro.setBounds(340, 130, 70, 25);
        add(tfOtro);
        //----------------------------------------------------------------------
        //--------JLabel--------------------------------------------------------[]//Seccion JLabel

        lAsignatura = new JLabel("Asignatura");
        lAsignatura.setBounds(50, 50, 100, 30);
        lTipo = new JLabel("Tipo");
        lTipo.setBounds(200, 50, 100, 30);
        lFecha = new JLabel("Fecha");
        lFecha.setBounds(430, 50, 100, 30);

        add(lAsignatura);
        add(lTipo);
        add(lFecha);

        //--------JDateChooser-----------------------------------------------------
        dcFecha = new JDateChooser();
        dcFecha.setBounds(430, 100, 100, 30);
        add(dcFecha);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dcFecha.getDateEditor();
        editor.setEditable(false);
        //----------------------------------------------------------------------
        //--------JComboBox-----------------------------------------------------

        cbAsignatura = new JComboBox(getNombres());
        cbAsignatura.setBounds(50, 100, 150, 30);
        add(cbAsignatura);
        //----------------------------------------------------------------------
        //---------JFrame-------------------------------------------------------[]//Seccion JFrame

        setSize(600, 320);  //-----------------------------------------------//Se establece el tamaño de la frame
        setLayout(null);  //------------------------------------------------//No se establece un layout, puesto que se eligio la posicion anteriormente
        setVisible(true);  //-----------------------------------------------//Se permite la visibilidad a la frame y sus partes (lValor y bClick)
        setLocationRelativeTo(null);
        checkComboBox();
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //--------//Se especifica que al cerrar la frame se detenga la ejecucion

    }

    /**
     * + * Metodo que se acciona al realizarse una accion sobreun boton +
     *
     *
     * @param ae ActionEvent +
     */
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {

            case "guardar":
                if (chkTipo() && cbAsignatura.getSelectedItem() != null && chkFecha() && chkOtro()) {

                    GestorArchivo gestor = new GestorArchivo();
                    gestor.creadorAsignatura();
                    ArrayList<Asignatura> asignaturas = gestor.getAsignaturas();
                    gestor.addEvaluacion(asignaturas.get(cbAsignatura.getSelectedIndex()), getTipo(), (dcFecha.getDate().getDate()), (dcFecha.getDate().getMonth() + 1), (dcFecha.getDate().getYear() + 1900));
                    JOptionPane.showMessageDialog(null, "Evaluacion ingresada exitosamente");
                    this.dispose();
                } else {
                    int ax = JOptionPane.showConfirmDialog(null, "Se han encontrado campos incompletos, ¿desea volver al menu principal?");
                    if (ax == JOptionPane.YES_OPTION) {
                        this.dispose();
                    }

                    break;
                }
        }
    }

    //Validaciones internas
    /**
     * + * Retorna un booleano segun si existe al menos una casilla marcada
     * entre los radioButton. + * @return Retorna verdadero o falso +
     */
    public boolean chkTipo() {
        boolean localMatrix[] = {rbPrueba.isSelected(), rbTaller.isSelected(), rbTrabajo.isSelected(), rbTarea.isSelected(), rbOtro.isSelected()};
        for (int i = 0; i < localMatrix.length; i++) {
            if (localMatrix[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * + * Retorna un booleano segun si el campo de tfOtro (TextField) contiene
     * un String + * @return Retorna verdadero o falso +
     */
    public boolean chkOtro() {
        if (rbOtro.isSelected() && tfOtro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo 'otro' esta vacio");
            return false;
        }
        return true;

    }

    /**
     * + * Retorna un booleano segun si se ha ingresado alguna fecha. +
     *
     *
     * @return Retorna verdadero o falso +
     */
    public boolean chkFecha() {
        String fecha = ((JTextField) dcFecha.getDateEditor().getUiComponent()).getText();

        if (fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No ha ingresado fechas", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * + * Retorna un String con el tipo de evaluacion ingresada. + * @return Un
     * String con el tipo de evaluacion +
     */
    public String getTipo() {
        JRadioButton localMatrix[] = {rbPrueba, rbTaller, rbTrabajo, rbTarea};
        for (int i = 0; i < localMatrix.length; i++) {
            if (localMatrix[i].isSelected()) {
                return localMatrix[i].getName();
            } else {
                if (rbOtro.isSelected()) {
                    return tfOtro.getText();
                }
            }

        }
        return "";
    }

    /**
     * + * Retorna un String bidimensional con los nombres de las asignaturas
     * ingresadas. + * @return Un String bidimensional con nombres de
     * asignatura. +
     */
    public String[] getNombres() {
        GestorArchivo gestor = new GestorArchivo();
        gestor.creadorAsignatura();
        return gestor.getNombres();
    }

    /**
     * + * Retorna un booleano segun si se ha ingresado alguna asignatura
     * anteriormente. + * @return Retorna verdadero o falso +
     */
    public void checkComboBox() {
        System.out.println(cbAsignatura.getItemCount());
        if (cbAsignatura.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "No existen asignaturas ingresadas, no se puede ingresar evaluaciones sin asignatura");
            this.dispose();
        }

    }
}
