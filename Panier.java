import java.util.ArrayList;

public class Panier{
    
    private ArrayList<Orange> Oranges;
    private Integer Contenance;

    public Panier(int _cont){
        this.Oranges = new ArrayList<Orange>();
        this.Contenance = _cont;
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
    }

    public void retire(Orange o){
        if(this.Oranges.contains(o)){
            this.Oranges.remove(o);
        }
    }

    public float getPrix(){
        float res = 0;
        for (Orange o : this.Oranges){
            res+=o.getPrix();
        }
        return res;
    }


    public static void main(String[] args){
        Orange or1 = new Orange(25.0f, "Maroc");
        Orange or2 = new Orange(-1.5f, "Espagne");

        Panier p = new Panier(2);
        p.ajoute(or1);
        p.ajoute(or2);

        System.out.println(p.getPrix());
    }

    
}