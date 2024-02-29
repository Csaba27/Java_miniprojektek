package Miniprojekt2;

import java.util.Vector;

public class Fel7 {

    public static void searchDuplicates(int[] array) {
        int len = array.length;
        Vector<Integer> c = new Vector<>();

        for (int i = 0; i < len - 1; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (array[i] == array[j] && !c.contains(array[i])) {
                    c.add(array[i]);
                    break;
                }
            }
        }

        System.out.println(c);
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 55, 2, 7, 11, 99, 7, 2, 53, 7};
        searchDuplicates(numbers);
    }
}