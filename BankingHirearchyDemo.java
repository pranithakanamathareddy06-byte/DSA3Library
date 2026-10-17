class Account{
    protected  String accNumber;
    protected String holderName;
    protected double balance;
    public Account(String accNumber, String holderName, double balance){
        this.accNumber = accNumber;
        this.holderName = holderName;
        this.balance = balance;

    }
    public void deposit(double amount){
        balance += amount;
            System.out.println("deposited: " + amount);
        }
        public void withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
                System.out.println("withdraw: " + amount);
            }
            else{
                System.out.println("Invalid to withdraw!");
            }
        }
        public void display(){
            System.out.println("Accountnumber: " + accNumber);
            System.out.println("Holdername: " + holderName);
            System.out.println("Balance: " + balance);

        }
    }
    class SavingsAccount extends Account{
        protected double minBalance = 500;
        public SavingsAccount(String accNumber,String holderName,double balance){
            super(accNumber,holderName,balance);
        }
        @Override
        public void withdraw(double amount){
            if(balance - amount >= minBalance){
                balance -= amount;
                System.out.println("withdrawn(saving): " + amount);
            }
            else{
                System.out.println("cannot withdrawn the minimum balance requirement violated.");
            }
        }
    }
    class InterestAccount extends SavingsAccount{
        private double interestRate;
        public InterestAccount(String accNumber, String holderName, double balance, double interestRate) {
      super(accNumber, holderName, balance);
       this.interestRate = interestRate;
}

        public void addYearlyInterest(){
            double interest = balance * interestRate / 100;
            balance += interest;
            System.out.println("Interest added: " + interest);
        }
    }
    public class BankingHirearchyDemo{
        public static void main(String[] args){
            InterestAccount acc = new InterestAccount("SB011","ravi",5000,5);
            System.out.println("--------BankingHirearchyDemo---------");
            acc.display();
            acc.deposit(2000);
            acc.withdraw(3000);
            acc.addYearlyInterest();
            System.out.println("\n Final account status: ");
            acc.display();
        }
    }