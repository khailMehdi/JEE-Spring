package idao;

import org.springframework.stereotype.Component;
@Component("dae")
public class DoaImpl implements IDoa {

    public DoaImpl() {
    }

    @Override
    public double getData() {
        System.out.println("Version data base");
        double res=34;
        return res ;
    }
}
