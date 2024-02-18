package metier;

import idao.IDoa;

public class MetierImpl implements IMetier{
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
