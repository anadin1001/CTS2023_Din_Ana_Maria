package State.clase;

public class StareArePinIntrodus implements IStare{

    @Override
    public void modificaStare(Bancomat bancomat) {
        if(bancomat.getStare() instanceof StareAreCard){
            bancomat.setStare(this);
            System.out.println("A fost introdus pin-ul");
        }else{
            System.out.println("Pin ul este gresit");
        }
    }
}
