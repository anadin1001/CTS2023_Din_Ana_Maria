package State.clase;

public class StareNuAreBani implements IStare{
    @Override
    public void modificaStare(Bancomat bancomat) {
        if(bancomat.getStare() instanceof StareArePinIntrodus){
            bancomat.setStare(this);
            System.out.println(" Nu are bani");
        }
    }
}
