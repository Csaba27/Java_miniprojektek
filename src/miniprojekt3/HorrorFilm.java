package miniprojekt3;

public class HorrorFilm extends Film implements IKorhataros {
    private int korh = 0;

    public HorrorFilm(String cim, int ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    @Override
    public int Korhatar() {
        return korh;
    }

    @Override
    public int Buntetes(int kor) {
        int korhatarKulonbseg = kor - korh;
        if (korhatarKulonbseg < 0) {
            return Math.abs(korhatarKulonbseg) * ar;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Film cime:" + cim + ", Film ára: " + ar + ", korhatár: " + korh;
    }
}
