package poly.basic;

public class CastingMain6 {

    static void main() {

        Parent parent1 = new Parent();
        System.out.println("call parent1");
        call(parent1);


        Parent parent2 = new Child();
        System.out.println("call parent2");
        call(parent2);


    }

    private static void call(Parent parent){
        parent.parentMethod();
        if(parent instanceof Child child){
            System.out.println("Child instance rignt");
            child.childMethod();
        }

    }


}
