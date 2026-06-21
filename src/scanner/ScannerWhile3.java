package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    static void main() {
        Scanner scanner =new Scanner(System.in);
        int sum = 0 ;
        System.out.println("0을 입력시 종료됨");
        while(true){
            System.out.println("정수를 입력하시오:");
            int i =  scanner.nextInt();
            sum += i;
            if(i==0){
                break;
            }
        }
        System.out.println("모든 정수의 합 :" + sum);
    }
}
