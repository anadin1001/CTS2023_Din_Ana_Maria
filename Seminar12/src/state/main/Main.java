package state.main;

import state.model.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("PH22DBC");

        autobuz.pleacaInService();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.pleacaInCursa();
        autobuz.ajungeLaCapatDeLinie();
    }
}