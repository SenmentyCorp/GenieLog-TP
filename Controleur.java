import javafx.event.ActionEvent;

public class Controleur implements ActionListener{
    private Panier p;

    public void actionPerformed(ActionEvent e){
        if(e.getSource().getName().equals("Plus"))
            p.ajoute();
        else
            p.retire();
    }

    public Panier getPanier() {
        return p;
    }

    public void setPanier(Panier p) {
        this.p = p;
    }

    
}