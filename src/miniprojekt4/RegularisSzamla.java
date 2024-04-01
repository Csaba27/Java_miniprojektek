package miniprojekt4;

import java.util.ArrayList;
import java.util.List;

public class RegularisSzamla implements BankSzamla {
    protected double egyenleg;
    protected String tulNev;
    protected int szamlaSzam;
    private static int kovSzamlaSzam = 1;
    protected List<Tranzakcio> tranzakciok;

    public RegularisSzamla(String tulNev) {
        this.egyenleg = 0;
        this.tulNev = tulNev;
        ujSzamlaSzam();
        tranzakciok = new ArrayList<>();
    }

    private void ujSzamlaSzam() {
        this.szamlaSzam = kovSzamlaSzam++;
    }

    @Override
    public double getEgyenleg() {
        return egyenleg;
    }

    @Override
    public void betesz(double osszeg) {
        egyenleg += osszeg;
        tranzakciok.add(new Tranzakcio(Tranzakcio.TranzakcioTipus.DEPOSIT, osszeg));
    }

    @Override
    public void kivesz(double osszeg) {
        if (egyenleg - osszeg >= 0) {
            this.egyenleg -= osszeg;
            tranzakciok.add(new Tranzakcio(Tranzakcio.TranzakcioTipus.WITHDRAW, osszeg));
        } else {
            System.out.println("Az egyenleg túl alacsony a tranzakció elvégzéséhez!");
        }
    }

    @Override
    public String toString() {
        return "RegularisSzamla{" +
                "egyenleg=" + egyenleg +
                ", tulNev='" + tulNev + '\'' +
                ", szamlaSzam=" + szamlaSzam +
                ", tranzakciok=" + tranzakciok +
                '}';
    }
}
