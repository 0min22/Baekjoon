import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1; i <= N; i++) {
            if (i != 1) {
                System.out.println();
            }

            for(int j = i; j <= N; j++) {
                System.out.print("*");
            }
        }
    }
}
