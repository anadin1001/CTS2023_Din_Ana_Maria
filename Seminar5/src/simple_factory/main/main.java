package simple_factory.main;

import simple_factory.PersonalSpital;
import simple_factory.SpitalFactory;
import simple_factory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        SpitalFactory factoryPersonal = new SpitalFactory();
        List<PersonalSpital> listaPersonal = new ArrayList<>();
        PersonalSpital brancardier = factoryPersonal.crearePersonal(TipPersonal.ASISTENT, "George");
        PersonalSpital asistent = factoryPersonal.crearePersonal(TipPersonal.MEDIC, "Marius");

        listaPersonal.add(asistent);
        listaPersonal.add(brancardier);

        listaPersonal.add(factoryPersonal.crearePersonal(TipPersonal.MEDIC, "Matei"));
        listaPersonal.add(factoryPersonal.creareObject(TipPersonal.ANESTEZIST, "Gabi", 18));

        for(PersonalSpital p : listaPersonal){
            p.descriere();
        }


    }
}
