package OOP;

import java.util.Scanner;

public class AccountMain {

    static void main() {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        System.out.println("신규 계좌 생성됨.");
        System.out.println("현재 잔액 : " + account.balance);

        while (true) {

            System.out.println("입금: 1, 출금: 2. 종료: 3 ");
            System.out.print("메뉴를 선택해 주십시오 : ");
            if (!sc.hasNextInt()) {
                if (!sc.hasNext()) {
                    break;
                }
                System.out.println("숫자를 입력해 주십시오.");
                sc.next();
                continue;
            }
            int menu = sc.nextInt();

            if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if (menu != 1 && menu != 2) {
                System.out.println("1, 2, 3 중에서 선택해 주십시오.");
                continue;
            }

            System.out.print(menu == 1
                    ? "입금할 금액을 입력해 주십시오 : "
                    : "출금할 금액을 입력해 주십시오 : ");
            if (!sc.hasNextInt()) {
                if (!sc.hasNext()) {
                    break;
                }
                System.out.println("정수 금액을 입력해 주십시오.");
                sc.next();
                continue;
            }
            int amount = sc.nextInt();
            if (menu == 1) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        }
    }
}
