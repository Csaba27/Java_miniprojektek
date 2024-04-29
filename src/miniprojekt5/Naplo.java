package miniprojekt5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Naplo {
    ArrayList<Hallgato> hallgatok = new ArrayList<>();

    public Naplo(String fajl) {
        Path path = Path.of(fajl);
        try {
            String s = Files.readString(path.toAbsolutePath());
            String[] sorok = s.split("\n");
            for (String line : sorok) {
                String[] darabol = line.split(",");
                String vezeteknvev = darabol[0];
                String keresztnev = darabol[1];
                hallgatok.add(new Hallgato(vezeteknvev, keresztnev));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void listazNevek() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println(hallgato.getVezeteknev() + " " + hallgato.getKeresztnev());
        }
    }

    public void ujJegy(int ID, Jegy jegy) {
        for (Hallgato hallgato : hallgatok) {
            if (hallgato.getID() == ID) {
                hallgato.ujBejegyzes(jegy);
            }
        }
    }

    public void listazHallgatoiAdatok() {
        for (Hallgato hallgato : hallgatok) {
            hallgato.listazas();
        }
    }
}
