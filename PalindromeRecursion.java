public class PalindromeRecursion{
    static int reverse(int n,int rev){
        if(n == 0)
        return rev;
        rev = (rev * 10) + (n % 10);
        return reverse(n / 10,rev);
    }
    static boolean isPalindrome(int n){
        return n == reverse(n , 0);
    }
    public static void main(String[] args){
        int n = 1221;
        if(isPalindrome (n))
        System.out.println(n + "is a palindrome");
        else
        System.out.println(n + "is not a palindrome");
    }
}