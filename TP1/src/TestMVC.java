
import java.util.ArrayList;

class TestMVC{

    public static void main(String[] args){
        ArrayList<VueGraphique> lst = new ArrayList<VueGraphique>();
        Controleur c = new Controleur();
        
        for(int i=0;i<1000;i++){
            VueGraphique j = new VueGraphique();
            j.ajoutControleur(c);
        }
        
        
        
    }


}

