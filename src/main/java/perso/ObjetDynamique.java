package perso;

import idao.IDoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ObjetDynamique {
    public static void main(String[] args) {
        try {
            Scanner scanner= new Scanner(new File("Config.txt"));
            String scanner1= scanner.nextLine();

            Class cDoa=Class.forName(scanner1);
            IDoa doa = (IDoa) cDoa.getConstructor().newInstance();
            System.out.println(doa.getData());

        } catch (Exception e ) {
            System.out.println("err " +e.getMessage());
        }
    }
}
