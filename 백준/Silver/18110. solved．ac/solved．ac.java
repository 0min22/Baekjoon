import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        if (n == 0) {
            System.out.println(0);
            return;
        }

            int[] arr = new int[n];
            int sum = 0;
            double num = Math.round(n * 0.15);

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int cut = (int) Math.round(n * 0.15);

            for (int i = cut; i < arr.length - cut; i++) {
                sum += arr[i];
            }
            int count = n - (cut * 2);
            int avg = (int) Math.round((double) sum / count);

            System.out.println(avg);
        

    }
}
