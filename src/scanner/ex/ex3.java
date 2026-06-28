package scanner.ex;

import java.util.Scanner;

public class ex3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("이름을 입력하세요 (종료를 입력하면 종료):");
            String name = scanner.nextLine();
            if("종료".equals(name)) {
                break;
            }
            System.out.println("나이를 입력하세요");
            int age = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기
            System.out.println("입력한 이름:" + name + ", 나이 : "+ age);

        }
    }
}