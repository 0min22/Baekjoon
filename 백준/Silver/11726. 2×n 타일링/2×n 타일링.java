import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] dp = new int[1001];   // n ≤ 1000

        dp[1] = 1;
        if (n >= 2) {
            dp[2] = 2;
        }

        // dp[i] = dp[i-1] + dp[i-2] (mod 10007)
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        System.out.println(dp[n]);
        scanner.close();
    }
}
