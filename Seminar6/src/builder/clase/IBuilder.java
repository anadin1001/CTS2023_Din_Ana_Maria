package builder.clase;

public interface IBuilder {
    public Pacient build();
    public IBuilder setNume(String nume);

    public IBuilder setPatRabatabil(boolean patRabatabil);

    public IBuilder setMicDejun(boolean micDejun);

    public IBuilder setPapuci(boolean papuci);

    public IBuilder setHalat(boolean halat);
}
