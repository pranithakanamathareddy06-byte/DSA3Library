class BankAccount{
    int Accno;
    String holdername;
    double balance;
    void display(int n,String name,double remaining){
        Accno = n;
        holdername = "name";
        balance = remaining;
    }
}
public class BankDemo{
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount();
        acc1.display(101,"pranitha",50000000.08);
        System.out.println("accno: " + acc1.Accno);
        System.out.println("holdername: " + acc1.holdername);
        System.out.println("balance: " + acc1.balance);

}

}