package Prototype.main;

import Prototype.Autobuz;
import Prototype.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz("AG73AMD", 20);
        MijlocTransport autobuz2 = new Autobuz("TL21DIU", 12);
        Autobuz autobuz3 = (Autobuz) autobuz2.clone();
        Autobuz autobuz4 = (Autobuz) autobuz.clone();


    }
}
