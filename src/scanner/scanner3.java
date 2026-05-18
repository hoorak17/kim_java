package scanner;

import java.util.Scanner;

public class scanner3 {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("두 수를 입력하시오 :");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        if (int1 == int2){
            System.out.println("두수가 동일한 값"+ int1);

        }else if(int1>int2) {
            System.out.println("int1이 더 큼");

        }else{
            System.out.println("int2가 더 큼");
        }

    }
}
