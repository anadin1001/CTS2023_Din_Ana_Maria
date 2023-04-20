package simple_factory;

public class SpitalFactory {
    public PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume) throws Exception {
        switch (tipPersonal){
            case MEDIC:
                return new Medic(nume);
            case ASISTENT:
                return new Asistent(nume);
            case BRANCARDIER:
                return new Bracardier(nume);
            default: throw new Exception("Pachet gresit");
        }
    }

    public PersonalSpital creareObject(TipPersonal tipPersonal, String nume, int nrPacienti){
        switch (tipPersonal){
            case ANESTEZIST:
                return new Anestezist(nume, nrPacienti);
            default:
                return null;
        }
    }
}
