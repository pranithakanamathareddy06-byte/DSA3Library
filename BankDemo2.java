class BankAccount2{
    private String accountholder;
    private double balance;
    public BankAccount2(String name,double initialbalance){
        accountholder = name;
        if(initialbalance >= 0)
            balance = initialbalance;
        
        else
            balance = 0;
        
    }
    public double getbalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
        else{
            System.out.println("invalid deposit amount!");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("invalid or insufficient funds !");
        }
    }
    public void display(){
        System.out.println("account holder: " + accountholder);
        System.out.println("current balance: " +  balance);
    }
}
public class BankDemo2{
    public static void main(String[] args){
        BankAccount2 acc = new BankAccount2("anita",10000);
        acc.deposit(2000);
        acc.withdraw(500);
        acc.display();

    }
}