package Miniprojekt2;

import java.util.Scanner;

public class Fel4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuffer sb = new StringBuffer(word);

        for (int i = 0; i < sb.length() - 1; ++i) {
            int count = 1;

            for (int j = i + 1; j < sb.length() && sb.charAt(i) == sb.charAt(j); ++count) {
                sb.deleteCharAt(j);
            }

            sb.insert(i + 1, count);
            i += String.valueOf(count).length();
        }

        System.out.println(sb.toString());
    }
}