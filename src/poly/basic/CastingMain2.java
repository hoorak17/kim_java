package poly.basic;

public class CastingMain2 {

    static void main() {

        Parent poly = new Child();

        //DownCasting

        Child child = (Child) poly;
        child.childMethod();

        //temp DownCasting
        ((Child) poly).childMethod();

    }
}
