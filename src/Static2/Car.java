package Static2;

public class Car {

    private String model;
    private static int count = 0;

    public Car(String model) {

        System.out.println("차량 구입, 이름 : " + model);
        this.model = model;
        count++;

    }


    public static void ShowTotalCars(){
        System.out.println("구매한 차량 수 : "+ count);
    }
}
