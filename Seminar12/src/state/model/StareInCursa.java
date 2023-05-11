package state.model;

public class StareInCursa implements IStare{
    @Override
    public void schimbareStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof stareLaCapatDeLinie) {
            System.out.println("Autobuzul " + autobuz.getNumarInmatriculare() + " a plecat intr-o noua cursa.");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul " + autobuz.getNumarInmatriculare() + " nu poate pleca intr-o noua cursa.");
        }
    }
}