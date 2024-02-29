package Miniprojekt2;

import java.util.Scanner;

public class Fel3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuffer sb = new StringBuffer(line);

        for (int i = 0; i < sb.length() - 1; ++i) {
            for (int j = i + 1; j < sb.length(); ++j) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                    --j;
                }
            }
        }

        System.out.println(sb);
    }
}