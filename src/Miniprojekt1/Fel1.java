package Miniprojekt1;

import java.util.Scanner;

public class Fel1 {
    public static void main(String[] args) {
        int szam;
        Scanner sc = new Scanner(System.in);
        szam = Integer.parseInt(sc.nextLine());
        if (szam > 0 && szam <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + szam + " = " + (i * szam));
            }
        } else {
            System.out.println("A szám csak 1 és 10 között lehet!");
        }
    }
}
