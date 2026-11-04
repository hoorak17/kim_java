package OOP;

public class Account {
    int balance = 0;

    void deposit(int amount){
        if (amount <= 0) {
            System.out.println("금액은 0보다 커야 합니다.");
            return;
        }
        balance = balance + amount;
        System.out.println("현재 잔액 : " + balance);
    }

    void withdraw(int amount){
        if (amount <= 0) {
            System.out.println("금액은 0보다 커야 합니다.");
            return;
        }
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
        }else{
            balance = balance - amount;
            System.out.println("현재 잔액 : " + balance);
        }


    }


}
