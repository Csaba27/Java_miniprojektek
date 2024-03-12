package miniprojekt2;

import java.util.Scanner;

public class Fel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word.replace('a', '*'));
    }
}
