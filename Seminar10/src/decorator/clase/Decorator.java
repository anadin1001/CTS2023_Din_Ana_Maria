package decorator.clase;

public abstract class Decorator implements IaBilet{
    private IaBilet bilet;

    public Decorator(IaBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printareBilet() {
        this.bilet.printareBilet();
        printareMesajSustinere();
    }

    public IaBilet getBilet() {
        return bilet;
    }

    public abstract void printareMesajSustinere();

    @Override
    public String getNumeEchipa1() {
        return bilet.getNumeEchipa1();
    }
}
