package poly.ex5;

public class InterfaceMain {

    static void main() {
        //InterfaceMain interfaceAnimal = new InterfaceMain();

        Cat cat =  new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("Animal sound test Start");
        animal.sound();
        System.out.println("Animal sound test End");

    }

}


