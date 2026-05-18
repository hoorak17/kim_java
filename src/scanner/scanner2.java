package scanner;

import java.util.Scanner;

public class scanner2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번쨰 숫자를 입력하세요 :");
        int num1 = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        int sum =  num1 + num2;
        System.out.println("합 : " + sum);

    }
}
