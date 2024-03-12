package miniprojekt1;

import java.util.Scanner;

public class KaveAutomata {

    public KaveAutomata() {
        int ar = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kávé alapára: " + ar + " HUF");
        System.out.println("1. Kávé pohár nélkül: -10 HUF");
        System.out.println("2. Kávé dupla cukorral: +20 HUF");
        System.out.println("3. Kávé habbal: +50 HUF");
        System.out.print("Választott opció: ");

        int valasztas;

        while (true) {
            valasztas = scanner.nextInt();
            if (valasztas == 1) {
                ar -= 10;
                break;
            } else if (valasztas == 2) {
                ar += 20;
                break;
            } else if (valasztas == 3) {
                ar += 50;
                break;
            } else {
                System.out.println("Érvénytelen opció!");
            }
        }

        System.out.println("A kávé ára: " + ar + " HUF");
        System.out.print("Kérem adja meg a fizetett összeget: ");
        int fizetes = scanner.nextInt();

        if (fizetes >= ar) {
            int visszajaro = fizetes - ar;
            System.out.println("Köszönjük a vásárlást!");
            if (visszajaro > 0) {
                System.out.println("Visszajáró: " + visszajaro + " HUF");
            }
        } else {
            System.out.println("A fizetett összeg nem elegendő!");
        }
    }
}