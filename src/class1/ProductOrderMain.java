package class1;

public class ProductOrderMain {
    static void main() {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder apple = new ProductOrder();
        orders[0] = apple;
        apple.productName = "사과";
        apple.price = 1000;
        apple.quantity = 400;

        ProductOrder orange = new ProductOrder();
        orders[1] = orange;
        orange.productName = "오렌지";
        orange.price = 2000;
        orange.quantity = 300;

        ProductOrder banana = new ProductOrder();
        orders[2] = banana;
        banana.productName = "바나나";
        banana.price = 3000;
        banana.quantity = 400;

        int sum = 0
                ;
        for ( ProductOrder order : orders ) {
            sum+= order.price *  order.quantity;

        }

        System.out.println(" 총 금액 : " +  sum);



    }
}
