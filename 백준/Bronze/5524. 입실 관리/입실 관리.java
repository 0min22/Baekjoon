import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] str = new String[N];

        for(int i = 0; i < N; i++) {
            str[i] = scanner.next();
            str[i] = str[i].toLowerCase();
        }
        for(int i = 0; i < N; i++) {
            System.out.println(str[i]);
        }
    }
}
