package miniprojekt3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Teszter {
    public static void main(String[] args) {
        Vector<Film> filmek = new Vector<>();
        String[] filmekString = {
                "Az Elfeledett Óceán",
                "Szivárvány Hídja",
                "Végzetes Pillanatok",
                "Titkos Kódok Rejtélye",
                "Az Elveszett Kincs Nyomában",
                "A Végső Frontvonal",
        };

        String[] horrorFilmekString = {
                "A Lidérces Sötétség",
                "A Véres Árnyak Háza",
                "A Pokoli Kézjegy",
                "Az Elátkozott Kastély",
                "A Szörnyek Támadása",
                "A Halál Rémhírnöke",
        };

        for (String filmNeve : filmekString) {
            int ar = 1 + (int) (Math.random() * 999);
            Film objFilm = new Film(filmNeve, ar);
            filmek.add(objFilm);
        }

        for (String filmNeve : horrorFilmekString) {
            int ar = 1 + (int) (Math.random() * 999);
            int korhatar = 1 + (int) (Math.random() * 14);
            Film objFilm = new HorrorFilm(filmNeve, ar, korhatar);
            filmek.add(objFilm);
        }

        for (Film film : filmek) {
            System.out.println(film);
        }

        Collections.sort(filmek, Comparator.comparingInt(Film::getAr));

        System.out.println("Rendezett lista az árak szerint:");
        for (Film film : filmek) {
            System.out.println(film);
        }

        Vector<IKorhataros> korhatarosFilmek = new Vector<>();
        for (Film film : filmek) {
            if (film instanceof HorrorFilm) {
                korhatarosFilmek.add((HorrorFilm) film);
            }
        }

        System.out.println("Horrorfilmek:");
        for (IKorhataros film : korhatarosFilmek) {
            System.out.println(film);
        }

        int megadottKor = 8;
        int osszBuntetes = 0;
        for (IKorhataros film : korhatarosFilmek) {
            osszBuntetes += film.Buntetes(megadottKor);
        }

        System.out.println("Összesen fizetendő büntetés a megadott kor alapján: " + osszBuntetes);
    }
}
