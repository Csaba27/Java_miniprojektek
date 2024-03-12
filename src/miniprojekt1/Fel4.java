package miniprojekt1;

import java.util.Scanner;

public class Fel4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
