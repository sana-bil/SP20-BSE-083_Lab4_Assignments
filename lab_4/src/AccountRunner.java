public class AccountRunner {
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.Deposit(1));
        int m1 = a.getBalance();
        Account a1 = new Account(m1);
        System.out.println(a1.withDraw(1));
    }
}
