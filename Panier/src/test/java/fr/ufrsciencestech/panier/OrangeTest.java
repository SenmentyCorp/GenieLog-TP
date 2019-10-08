/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author al385305
 */
public class OrangeTest {
    
    private Orange o1, o2, o3;
    
    public OrangeTest() {
        
    }
    
    @Before
    public void setUp() {
        o1 = new Orange(1f, "France");
        o2 = new Orange(1f, "France");
        o3 = new Orange(4f, "Espagne");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void equalsTestTrue(){
        assertTrue(o1.equals(o2));
    }
    
    @Test
    public void equalsTestFalse(){
        assertFalse(o1.equals(o3));
    }

}
