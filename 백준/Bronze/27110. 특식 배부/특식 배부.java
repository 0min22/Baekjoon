import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[3];
        int sum = 0;

        for(int i = 0; i < 3; i++){
            arr[i] = scanner.nextInt();
            if (N >= arr[i]) {
                sum += arr[i];
            } else {
                sum += N;
            }
        }
        System.out.println(sum);

    }
}
