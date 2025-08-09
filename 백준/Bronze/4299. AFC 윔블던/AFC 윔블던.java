import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plus = scanner.nextInt();
        int minus = scanner.nextInt();
        
        if(plus < minus || ((plus + minus)) % 2 != 0) {
            System.out.println(-1);
            return;
        }

        int a = (plus + minus) / 2;
        int b = (plus - minus) / 2;


        if(a < 0 || b < 0) {
            System.out.println(-1);
            
        } else {
            System.out.println(a + " " + b);
        }



    }
}
// a + b = plus a-b = minus
