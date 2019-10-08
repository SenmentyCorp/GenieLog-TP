package fr.ufrsciencestech.panier;

public class Orange{

    private float Prix;
    private String Origine;

    public Orange(float _Prix, String _Origine){
        try{
            if(_Prix>=0){
                this.Prix = _Prix;
                this.Origine = _Origine;
            }else{
                this.Prix = -_Prix;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public float getPrix(){
        return this.Prix;
    }

    public String getOrigine(){
        return this.Origine;
    }

    public void setOrigine(String origine) {
        Origine = origine;
    }
    
    @Override
    public boolean equals(Object o){
        if(o.getClass() == Orange.class){
            Orange test = (Orange)(o);
            
            return ((test.getPrix() == this.Prix) && (test.getOrigine() == this.Origine));
        }else{
            return false;
        }
    }
}