package poly.ex2;

public class AnimalPloyMain2 {

    static void main() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        Animal[]  animalArr = {dog,cat,caw,duck};


        for(Animal animal : animalArr){

            animal.sound();
        }

    }

}
