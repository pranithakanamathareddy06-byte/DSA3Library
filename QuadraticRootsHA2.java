import java.util.Scanner;
class QuadraticRootsHA2{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cofficient of a: ");
        double a = sc.nextDouble();
        System.out.println("Enter cofficient of b: ");
        double b = sc.nextDouble();
        System.out.println("Enter cofficient of c: ");
        double c = sc.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if(discriminant > 0){
             double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex/imaginary:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
        sc.close();
    }
}

        
        




       
