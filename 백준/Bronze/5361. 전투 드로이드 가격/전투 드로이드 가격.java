import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for(int i = 1; i <= N; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int D = scanner.nextInt();
            int E = scanner.nextInt();

            double result = ((A * 350.34) + (B * 230.90) + (C * 190.55) + (D * 125.30) + (E * 180.90));

            System.out.printf("$" + "%.2f", result);
            System.out.println();


        }
    }
}
