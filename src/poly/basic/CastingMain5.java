package poly.basic;

public class CastingMain5 {

    static void main() {

        Parent parent1 = new Parent();
        System.out.println("call parent1");
        call(parent1);


        Parent parent2 = new Child();
        System.out.println("call parent2");
        call(parent2);


    }

    private static void call(Parent parent){
        if(parent instanceof Child){
            System.out.println("Child instance rignt");
            ((Child) parent).childMethod();
        }else{
            System.out.println("Parent instance not child");
            parent.parentMethod();
        }

    }


}
