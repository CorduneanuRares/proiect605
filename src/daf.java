public class daf
{
    private int caiputere;
    private String marimecabina;
    private int cantiate;

    public daf(int capacitatemotor,String marimecabina,int cantiate)
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

    public static daf[] Getdaf(){
        daf x64 = new daf (645,"medie", 2019);
        daf x78 = new daf (780,"mare", 2021);
        daf x150 = new daf (1500,"mare", 2022);
        daf[] dafinmagazin = {x64,x78,x150};
        return dafinmagazin;
    }


}