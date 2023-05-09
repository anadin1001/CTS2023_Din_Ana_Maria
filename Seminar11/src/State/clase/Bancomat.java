package State.clase;

public class Bancomat {
    private IStare stare;
    private Integer baniRamasi;

    public Bancomat(Integer baniRamasi) {
        this.baniRamasi = baniRamasi;
        stare = new StareNuAreCard();
    }

    public IStare getStare() {
        return stare;
    }

    protected void setStare(IStare stare) { // setter protected!!!!!!!!
        this.stare = stare;
    }

    public void introduceCard(){
        IStare stare = new StareAreCard();
        stare.modificaStare(this);
    }

    public void introducerePin(){
        IStare stare = new StareArePinIntrodus();
        stare.modificaStare(this);
    }

    public void retrageBani(Integer suma){
        if(stare instanceof StareArePinIntrodus){
            System.out.println("A fost retrasa suma de: "+ suma);
            if(baniRamasi>= suma){
                this.baniRamasi -= suma;
                if(baniRamasi==0){
                    IStare stare2 = new StareNuAreBani();
                    stare2.modificaStare(this);
                }
            }
        }
    }

    public void retragereCard(){
        IStare stare = new StareNuAreCard();
        stare.modificaStare(this);

    }
}
