package builder.clase;

public class BuilderPacientV2 implements IBuilder {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    public BuilderPacientV2() {
        this.nume = "Anonim";
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuci = false;
        this.halat = false;
    }

    @Override
    public Pacient build() {
        return new Pacient(this.nume, this.patRabatabil, this.micDejun, this.papuci, this.halat);
    }

    public IBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public IBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public IBuilder setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public IBuilder setPapuci(boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    public IBuilder setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }
}
