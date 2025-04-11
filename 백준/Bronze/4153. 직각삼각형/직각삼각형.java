import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int[] arr = new int[3];

            for(int i = 0; i < 3; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            if (arr[2] == 0) {
                break;
            } else {
                if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
