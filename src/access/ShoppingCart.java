package access;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count = 0;

    public void addItem(Item item) {
        if (count < items.length) {
            items[count] = item;
            count++;

        }else{
            System.out.println(" Cart is full");
        }
    }

    public void displayItems() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.price());
            sum += item.price();
        }
        System.out.println("Total price is " + sum);
    }


}
