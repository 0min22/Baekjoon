import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];

        for(int i = 0; i < 6; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print((arr[0] - 1) * (-1) + " ");
        System.out.print((arr[1] - 1) * (-1) + " ");
        System.out.print((arr[2] - 2) * (-1) + " ");
        System.out.print((arr[3] - 2) * (-1) + " ");
        System.out.print((arr[4] - 2) * (-1) + " ");
        System.out.print((arr[5] - 8) * (-1));

    }
}
