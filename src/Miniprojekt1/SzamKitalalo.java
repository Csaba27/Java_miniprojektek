package Miniprojekt1;

import java.util.Scanner;

public class SzamKitalalo {
    public SzamKitalalo() {
        int num, num_guess;
        int n = 0;
        num = 1 + (int) (100 * Math.random());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gondoltam egy számra 1 és 100 között, találd ki: ");
        while (true) {
            num_guess = scanner.nextInt();
            if (num_guess <= 100 && num_guess > 0) {
                if (num < num_guess) {
                    System.out.println("sok – a szám kisebb");
                } else if (num > num_guess) {
                    System.out.println("kevés – a szám nagyobb");
                } else {
                    System.out.println("eltaláltad " + n + " lépés után");
                    break;
                }
                n++;
            } else {
                System.out.println("A szám amit megadtál nincs 1-100 között!");
            }
        }
    }
}
