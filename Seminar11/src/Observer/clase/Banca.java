package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IBanca{
    private List<IClient> observatori ;
    private String numeBanca;

    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
        this.observatori = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IClient client) {
        this.observatori.add((client));
    }

    @Override
    public void stergereObserver(IClient client) {
this.observatori.remove(client);
    }

    @Override
    public void notifica(String mesaj) {
for(IClient observator: observatori){
    observator.afiseazaMesaj(mesaj);
}
    }

    public void adaugaTipCreditNou(){
        notifica(numeBanca+ "Am adaugat un nou tip de credit");
    }

    public void actualizeazaAplicatia(){
        notifica("Aplicatia a fost actualizata!");
    }
}
