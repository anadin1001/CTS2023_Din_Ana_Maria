package strategy.main;

import strategy.model.Calator;
import strategy.model.PlataCardBancar;
import strategy.model.PlataCardCalatorii;
import strategy.model.PlataSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Bia");

        calator.platesteBilet(10);
        calator.setMetodaPlata(new PlataSMS());

        calator.platesteBilet(25);
        calator.setMetodaPlata(new PlataCardBancar());

        calator.platesteBilet(30);
        calator.setMetodaPlata(new PlataCardCalatorii());
        calator.platesteBilet(11);
    }
}