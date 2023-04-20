package simple_factory;

public class Bracardier implements PersonalSpital{
    private String nume;

    public Bracardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Bracardier : " + this.nume);
    }
}
