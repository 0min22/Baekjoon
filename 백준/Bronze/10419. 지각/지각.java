import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int[] arr = new int[T];

        for(int i = 0; i < T; i++) {
            int test = 0;
            int d = scanner.nextInt();
            while(true) {
                if(Math.pow(test, 2) + test > d) {
                    if(test != 0) {
                        arr[i] = test-1;
                        break;
                    } else {
                        arr[i] =  test;
                        break;
                    }
                } else {
                    test++;
                }
            }
        }
        for(int i = 0; i < T; i++) {
            System.out.println(arr[i]);
        }
    }
}
