package Template.main;

import Template.clase.Bancomat;
import Template.clase.BancomatAbstract;

public class main {
    public static void main(String[] args) {
        BancomatAbstract bancomatAbstract = new Bancomat("Adresa");
        bancomatAbstract.scoateBaniDeLaBancomat(400);
    }
}
