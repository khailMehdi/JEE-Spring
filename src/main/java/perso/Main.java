package perso;

import idao.DoaImpl;
import idao.DoalmplV2;
import idao.IDoa;
import metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        // Version base donne
        IDoa idoe=new DoaImpl();
        MetierImpl metier=new MetierImpl(idoe);
        metier.setiDoa(idoe);
        System.out.println("Res :"+metier.getCalcule());
        // Version Web service:
        IDoa d=new DoalmplV2();
        MetierImpl metier1 =new MetierImpl(d);
        System.out.println(metier1.getCalcule());


    }
}
