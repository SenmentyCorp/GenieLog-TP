package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<VueGraphique> lst = new ArrayList<VueGraphique>();
        Controleur c = new Controleur();
        
        for(int i=0;i<2;i++){
            VueGraphique j = new VueGraphique();
            j.ajoutControleur(c);
        }
    }
}
