package state.model;

public class Autobuz {

    private  IStare stare;
    private String numarInmatriculare;

    public Autobuz(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
        this.stare = new stareLaCapatDeLinie();
    }

    public IStare getStare() {
        return stare;
    }

    public void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    protected void setStare(IStare stare) {
        this.stare = stare;
    }

    public void pleacaInCursa() {
        IStare stare = new StareInCursa();
        stare.schimbareStare(this);
    }

    public void pleacaInService() {
        IStare stare = new StareLaReparat();
        stare.schimbareStare(this);
    }

    public void ajungeLaCapatDeLinie() {
        IStare stare = new stareLaCapatDeLinie();
        stare.schimbareStare(this);
    }
}