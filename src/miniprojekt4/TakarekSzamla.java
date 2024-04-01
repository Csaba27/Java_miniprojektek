package miniprojekt4;

import java.time.LocalDate;

public class TakarekSzamla extends RegularisSzamla {
    protected double kamatRata;
    private LocalDate utolsoKamat;

    public TakarekSzamla(String tulNev, double kamat) {
        super(tulNev);
        setKamatRata(kamat);
        this.utolsoKamat = LocalDate.now();
    }

    // Kamat a hónap végén
    public void kamatSzamolas() {
        LocalDate maiDatum = LocalDate.now();
        if (maiDatum.getMonthValue() != utolsoKamat.getMonthValue()) {
            hozzaadKamat();
            utolsoKamat = maiDatum;
        }
    }

    public void hozzaadKamat() {
        egyenleg += egyenleg * kamatRata / 100;
    }

    public double getKamatRata() {
        return kamatRata;
    }

    public void setKamatRata(double kamatRata) {
        this.kamatRata = kamatRata;
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

        final TakarekSzamla szamla = (TakarekSzamla) obj;

        return this.tulNev.equals(szamla.tulNev)
                && this.szamlaSzam == szamla.szamlaSzam
                && this.kamatRata == szamla.kamatRata;
    }
}
