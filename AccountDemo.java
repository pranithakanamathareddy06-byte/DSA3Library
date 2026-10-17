class Account{
    private double balance;
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
        else{
            System.out.println("deposit must be positive");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("invalid or insufficient balance");
        }
    }
    public double getbalance(){
        return balance;
    }
}
public class AccountDemo{
    public static void main(String[] args){
        Account a = new Account();
        a.deposit(1000);
        a.withdraw(500);
        System.out.println("balance = " + a.getbalance());

    }
}