package miniprojekt5;

import java.util.ArrayList;

public class Hallgato {
    public static int kovID = 0;
    private final int ID;
    private final String vezeteknev;
    private final String keresztnev;

    private ArrayList<Jegy> jegyek = new ArrayList<>();

    public Hallgato(String vezeteknev, String keresztnev) {
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.ID = kovID++;
    }

    public int getID() {
        return ID;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public ArrayList<String> getTantargyak() {
        ArrayList<String> targyak = new ArrayList<>();
        for (Jegy jegy : jegyek) {
            if (!targyak.contains(jegy.getTantargy())) {
                targyak.add(jegy.getTantargy());
            }
        }

        return targyak;
    }

    public void ujBejegyzes(Jegy jegy) {
        jegyek.add(jegy);
    }

    public double tantargyAtlag(String tantargy) {
        int sum = 0;
        int num = 0;
        for (Jegy jegy : jegyek) {
            if (jegy.getTantargy().equals(tantargy)) {
                ++num;
                sum += jegy.getJegy();
            }
        }

        return num > 0 ? (double) sum / num : 0;
    }

    public void listazas() {
        System.out.println(this.vezeteknev + " " + this.keresztnev);
        for (String targy : getTantargyak()) {
            System.out.println("\t" + targy + ": " + tantargyAtlag(targy));
        }
        System.out.println();
    }
}
