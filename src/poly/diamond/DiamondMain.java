package poly.diamond;

public class DiamondMain {

    static void main() {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        Child c = new Child();
        c.methodA();
        c.methodB();
        c.methodCommon();



    }
}
