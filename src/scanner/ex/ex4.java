package scanner.ex;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
            int num = scanner.nextInt();
            if( num == -1 ){
                break;
            }
            sum += num;
            count += 1;

            scanner.nextLine();  // 버퍼 비우기
        }
        System.out.println("입력한 숫자의 합: " + sum);

        System.out.println("입력한 숫자의 평균: " + (double)sum/count);
    }
}
