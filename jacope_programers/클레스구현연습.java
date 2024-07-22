import java.util.*;

public class 클레스구현연습 {
    public static void main(String[] args) {

        Account account = new Account("jsw", 20000);
        account.deposit(15000);
        account.withdraw(10000);


        System.out.print(account.getBalance());
    }

}

class Account {
    private String owner;
    private long balance;

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setOwner(String value) {
        owner = value;
    }

    public void setBalance(long value) {
        balance = value;
    }

    public Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public long deposit(long amount){
        balance += amount;
        return balance;
    }

    public long withdraw(long amount){
        balance -= amount;
        return balance;
    }
}
