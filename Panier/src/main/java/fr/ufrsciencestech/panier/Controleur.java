package fr.ufrsciencestech.panier;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controleur implements ActionListener{
    private Panier p = new Panier(1000);

    public Panier getPanier() {
        return p;
    }

    public void setPanier(Panier p) {
        this.p = p;
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(((JButton)e.getSource()).getName().equals("Plus"))
            p.ajoute();
        else
            p.retire();
    }   
}