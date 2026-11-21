package poly.car1;

public class K3Car implements car{


    @Override
    public void startEngine() {
        System.out.println("K3car .startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("K3car .offEngine");

    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3car .pressAccelerator");
    }
}


