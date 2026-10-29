package array;

import java.util.Scanner;

public class pro6 {
    static void main() {

        Scanner scanner =  new Scanner(System.in);

        System.out.println("숫자의 갯수 입력: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for( int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for(int number : numbers){
            if(number < min){
                min = number;
            }
            if(number > max){
                max = number;
            }
        }

        System.out.println("min : " + min + " max : " + max);


    }
}
