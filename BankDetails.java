public class BankDetails{

    int accountnumber;
    String holdername;
    double balance;
    BankDetails(int accno,String name,double bal){
        accountnumber = accno;
        holdername = name;
        balance = bal;
    }
    void displaydetails(){
        System.out.println("accountnumber: " + accountnumber);
         System.out.println("holdername: " + holdername);
          System.out.println("balance: " + balance);
    }
    public static void main(String[] args){
        BankDetails acc1 = new BankDetails(101,"pranitha",100000000);
         BankDetails acc2 = new BankDetails(102,"amma",1000000);
         acc1.displaydetails();
         acc2.displaydetails();

    }
}