public class Distribuitor {
    volvo[] volvodinmagazin=null;
    daf[] dafdinmagazin=null;
    scania[] scaniadinmagazin=null;
    int marca;
    String tara;
    String vopsea;
    public Distribuitor(String tara,String vopsea)
    {
        volvodinmagazin=Getvolvo();
        dafdinmagazin=Getdaf();
        scaniadinmagazin=Getscania();
        this.tara=tara;
        this.vopsea=vopsea;
    }
    public static   volvo[] Getvolvo(){
        volvo x48 = new volvo (480,"medie", 150);
        volvo x84 = new volvo (840,"mare", 200);
        volvo x94 = new volvo (940,"mare", 122);
        volvo[] volvoDinMagazin = {x84,x94, x48};
        return volvoDinMagazin;
    }
    public static   scania[] Getscania(){
        scania x54 = new scania (540,"mica", 234);
        scania x84 = new scania (840,"medie", 445);
        scania x125 = new scania (1250,"mare", 757);
        scania[] scaniaDinMagazin = {x54,x125,x84};
        return scaniaDinMagazin;
    }
    public static   daf[] Getdaf(){
        daf x68 = new daf (645,"medie", 2019);
        daf x74 = new daf (780,"mare", 2021);
        daf x150 = new daf (1500,"mare", 2022);
        daf[] dafDinMagazin = {x68,x74, x150};
        return dafDinMagazin;
    }
}

