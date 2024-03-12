package miniprojekt2;

import java.util.Scanner;

public class Fel1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char c1 = word.charAt(0);
        char cl = word.charAt(word.length() - 1);
        System.out.println(c1 + " " + cl);
    }
}
