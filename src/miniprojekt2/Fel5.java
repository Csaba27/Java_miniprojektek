package miniprojekt2;

public class Fel5 {
    public static void replaceFirstLastElem(int[] array, int value) {
        int len = array.length;
        if (len > 0) {
            array[0] = value;
            if (len > 1) {
                array[len - 1] = value;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 55, 7, 11, 99};
        replaceFirstLastElem(numbers, 0);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}