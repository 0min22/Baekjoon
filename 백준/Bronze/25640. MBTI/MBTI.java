import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String jinho = scanner.next();
        int N = scanner.nextInt();

        String[] mbti = new String[N];
        int count = 0;

        for(int i = 0; i < N; i++) {
            mbti[i] = scanner.next();
            if(mbti[i].equals(jinho)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
