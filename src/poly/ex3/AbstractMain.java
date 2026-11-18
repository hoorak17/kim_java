package poly.ex3;

public class AbstractMain {

    static void main() {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        dog.move();
        cat.move();

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("animal sound test start");
        animal.sound();
        System.out.println("animal sound test end");
    }


}
