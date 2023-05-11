package command.model;

public class ComandaPlecareInCursa implements ICommand {

    private int numarLinie;
    private Automobil automobil;

    public ComandaPlecareInCursa(int numarLinie, Automobil automobil) {
        this.numarLinie = numarLinie;
        this.automobil = automobil;
    }

    @Override
    public void execute() {
        automobil.plecareInCursa(this.numarLinie);
    }
}
