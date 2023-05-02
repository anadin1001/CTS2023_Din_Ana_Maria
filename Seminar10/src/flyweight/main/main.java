package flyweight.main;

import flyweight.clase.FabricaSpecator;
import flyweight.clase.PozitieDesenare;

public class main {
    public static void main(String[] args) {
        FabricaSpecator fabrica = new FabricaSpecator();
        PozitieDesenare pozitie1 = new PozitieDesenare(20,10, "Rosu");
        PozitieDesenare pozitie2 = new PozitieDesenare(10,30, "Verde");
        PozitieDesenare pozitie3 = new PozitieDesenare(24,12, "Albastru");

        fabrica.getSpectator(1, 20, 10).deseneazaSpectator(pozitie3);
        fabrica.getSpectator(2, 12, 12).deseneazaSpectator(pozitie1);

    }
}
