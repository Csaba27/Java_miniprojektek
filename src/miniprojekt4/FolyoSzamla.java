package miniprojekt4;

public class FolyoSzamla extends RegularisSzamla {
    protected int tranzakciokSzama;
    protected final static int INGYENES_TRANZ_SZAMA = 3;
    protected final double TRANZAKCIO_ARA = 2.0;

    FolyoSzamla(String tulNev) {
        super(tulNev);
        this.tranzakciokSzama = 0;
    }

    @Override
    public void betesz(double osszeg) {
        tranzakciokSzama++;
        super.betesz(osszeg);
        levonKoltseg();
    }

    @Override
    public void kivesz(double osszeg) {
        tranzakciokSzama++;
        super.kivesz(osszeg);
    }

    public void levonKoltseg() {
        if (tranzakciokSzama > INGYENES_TRANZ_SZAMA) {
            double levonOsszeg = TRANZAKCIO_ARA * (tranzakciokSzama - INGYENES_TRANZ_SZAMA);
            egyenleg -= levonOsszeg;
            tranzakciokSzama = 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final FolyoSzamla szamla = (FolyoSzamla) obj;

        return this.tulNev.equals(szamla.tulNev)
                && this.szamlaSzam == szamla.szamlaSzam
                && this.tranzakciokSzama == szamla.tranzakciokSzama;
    }
}
