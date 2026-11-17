package poly.basic;

//upcasting VS downcasting
public class CastingMain3 {

    static void main() {


        Child child = new Child();
        Parent parent1 = (Parent) child;
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();


    }
}
