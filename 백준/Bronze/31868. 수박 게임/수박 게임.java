import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for(int i = 1; i < N; i++) {
            K /= 2;
        }
        System.out.println(K);

    }
}
