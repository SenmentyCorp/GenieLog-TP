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
public class PanierTest {
    
    private Panier p_plein3, p_vide3, p_presque_plein3, p_vide0, p_videm2, p_1el3, p_plein3o;
    private Orange mock_o1, mock_o2, mock_o3, o1, o2, o3;
    
    public PanierTest() {
        
    }
    
    @Before
    public void setUp() {
        p_vide3 = new Panier(3);
        mock_o1 = mock(Orange.class);
        mock_o2 = mock(Orange.class);
        mock_o3 = mock(Orange.class);
        
        when(mock_o1.getPrix()).thenReturn(0.5f);
        when(mock_o2.getPrix()).thenReturn(0.4f);
        when(mock_o3.getPrix()).thenReturn(0.6f);
        
        p_vide0 = new Panier(0);
        p_videm2 = new Panier(-2);
        p_1el3 = new Panier(3);
        p_1el3.ajoute(mock_o1);
        
        p_plein3 = new Panier(3);
        p_plein3.ajoute(mock_o1);
        p_plein3.ajoute(mock_o2);
        p_plein3.ajoute(mock_o3);
        
        o1 = new Orange(1.0f, "France");
        o2 = new Orange(0.7f, "Espagne");
        o3 = new Orange(0.6f, "Ouzbekistan");
        
        p_plein3o = new Panier(3);
        p_plein3o.ajoute(o1);
        p_plein3o.ajoute(o2);
        p_plein3o.ajoute(o3);
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testGetPrixPanierVideA3Elements(){
        assertTrue(p_vide3.getPrix()==0);
    }
    
    @Test
    public void testGetPrixPanierPleinA3Elements(){
        assertTrue(p_plein3.getPrix()==(mock_o1.getPrix()+mock_o2.getPrix()+mock_o3.getPrix()));
    }
    
    
    @Test
    public void testAjoutePanierVide() throws PanierPleinException{
        p_vide3.ajoute(mock_o1);
        int taille = p_vide3.getOranges().size();
        assertTrue(taille==1);
    }
}
