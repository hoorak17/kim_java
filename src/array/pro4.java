package array;

import java.util.Scanner;

public class pro4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter numbers : ");

        for(int i = 0 ; i < 5; i++){
            numbers[i] = scanner.nextInt();
        }

        int total = 0;

        for(int number : numbers){
            total = total + number;

        }

        double average = (double)total/5;
        System.out.println("total : " + total + " average : " + average);



    }
}
