package decorator.clase;

public class BiletDecorat extends Decorator{
    public BiletDecorat(IaBilet bilet) {
        super(bilet);
    }

    @Override
    public void printareMesajSustinere() {
        System.out.println("Sustinem echipa: " + super.getBilet().getNumeEchipa1());//biletul e in parinte, declaram gett uril in iaBilet
    }


}
