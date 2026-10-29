package array;

import java.util.Scanner;

public class pro5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("숫자의 갯수 입력 : ");

        int n = scanner.nextInt();
        System.out.println("숫자 입력 : ");

        for(int i = 0 ; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        int total = 0;

        for(int number : numbers){
            total = total + number;

        }

        double average = (double)total/n;
        System.out.println("total : " + total + " average : " + average);



    }
}
