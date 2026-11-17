package poly.basic;

public class CastingMain1 {

    static void main() {

        Parent poly = new Child();

        //DownCasting

        Child child = (Child) poly;
        child.childMethod();
    }
}
