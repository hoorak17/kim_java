package access;

public class BankAccountMain {

    static void main() {
        BankAccount account = new BankAccount();
        account.deposit(7000);
        account.getBalance();
    }
}
