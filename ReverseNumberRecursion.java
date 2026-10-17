public class ReverseNumberRecursion{
    static int reverse(int n,int rev){
        if(n == 0)
        return rev;
        rev = (rev * 10) + (n % 10);
        return reverse(n / 10,rev);
    }
    public static void main(String[] args){
        int n = 1234;
        System.out.println("reverse of " + n + " is " + reverse(n,0));
    }
}