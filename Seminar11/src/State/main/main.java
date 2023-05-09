package State.main;

import State.clase.Bancomat;

public class main {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(1000);
        bancomat.introducerePin();
        bancomat.retragereCard();
        bancomat.introducerePin();
        bancomat.retrageBani(200);
        bancomat.introduceCard();
    }
}
