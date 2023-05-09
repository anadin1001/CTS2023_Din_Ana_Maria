package Template.clase;

public class Bancomat extends BancomatAbstract{

    public Bancomat(String adresa) {
        super(adresa);
    }

    @Override
    protected void introducereCard() {
        System.out.println("A fost introdus cardul" + super.getAdresa());
    }

    @Override
    protected void introducerePin() {
        System.out.println("A fost introduc pinul in bancomat");
    }

    @Override
    protected void specificaSuma(int suma) {
        System.out.println("A fost specificata suma " + suma);
    }

    @Override
    protected void retragereSuma() {
        System.out.println("A fost retrasa suma");
    }

    @Override
    protected void retragereCard() {
        System.out.println("A fost retras cardul ");
    }
}
