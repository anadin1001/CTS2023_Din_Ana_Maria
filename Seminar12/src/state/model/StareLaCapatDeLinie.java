package state.model;

public class StareLaCapatDeLinie implements IStare{
    @Override
    public void schimbareStare(Autobuz autobuz) {
        if(!(autobuz.getStare() instanceof stareLaCapatDeLinie)) {
            System.out.println("Autobuzul " + autobuz.getNumarInmatriculare() + " a ajuns la capat de linie.");
            autobuz.setStare(this);
        }
        else {
            System.out.println("Autobuzul " + autobuz.getNumarInmatriculare() + " nu ajunge la capat de linie.");
        }
    }
}