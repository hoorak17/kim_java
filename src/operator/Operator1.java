package operator;

public class Operator1 {

    static void main() {

        int a = 5;
        int b =2;

        int sum = a + b;
        System.out.println("a + b =" + sum);

        int diff = a - b;
        System.out.println("a - b =" + diff);

        int multiply = a * b;
        System.out.println("a * b =" + multiply);

        int div =  a / b;
        System.out.println("a / b =" + div);

        int mod = a % b;
        System.out.println("a % b =" + mod);

        //int z =  0으로 나누면 안됨.
    }
}
