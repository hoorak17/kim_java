package array;

import java.util.Scanner;

public class pro9 {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        String[] productNames = new String[10];//상품이름을 저장할 Str배열
        int[] productPrices = new int[10];//상품 가격을 저장할 int 배열
        int productCount = 0;//현재 등록된 상품의 개수를 저장할 int변수

        while(true) {
            //기능선택
            System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:            //1.상품등록
                    if(productCount >= 10) {
                        System.out.println("더이상 상품 등록이 불가합니다.");
                        break;
                    }

                    System.out.print("상품 이름을 입력하세요 : ");
                    productNames[productCount] = scanner.next();

                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[productCount] = scanner.nextInt();
                    productCount++;

                    break;
                case 2:            //2.상품목록
                    for(int i = 0; i < productCount; i++){
                        System.out.println(productNames[i]+ " : " + productPrices[i]);
                    }
                    break;
                case 3:            //3.종료
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }


    }
}
