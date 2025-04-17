import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int day = 0;
        if(A%C != 0 && B%D != 0) {
            day = L -Math.max((A / C) + 1, (B / D) + 1);
            System.out.println(day);
        } else {
            if((A/C) > (B/D) && A%C == 0) {
                day = L - (A / C);
                System.out.println(day);
            } else {
                day = L - (B / D);
                System.out.println(day);
            }
        }

    }
}