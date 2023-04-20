package builder.main;

import builder.clase.BuilderPacient;
import builder.clase.BuilderPacientV2;
import builder.clase.IBuilder;
import builder.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient;
        BuilderPacient builderPacient = new BuilderPacient();
        Pacient pacient1;
        Pacient pacient2;
        pacient1 = builderPacient.setNume("Mihai").setHalat(true).setMicDejun(true).build();
        pacient2 = builderPacient.setNume("Dragos").setHalat(true).setMicDejun(true).setPapuci(true).build();
        System.out.println(pacient1);
        System.out.println(pacient2);

        IBuilder builderPacient2 = new BuilderPacientV2();
        Pacient pacient3 = builderPacient2.setNume("Gigi").setHalat(true).build();
        Pacient pacient4 = builderPacient2.setNume("Vlad").build();
        System.out.println(pacient3);
        System.out.println(pacient4);
    }
}
