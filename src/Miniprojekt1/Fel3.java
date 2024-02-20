package Miniprojekt1;

import java.util.Scanner;

public class Fel3 {
    public static void main(String[] args) {
        double number1, number2, result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        number2 = scanner.nextDouble();

        while (true) {
            System.out.print("Enter 1 for addition\n" +
                    "Enter 2 for subtraction\n" +
                    "Enter 3 for multiplication\n" +
                    "Enter 4 for division\n" +
                    "Enter 5 to Exit\n");
            int option = scanner.nextInt();
            result = 0;
            if (option == 5) {
                break;
            } else if (option == 4) {
                result = number2 != 0 ? (float) number1 / number2 : 0;
            } else if (option == 3) {
                result = number1 * number2;
            } else if (option == 2) {
                result = number1 - number2;
            } else if (option == 1) {
                result = number1 + number2;
            } else {
                System.out.println("Invalid option!");
            }

            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
