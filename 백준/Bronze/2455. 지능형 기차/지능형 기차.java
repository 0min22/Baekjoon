import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][2];
        int sum = 0;
        int max = 0;

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < 4; i++) {
            sum += arr[i][1] - arr[i][0];
            if(max <= sum) {
                max = sum;
            }
        }
        System.out.println(max);

    }
}
