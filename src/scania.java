public class scania
{
    private int caiputere;
    private String marimecabina;
    private int cantiate;


    public scania(int capacitatemotor,String marimecabina,int cantiate)
    {
        this.caiputere=caiputere;
        this.marimecabina=marimecabina;
        this.cantiate=cantiate;
    }
    public void setcaiputere (int caiputere) {this.caiputere = caiputere; };
    public void setmarimecabina (String marimecabina) {this.marimecabina = marimecabina; };
    public void setcantiate (int cantiate) {this.cantiate = cantiate; };

    public int getcaiputere () {return this.caiputere; };
    public String getmarimecabina () {return this.marimecabina; };
    public int getcantiate () {return this.cantiate; };

    public static scania[] scania(){
        scania x54 = new scania (540,"mica", 234);
        scania x84 = new scania (840,"medie", 445);
        scania x125 = new scania (1250,"mare", 757);
        scania[] scaniainmagazin = {x54,x84,x125};
        return scaniainmagazin;
    }


}