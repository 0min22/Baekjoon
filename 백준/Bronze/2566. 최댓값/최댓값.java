import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                arr[i][j] = scanner.nextInt();
                if(arr[i][j] >= max) {
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);


    }
}
