import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int count = 0;
        int min = 0;
        int max = N - 1;

        while(min < max) {
            if(arr[min] + arr[max] < M) {
                min++;
            } else if(arr[min] + arr[max] > M) {
                max--;
            } else {
                count++;
                min++;
                max--;
            }
        }
        System.out.println(count);
    }
}
