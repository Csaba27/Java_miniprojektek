package Miniprojekt1;

import java.util.Scanner;

public class Fel5 {
    public static void main(String[] args) {
        boolean contain = true;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                contain = true;
            } else if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                contain = true;
            } else {
                contain = false;
                break;
            }
        }
        if (contain) {
            System.out.println("A string csak alfabetikus karaktereket tartalmaz!");
        } else {
            System.out.println("A string nem csak alfabetikus karaktereket tartalmaz!");
        }
    }
}
