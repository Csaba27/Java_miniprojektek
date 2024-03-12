package miniprojekt2;

public class Fel9 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                System.out.print(String.valueOf(i == j ? j : "0") + " ");
            }
            System.out.println();
        }
    }
}