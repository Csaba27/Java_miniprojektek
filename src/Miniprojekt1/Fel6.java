package Miniprojekt1;

public class Fel6 {
    public static boolean tombOsszeHasonlit(int[] tomb1, int[] tomb2) {
        if (tomb1.length != tomb2.length)
            return false;

        for (int i = 0; i < tomb1.length; i++) {
            if (tomb1[i] != tomb2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] a2 = {1, 2, 3, 4, 5, 6, 7, 8};
        if (tombOsszeHasonlit(a1, a2)) {
            System.out.println("A egész típusú tömb egyenlő");
        } else {
            System.out.println("A egész típusú nem tömb egyenlő!");
        }
    }
}
