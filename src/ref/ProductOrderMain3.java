package ref;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //여러상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders= new ProductOrder[num];

        //createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        for(int i=0;i<num;i++) {
            System.out.println((i+1) +"번째 주문 정보를 입력하세요 : ");
            System.out.print("상품명 : ");
            String name = sc.next();
            System.out.print("가격 : ");
            int price = sc.nextInt();
            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();

        ProductOrder apple = createOrder(name, price, quantity);

            orders[i]=apple;
        }

        //printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);



        //getTotalAmount()를 사용해서 총 결제 금액 계산

        int total = getTotalAmount(orders);
        //총 결제 금액 출력
        System.out.println("Total amount: "+total);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int total = 0;
        for(ProductOrder order : orders){
            total += order.price * order.quantity;
        }
        return total;
    }


}


