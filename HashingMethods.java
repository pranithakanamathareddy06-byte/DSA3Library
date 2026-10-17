import java.util.HashMap;
import java.util.Hashtable;
public class HashingMethods{
    public static void main(String[] args){
        // int key = 123;
        // int m = 10;
        // int H = key % m;
        // System.out.println(H);


        // int key = 123456;
        // int m = 10;
        // int sum = 0;
        // while(key > 0){
        // int digit = key % 10;
        // sum = sum + digit;
        // key = key / 10;
        // }
        //  int hash = sum % m;
        // System.out.println("Folding hash value: " + hash);


        // int key = 124;
        // int m = 10;
        // int square = key * key;
        // String str = Integer.toString(square);
        // int length = str.length();
        // int mid = length / 2;
        // String middle = str.substring(mid - 1, mid + 1);
        // int middleNumber = Integer.parseInt(middle);
        // int hash = middleNumber % m;
        // System.out.println("Square: " + square);
        // System.out.println("Middle digits: " + middleNumber);
        // System.out.println("Hash value: " + hash);


        int key = 123;
        int m = 10;
        double A = 0.618033;   // constant value
        double temp = key * A;
        double fractional = temp - Math.floor(temp);
        int hash = (int)(m * fractional);
        System.out.println("Hash value: " + hash);



    }
}