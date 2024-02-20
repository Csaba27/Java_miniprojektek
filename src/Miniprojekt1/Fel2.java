package Miniprojekt1;

import java.util.Scanner;

public class Fel2 {
    public static void main(String[] args) {
        int lehetosegek = 3;

        while (lehetosegek > 0) {
            --lehetosegek;
            Scanner scanner = new Scanner(System.in);
            String beolvasott = scanner.nextLine();
            if (beolvasott.equals("jelszo123")) {
                break;
            } else {
                System.out.print("Jelszó nem megfelelő,");
                if (lehetosegek > 0) {
                    System.out.println("még " + lehetosegek + " lehetőséged van!");
                } else {
                    System.out.println("nincs több lehetőséged!");
                }
            }
        }
    }
}
