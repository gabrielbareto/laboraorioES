/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel
 */
public class testINSS {
    
    
    public testINSS() {
    }
    
    @Test
    public void testINSS(){
        float salario = 1500;
        float retornoINSS = 120;
        Salario sal = new Salario(salario);
        assertEquals(retornoINSS, sal.simulador1(), 2);
    }
    
    @Test
    public void testIRRF(){
        float salario = 2000;
        float retornoIRRF = 150;
        Salario sal = new Salario(salario);
        assertEquals(retornoIRRF, sal.simulador2(), 2);
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
