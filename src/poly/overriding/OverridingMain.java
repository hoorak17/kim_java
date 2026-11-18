package poly.overriding;

public class OverridingMain {
    static void main() {

        Child child = new Child();
        System.out.println("Child - > Child");
        System.out.println("value = " + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("Parent - > Parent");
        System.out.println("value = " + parent.value);
        parent.method();



    }



}
