package scanner;

import java.util.Scanner;

public class scanner1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하시어 :");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열 :" + str);

        System.out.print("정수를 입력하시오:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 : " + intValue   );

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);

    }
}
