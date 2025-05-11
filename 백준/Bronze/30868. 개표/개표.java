import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        String five = "++++";
        String one = "|";

        for(int i = 0; i < T; i++) {
            int num = scanner.nextInt();
            int a = num / 5;
            int b = num % 5;
            if(a != 0) {
                for(int j = 1; j <= a; j++) {
                    System.out.print(five + " ");
                }
                for(int k = 1; k <= b; k++) {
                    System.out.print(one);
                }
            } else {
                for(int k = 1; k <= b; k++) {
                    System.out.print(one);
                }
            }
            System.out.println();
        }
    }
}
