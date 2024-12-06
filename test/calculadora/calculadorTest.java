/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author USUARIO
 */
public class calculadorTest {
    
    public calculadorTest() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

   

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora.main(args);
        
    }

    
    @Test
    public void test1() {
        
        
        System.out.println("Suma");
        float resultado = 98+2;
        
        
        Calculadora instance = new Calculadora();
        String expResult = "100";
        String result = instance.sincero(resultado);
        assertEquals(expResult, result);
        System.out.println("Esperado:"+resultado+" Obtenido:"+result);
        
    }
    
    
}
