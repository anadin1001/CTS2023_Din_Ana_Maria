package command.main;

import command.model.Autobuz;
import command.model.Automobil;
import command.model.ComandaPlecareInCursa;
import command.model.ManagerComenzi;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Automobil automobil = new Autobuz(13);
        managerComenzi.invocaComanda(new ComandaPlecareInCursa(10, new Autobuz(1)));
        managerComenzi.invocaComanda(new ComandaPlecareInCursa(11, automobil));
        managerComenzi.invocaComanda(new ComandaPlecareInCursa(12, new Autobuz(3)));
        managerComenzi.invocaComanda(new ComandaPlecareInCursa(11, automobil));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new ComandaPlecareInCursa(12, new Autobuz(23)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();


    }
}