import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());  // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            sc.nextLine();  // 테스트 케이스 사이 빈 줄 무시
            int N = Integer.parseInt(sc.nextLine());

            BigInteger sum = BigInteger.ZERO;
            for (int i = 0; i < N; i++) {
                BigInteger num = new BigInteger(sc.nextLine());
                sum = sum.add(num);
            }

            if (sum.mod(BigInteger.valueOf(N)).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}