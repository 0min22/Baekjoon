import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        
        int N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
            int target = scanner.nextInt();
            if(Arrays.binarySearch(arr, target) >= 0) {
                System.out.print(1 +" ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}
