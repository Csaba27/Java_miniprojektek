package Miniprojekt2;

import java.util.Arrays;

public class Fel8 {
    public static void sortArrayASC(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; ++i) {
            boolean r = true;

            for (int j = 0; j < n - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    r = false;
                }
            }
            if (r) break;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 55, 2, 7, 11, 99, 7, 2, 53, 7};
        sortArrayASC(numbers);
    }
}