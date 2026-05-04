package scope;

public class scope2 {
    static void main() {
        int m = 10;
        for(int i = 0; i < 2; i ++){
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);

        }

        System.out.println("main i = 접근안됨.");
        System.out.println("main m = " + m);

    }
}
