package decorator.main;

import decorator.clase.Bilet;
import decorator.clase.BiletDecorat;
import decorator.clase.Decorator;
import decorator.clase.IaBilet;

public class main {
    public static void main(String[] args) {
        IaBilet bilet = new Bilet("Silviu", "Romania", "Spania");
        IaBilet bilet2 = new Bilet("Silviu", "Romania", "Germania");
        IaBilet bilet3 = new Bilet("Silviu", "Franta", "Anglia");

        bilet.printareBilet();
        bilet2.printareBilet();
        bilet3.printareBilet();

        Decorator decoratorBilet = new BiletDecorat(bilet);
        Decorator decorareBilet2 = new BiletDecorat(bilet2);

        decoratorBilet.printareBilet();
        decorareBilet2.printareBilet();
    }
}
