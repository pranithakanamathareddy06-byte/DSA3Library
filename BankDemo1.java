class BankAccount1{
    int accno;
    String holdername;
    double balance;
    BankAccount1(int accno,String holdername, double balance){
        this.accno = accno;
        this.holdername = holdername;
        this.balance = balance;
    }
    void displaydetails(){
        System.out.println("Accno: " + accno);
        System.out.println("Holdername: " + holdername);
        System.out.println("Balance: " + balance);
    }
}
public class BankDemo1{
    public static void main(String[] args){
        BankAccount1 acc1 = new BankAccount1(103,"mummy",5500.0);
        BankAccount1 acc2 = new BankAccount1(104,"daddy",6600.0);
        acc1.displaydetails();
        acc2.displaydetails();
    }
}