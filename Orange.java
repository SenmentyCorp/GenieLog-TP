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

    public static void main(String[] args){
        Orange or1 = new Orange(25.0f, "Maroc");
        Orange or2 = new Orange(-1.5f, "Espagne");
    }

}