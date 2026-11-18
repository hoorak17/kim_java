package poly.ex3;

public class Caw extends AbstractAnimal {

    private String kiung;

    @Override
    public void sound() {
        System.out.println("sososo");
    }

    @Override
    public void move() {
        System.out.println(kiung);
    }
}
