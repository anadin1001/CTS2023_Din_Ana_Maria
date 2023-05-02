package decorator.clase;

public class Bilet implements IaBilet{
    public String numeCumparator;
    public String numeEchipa1;
    public String numeEchipa2;


    public Bilet(String numeCumparator, String numeEchipa1, String numeEchipa2) {
        this.numeCumparator = numeCumparator;
        this.numeEchipa1 = numeEchipa1;
        this.numeEchipa2 = numeEchipa2;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "numeCumparator='" + numeCumparator + '\'' +
                ", numeEchipa1='" + numeEchipa1 + '\'' +
                ", numeEchipa2='" + numeEchipa2 + '\'' +
                '}';
    }

    @Override
    public void printareBilet() {
        System.out.println(this.toString());

    }

    public String getNumeCumparator() {
        return numeCumparator;
    }

    public String getNumeEchipa1() {
        return numeEchipa1;
    }

    public String getNumeEchipa2() {
        return numeEchipa2;
    }
}
