package builder.clase;

public class BuilderPacient implements IBuilder {
    Pacient pacient;
    @Override
    public Pacient build() {
        return pacient;
    }

    public BuilderPacient() {
        this.pacient = new Pacient("Costel", false, false, false, false);
    }

    public BuilderPacient setNume(String nume) {
        pacient.setNume(nume);
        return this;
    }

    public BuilderPacient setPatRabatabil(boolean patRabatabil) {
        pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public BuilderPacient setMicDejun(boolean micDejun) {
        pacient.setMicDejun(micDejun);
        return this;
    }

    public BuilderPacient setPapuci(boolean papuci) {
        pacient.setPapuci(papuci);
        return this;
    }

    public BuilderPacient setHalat(boolean halat) {
        pacient.setHalat(halat);
        return this;
    }
}
