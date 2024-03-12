package miniprojekt2;

public class Fel6 {
    public static void minMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Legkisebb szám: " + min);
        System.out.println("Legnagyobb szám: " + max);
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 55, 7, 11, 99};
        minMax(numbers);
    }
}