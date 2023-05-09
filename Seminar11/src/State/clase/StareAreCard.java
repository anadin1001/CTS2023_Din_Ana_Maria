package State.clase;

public class StareAreCard implements IStare{
    @Override
    public void modificaStare(Bancomat bancomat) {
        if(bancomat.getStare() instanceof StareNuAreCard){
            bancomat.setStare(this);
            System.out.println("A fost  introdus un card in bancomat");
        }else{
            System.out.println("Bancomtul are deja un card");
        }
    }
}
