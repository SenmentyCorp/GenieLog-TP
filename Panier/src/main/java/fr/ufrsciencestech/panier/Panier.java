package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import java.util.Observable;


public class Panier extends Observable{
    
    private ArrayList<Orange> Oranges;
    private Integer Contenance;

    public Panier(int _cont){
        this.Oranges = new ArrayList<Orange>();
        this.Contenance = _cont;
    }

    public int getTaille(){
        return this.Oranges.size();
    }

    public ArrayList<Orange> getOranges() {
        return this.Oranges;
    }

    public void setOranges(ArrayList<Orange> oranges) {
        this.Oranges = oranges;
    }

    public Integer getContenance() {
        return this.Contenance;
    }

    public void setContenance(Integer contenance) {
        this.Contenance = contenance;
    }

    public boolean estPlein(){
        return this.Oranges.size() == this.Contenance;
    } 

    public boolean estVide(){
        return this.Oranges.size() == 0;
    }

    public void ajoute(){
        Orange o = new Orange(1, "Kazhakstan");

        if(!this.estPlein()){
            this.Oranges.add(o);
        }else{
            System.out.println("Panier plein");
        }
        
        setChanged();
        notifyObservers();
    }

    public void ajoute(Orange o){
        if(o != null){
            if(!this.estPlein()){
                this.Oranges.add(o);
            }else{
                System.out.println("Panier plein");
            }
        }else{
            System.out.println("Orange nulle");
        }
        
        setChanged();
        notifyObservers();
    }

    public void retire(){
        if(!this.Oranges.isEmpty()){
            this.Oranges.remove(0);
            setChanged();
            notifyObservers();
        }
            
    }

    public float getPrix(){
        float res = 0;
        for (Orange o : this.Oranges){
            res+=o.getPrix();
        }
        return res;
    }
    
}