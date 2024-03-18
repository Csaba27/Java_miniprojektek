package miniprojekt3;

public class Film {
    protected String cim;
    protected int ar;
    protected int[] velemenyek;

    {
        velemenyek = new int[20];
        for (int i = 0; i < velemenyek.length; i++) {
            velemenyek[i] = -1;
        }
    }

    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
    }

    public String getCim() {
        return cim;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void Velemenyezes(int velemeny) {
        if (velemeny >= 1 && velemeny <= 5) {
            velemenyek[velemenyekSzama()] = velemeny;
        }
    }

    public int velemenyekSzama() {
        int num = 0;
        for (int i : velemenyek) {
            if (i == -1) {
                break;
            } else {
                num++;
            }
        }
        return num;
    }

    public double Atlag() {
        if (velemenyekSzama() > 0) {
            int osszeg = 0;
            for (int velemeny : velemenyek) {
                osszeg += velemeny;
            }
            return (double) osszeg / velemenyekSzama();
        }
        System.out.println("Ez a film még nem kapott véleményt!");
        return 0.0;
    }

    @Override
    public String toString() {
        return "Film cime:" + cim + ", Film ára: " + ar;
    }
}