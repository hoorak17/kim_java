package access;

public class BankAccount {

    private int balance;

    public BankAccount(){
        this.balance = 0;
    }


    public void deposit(int amount) {

        if (isAmountValid(amount)) {
            this.balance += amount;
        }else {
            System.out.println("입금액은 0보다 커야합니다.");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount)) {
            if (this.balance >= amount) {
                this.balance -= amount;
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        } else {
            System.out.println("출금액은 0보다 커야합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount){
        return amount > 0;
    }



}
