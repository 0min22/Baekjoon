import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String[] ch = new String[N];
        for(int i = 0; i < ch.length; i++) {
            ch[i] = scanner.nextLine();
        }
        for(int i = 0; i < ch.length; i++) {
            System.out.println((i+1) + ". " + ch[i]);
        }
    }
}
