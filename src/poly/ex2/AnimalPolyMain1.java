package poly.ex2;

public class AnimalPolyMain1 {

    static void main() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("Animal.sound test start");
        animal.sound();
        System.out.println("Animal.sound test end");
    }


}
