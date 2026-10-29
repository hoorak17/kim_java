package method;

import java.util.Scanner;

public class Methodex1 {
    static void main() {
        System.out.print("나이를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);


        int age = sc.nextInt();
        boolean Major = testMajor(age);
        if ( Major == true) {
            System.out.println("입장하세요");
        }else {
            System.out.println("미성년자는 출입이 제한됩니다.");
        }



        return;

    }

    public static boolean testMajor(int i){
        if (i < 18) {
            System.out.println("미성년자입니다.");
            return false;
        }
        System.out.println("성인입니다.");
        return true;


    }
}

