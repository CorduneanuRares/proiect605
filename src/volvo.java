public class volvo
{
    private int caiputere;
    private String marimecabina;
    private int cantiate;
    

    public volvo(int capacitatemotor,String marimecabina,int cantiate)
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


    public static volvo[] volvo(){
        volvo x48 = new volvo (480,"medie", 150);
        volvo x84 = new volvo (840,"mare", 200);
        volvo x94 = new volvo (940,"mare", 122);
        volvo[] volvoinmagazin = {x48,x94,x84};
        return volvoinmagazin;
    }


}