package miniprojekt5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Hallgato hallgato = new Hallgato("Nagy", "Elemer");
        hallgato.ujBejegyzes(new Jegy("Matek", 10));

        hallgato.ujBejegyzes(new Jegy("Matek", 8));
        hallgato.ujBejegyzes(new Jegy("Roman", 7));
        hallgato.ujBejegyzes(new Jegy("Roman", 8));
        hallgato.ujBejegyzes(new Jegy("Magyar", 9));
        hallgato.listazas();

        Naplo naplo = new Naplo("src\\miniprojekt5\\hallgatok.csv");
        naplo.listazNevek();

        File file = new File("src\\miniprojekt5\\jegyek.csv");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] darabol = sor.split(",");
                int id = Integer.parseInt(darabol[0]);
                String targy = darabol[1];
                int jegy = Integer.parseInt(darabol[2]);
                naplo.ujJegy(id, new Jegy(targy, jegy));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        naplo.listazHallgatoiAdatok();
    }
}
