package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {

        Driver driver = new Driver();

        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        Model3car model3car = new Model3car();
        driver.setCar(model3car);
        driver.drive();

        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();


    }
}
