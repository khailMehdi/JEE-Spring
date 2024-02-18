package idao;

public class DoaImpl implements IDoa {

    @Override
    public double getData() {
        System.out.println("Version data base");
        double res=34;
        return res ;
    }
}
