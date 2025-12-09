import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();   // 동전 종류 개수
        int K = scanner.nextInt();   // 만들어야 할 금액

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();   // 각 동전의 가치 (오름차순으로 들어옴)
        }

        int count = 0;   // 필요한 동전 개수

        // 가장 큰 동전부터 K를 줄여 나가면서 그리디하게 사용
        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] <= K) {
                count += K / arr[i];  // i번째 동전을 최대 몇 개 사용할 수 있는지
                K %= arr[i];          // 남은 금액으로 갱신
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
