package poly.ex2;

public class AnimalPloyMain3 {

    static void main() {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};


        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("animal sound test start");
        animal.sound();
        System.out.println("animal sound test end");
    }

}
