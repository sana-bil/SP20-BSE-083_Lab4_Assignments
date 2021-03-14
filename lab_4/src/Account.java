public class Account {
    private int balance;

    public Account(){
        balance=33;
    }
    public Account(int b){
        balance=b;
    }
    public void setBalance(int m){
        balance=m;
    }
    public int getBalance(){
        return balance;
    }
    public int withDraw(int m){
        balance=balance-m;
        return balance;
    }
    public int Deposit(int m){
        balance=balance+m;
        return balance;
    }


}
