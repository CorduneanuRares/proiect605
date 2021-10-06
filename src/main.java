import java.util.Scanner;


public class main
{
    public static int pretCumparareTir=5;
    public static int pretVanzareTir=45000;
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Introducem tara:");
        String tara= sc.next();
        System.out.println("Introducem vopsea:");
        String vopsea= sc.next();
        System.out.println("Introduceti ce marca de tir doriti sa cumparati dintre scania, volvo, daf:");
        String marci= sc.next();
        Distribuitor D=new Distribuitor(vopsea,tara);
        switch (marci) {
            case "volvo":
                System.out.println("ce model de volvo doriti?\n 0-x48\n1-x64\n2-x94");
                int x=sc.nextInt();
                int z=D.volvodinmagazin[x].getcantiate();
                System.out.println("In stock sunt "+ z+" tiruri");
                int m=sc.nextInt();
                System.out.println("Clientul ar dorii sa cumpere "+m+" tiruri,cate doriti sa cumparati");
                if(m<z)
                {
                    z=z-m;


                }
                else
                {
                    if(m==z)
                    {
                        z=z-m;

                    }
                    else
                    {
                        if(m>z)
                        {
                            System.out.println("Nu avem  in stock.\nDoriti cate tiruri avem?\nAvem "+z);
                            String Raspuns=sc.next();
                            m=z;
                            if(Raspuns=="da")
                            {
                                z=z-m;


                            }
                        }
                    }
                }
                break;
            case "scania":
                System.out.println("ce model doriti?\n 0-x54\n1-x84\n2-x125");
                int x1=sc.nextInt();
                int z1=D.scaniadinmagazin[x1].getcantiate();
                System.out.println("In stock sunt "+ z1+" tiruri, cate doriti sa cumparati");
                int m1=sc.nextInt();
                System.out.println("Doresc sa cumpar "+m1+" tiruri");
                if(m1<z1)
                {
                    z1=z1-m1;


                }
                else
                {
                    if(m1==z1)
                    {
                        z1=z1-m1;

                    }
                    else
                    {
                        if(m1>z1)
                        {
                            System.out.println("Nu avem  stock.\nDoriti cate tiruri mai detinem?\nDetinem "+z1);
                            String Raspuns1=sc.next();
                            m1=z1;
                            if(Raspuns1=="da")
                            {
                                z1=z1-m1;


                            }
                        }
                    }
                }
                break;
            case "daf":
                System.out.println("ce model de tir?\n 0-x64\n1-x78\n2-x150");
                int x2=sc.nextInt();
                int z2=D.dafdinmagazin[x2].getcantiate();
                System.out.println("In stock sunt "+ z2+" din modelul dorit, cate tiruri doriti?");
                int m2=sc.nextInt();
                System.out.println("Clientul ar dorii sa cumpere "+m2+" tiruri");
                if(m2<z2)
                {
                    z2=z2-m2;
                }
                else
                {
                    if(m2==z2)
                    {
                        z2=z2-m2;

                    }
                    else
                    {
                        if(m2>z2)
                        {
                            System.out.println("Nu avem  in stock.\nDoriti cate tiruri avem?\nAvem "+z2);
                            String Raspuns2=sc.next();
                            m2=z2;
                            if(Raspuns2=="da")
                            {
                                z2=z2-m2;


                            }
                        }
                    }
                }
                break;


        }
    }
}