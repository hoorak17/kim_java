package array;

import java.util.Scanner;

public class pro2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
