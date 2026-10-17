import java.util.Scanner;
class ElectricityBillCalculatorHA2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = (100 * 5) + (units - 100) * 7;
        } else if (units <= 300) {
            bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
        } else {
            bill = (100 * 5) + (100 * 7) + (100 * 10) + (units - 300) * 15;
        }

        System.out.println("Total Electricity Bill =  " + bill);

        sc.close();
    }

}