package Observer.main;

import Observer.clase.Banca;
import Observer.clase.Client;
import Observer.clase.IClient;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca("BCR");
        IClient client = new Client("Ana");
        IClient client2 = new Client("Andrei");
        IClient client3 = new Client("Maria");
        banca.actualizeazaAplicatia();
        banca.adaugaObserver(client);
        banca.actualizeazaAplicatia();
        banca.adaugaObserver(client2);
        banca.stergereObserver(client);


    }
}