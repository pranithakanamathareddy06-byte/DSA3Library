public class GCDRecursion{
        static int gcd(int a, int b){
            if(b == 0)
            return a;
            else
            return gcd(b, a % b);
        }
        public static void main(String[] args){
            int a = 48,b = 18;
            System.out.println("GCD of " + a + " and " + b + " is " + gcd(a,b));
        }
    }
// this GCD Also work as like the above only as like what ever comes at the last that only prints as the result