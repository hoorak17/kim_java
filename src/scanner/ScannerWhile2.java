package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(" 첫번째 숫자를 입력하시오:");
            int i = scanner.nextInt();
            System.out.println(" 두 번째 숫자를 입력하시오");
            int j = scanner.nextInt();
            if(i == 0 && j == 0) {
                break;
            }
            int sum = i + j;
            System.out.println("두 숫자의 합 : " + sum );

        }

    }
}
