
import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cost = new int[n];

        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        for (int i = 0; i < n; i++) {
            for (int j = target; j >= cost[i]; j--) {
                if (dp[j - cost[i]]) {
                    dp[j] = true;
                }
            }
        }

        if (dp[target]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
