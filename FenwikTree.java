

public class FenwikTree {
    static int bit[] = new int[100];
    static int n;

    static void update(int i, int x) {
        while (i <= n) {
            bit[i] = bit[i] + x;
            i = i + (i & -i);
        }
    }

    static int sum(int i) {
        int s = 0;
        while (i > 0) {
            s = s + bit[i];
            i = i - (i & -i);
        }
        return s;
    }

    static int sumrange(int left, int right) {
        return sum(right) - sum(left - 1);
    }

    public static void main(String[] args) {
        int a[] = {11, 12, 13, 14, 15, 16};
        int i;
        n = a.length;
        
        for ( i = 0; i < n; i++) {
            update(i + 1, a[i]); 
        }

        System.out.println(sum(2));         
        System.out.println(sumrange(2, 3));  
    }
}