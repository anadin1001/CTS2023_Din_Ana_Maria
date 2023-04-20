package Prototype;

public class Autobuz implements MijlocTransport{
    private String nrInmatriculare;
    private Integer nrLocuri;

    public Autobuz(String nrInmatriculare, Integer nrLocuri) {
        if(nrLocuri>10 && nrLocuri<50){
            this.nrLocuri = nrLocuri;
        }
        if(nrInmatriculare.length()==7){
            this.nrInmatriculare = nrInmatriculare;
        }
    }

    public Autobuz() {
    }

    @Override
    public MijlocTransport clone() {
        Autobuz mijlocTransport = new Autobuz();
        mijlocTransport.nrInmatriculare = this.nrInmatriculare;
        mijlocTransport.nrLocuri=this.nrLocuri;
        return mijlocTransport;

    }


}
