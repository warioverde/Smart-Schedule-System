/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipales;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorge
 */
public class GestorArchivoTest {
    
    public GestorArchivoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAsignaturas method, of class GestorArchivo.
     */
    /*@Test
    public void testGetAsignaturas() {
    System.out.println("getAsignaturas");
    GestorArchivo instance = new GestorArchivo();
    ArrayList<Asignatura> expResult = null;
    ArrayList<Asignatura> result = instance.getAsignaturas();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
    }
    /*
    /**
    * Test of creadorAsignatura method, of class GestorArchivo.
    */
    /*@Test
    public void testCreadorAsignatura() {
    System.out.println("creadorAsignatura");
    GestorArchivo instance = new GestorArchivo();
    instance.creadorAsignatura();
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
    }*/
    
    /**
     * Test of getNombres method, of class GestorArchivo.
     */
    /*@Test
    public void testGetNombres() {
    System.out.println("getNombres");
    GestorArchivo instance = new GestorArchivo();
    String[] expResult = null;
    String[] result = instance.getNombres();
    assertArrayEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
    }*/
    
    /**
     * Test of addAsignatura method, of class GestorArchivo.
     */
    /*@Test
    public void testAddAsignatura() {
    System.out.println("addAsignatura");
    String codigo = "";
    String nombre = "";
    String horas = "";
    String horario = "";
    GestorArchivo instance = new GestorArchivo();
    instance.addAsignatura(codigo, nombre, horas, horario);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
    }*/
    
    /**
     * Test of addEvaluacion method, of class GestorArchivo.
     */
    /*@Test
    public void testAddEvaluacion() {
    System.out.println("addEvaluacion");
    Asignatura asignatura = null;
    String tipo = "";
    int dia = 0;
    int mes = 0;
    int año = 0;
    GestorArchivo instance = new GestorArchivo();
    instance.addEvaluacion(asignatura, tipo, dia, mes, año);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
    }*/
    
    /**
     * Test of separarDatosEvaluacion method, of class GestorArchivo.
     */
    /* @Test
    public void testSepararDatosEvaluacion() {
    System.out.println("separarDatosEvaluacion");
    GestorArchivo instance = new GestorArchivo();
    String[][] expResult = null;
    String[][] result = instance.separarDatosEvaluacion();
    assertArrayEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
    }*/
    
    /**
     * Test of separarDatosAsignatura method, of class GestorArchivo.
     */
    /*@Test
    public void testSepararDatosAsignatura() {
        System.out.println("separarDatosAsignatura");
        GestorArchivo instance = new GestorArchivo();
        String[][] expResult = null;
        String[][] result = instance.separarDatosAsignatura();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of mkHorario method, of class GestorArchivo.
     */
    @Test
    public void testMkHorario() {
        System.out.println("mkHorario");
        GestorArchivo gestor = new GestorArchivo();
        gestor.mkHorario();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
