import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int a,b;
        
        for(int i = 1; i <= T; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            int r = 1;

            for(int j = 1; j <= b; j++) {
                r *= a;
                r %= 10;
            }
            if(r == 0) {
                r = 10;
            }
            list.add(r);
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
