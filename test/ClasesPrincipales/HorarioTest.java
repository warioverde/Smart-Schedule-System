/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipales;

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
public class HorarioTest {
    Horario horario;
    public HorarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        horario=new Horario();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHorario method, of class Horario.
     */
    /*@Test
    public void testGetHorario() {
    System.out.println("getHorario");
    String[][] expResult = null;
    String[][] result = horario.getHorario();
    assertArrayEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
    }*/

    /**
     * Test of setHorarioInicial method, of class Horario.
     */
    /*@Test
    public void testSetHorarioInicial() {
    System.out.println("setHorarioInicial");
    this.horario.setHorarioInicial();
    // TODO review the generated test code and remove the default call to fail.
    
    }*/

    /**
     * Test of setHorario method, of class Horario.
     */
    @Test
    public void testSetHorario() {
    System.out.println("setHorario");
    horario.setHorarioInicial();
    int dia = 2;
    int periodo = 3;
    String asignatura = "Matematicas";
    horario.setHorario(dia, periodo, asignatura);
    
    int dia2 = 2;
    int periodo2 = 3;
    String asignatura2 = "\n Ciencias";
    horario.setHorario(dia2, periodo2, asignatura2);
    
    horario.showXConsola();
    // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of showXConsola method, of class Horario.
     */
    /*@Test
    public void testShowXConsola() {
    System.out.println("showXConsola");
    horario.setHorarioInicial();
    horario.showXConsola();
    // TODO review the generated test code and remove the default call to fail.
    
    }*/
    
}
