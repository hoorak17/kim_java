package scanner.ex;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하시오 :");
        int num1 = scanner.nextInt();

        System.out.println("두번째 숫자를 입력하시오 :");
        int num2 = scanner.nextInt();

        if( num1> num2){//작은게 num1로 큰게 num2로 들어가게 정렬.
            int temp = num1;
            num1= num2;
            num2= temp;
        }

        System.out.println("두 숫자 사이의 모든 정수 : ");//출력 양식에 맞춰서 출력
        for( int i = num1; i <= num2; i++){
            System.out.print(i+", ");
        }

    }
}