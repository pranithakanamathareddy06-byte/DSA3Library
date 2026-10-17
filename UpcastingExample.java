class Bank{
    double getInterest(){
        return 5.0;
    }
}
class SBI extends Bank{
    double getInterest(){
        return 6.5;
    }
}
class HDFC extends Bank{
    double getInterest(){
        return 7.0;
    }
}
public class UpcastingExample{
    public static void main(String[] args){
        Bank b;
        b = new SBI();
        System.out.println(b.getInterest());
        b = new HDFC();
        System.out.println(b.getInterest());
    }
}