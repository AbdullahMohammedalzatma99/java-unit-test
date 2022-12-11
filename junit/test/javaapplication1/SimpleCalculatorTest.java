/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abdullah Mohammed
 */
public class SimpleCalculatorTest {
    SimpleCalculator simpleCal;
    public SimpleCalculatorTest() {
    }
    
    @Before
    public void setUp() {
        simpleCal = new SimpleCalculator();
    }
    
    @After
    public void tearDown() {
        simpleCal = null;
    }

    @Test
    public void testAdd() {
        int a =20,b=20,c;
        c= simpleCal.add(a, b);
        assertEquals(40, c);
      
    }
     @Test
    public void testdividWithExeption() {
        int a =20,b=20,c;
        c= simpleCal.divid(a, b);
//        assertEquals(40, c);
assertThrows(Exception.class,()->{simpleCal.divid(4, 0)});
      
    }
    
}

