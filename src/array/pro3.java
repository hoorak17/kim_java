package array;

import java.util.Scanner;

public class pro3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter numbers : ");

        for(int i = 0 ; i < 5; i++){
            numbers[i] = scanner.nextInt();
        }

        for(int i = 4; i >= 0 ; i --){
            System.out.println(numbers[i]);

        }

    }
}
