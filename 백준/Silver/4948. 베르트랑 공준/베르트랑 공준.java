import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            int N = scanner.nextInt();
            if(N == 0) {
                break;
            }
            int max = (2 * N);

            boolean[] isPrime = new boolean[max + 1];

            for (int i = 2; i <= max; i++) {
                isPrime[i] = true;
            }
            for (int i = 2; i * i <= max; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= max; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
            int ans = 0;
            for (int i = N + 1; i <= max; i++) {
                if (isPrime[i]) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
