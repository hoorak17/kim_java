package operator;

import java.sql.SQLOutput;

public class oper2 {

    static void main(String[] args) {

        String res1 = "hello"+ "world";
        System.out.println(res1);

        String s1 = "String1";
        String s2 = "String2";
        String res2 = s1 + s2;
        System.out.println(res2);

        String res3 = "a + b = " + 10;//정수를 문자로 더해준다.
        System.out.println(res3);

        int num = 10;
        String str = "a + b = ";
        String res4 = str + num;//문자열에 더하면 정수가 문자열이 된다.
        System.out.println(res4);

    }
}
