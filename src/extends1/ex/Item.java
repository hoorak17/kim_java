package extends1.ex;

public class Item {
    int price;
    String name;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;

    }

    public void print(){
        System.out.println("Item " + name + " ,price is " + price);
    }


}
