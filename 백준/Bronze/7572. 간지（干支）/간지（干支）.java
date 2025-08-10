import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] str = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int gan = N % 10 - 4;
        int zi = N % 12 - 4;

        if(gan < 0) {
            gan += 10;
        }
        if(zi < 0) {
            zi += 12;
        }
        int sum1 = arr[gan];
        String sum2 = str[zi];


        System.out.println(sum2 + sum1);
    }
}
