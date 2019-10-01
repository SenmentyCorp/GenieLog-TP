import java.awt.event.ActionListener;
import javafx.event.ActionEvent;

public class Controleur implements ActionListener{
    private Panier p;

    public Panier getPanier() {
        return p;
    }

    public void setPanier(Panier p) {
        this.p = p;
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e != null)
            p.ajoute();
        else
            p.retire();
    }

    
}