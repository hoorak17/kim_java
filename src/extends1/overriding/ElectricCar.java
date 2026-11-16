package extends1.overriding;

public class ElectricCar extends Car {

    @Override
    public void move(){
        System.out.println("ElectricCar moves fast");
    }

    public void charge(){
        System.out.println("Car charges");
    }




}
