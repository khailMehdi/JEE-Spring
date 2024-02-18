package metier;

import idao.IDoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
@Autowired
    private IDoa iDoa;

    public MetierImpl(IDoa iDoa) {
        this.iDoa = iDoa;
    }

    @Override
    public double getCalcule() {
        double data=(iDoa.getData())*10;
        return data;
    }

    public void setiDoa(IDoa iDoa) {
        this.iDoa = iDoa;
    }
}
