package scope;

public class scope {
    static void main() {
        int m = 10;
        if(true) {
            int x = 10;
            System.out.println("if m = "+ m );
            System.out.println("if x = "+ x);
        }
        System.out.println("main m ="+ m);

    }
}
