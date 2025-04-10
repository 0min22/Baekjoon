import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i < m; i++) { // 0o 1o 2o
            arr[i] = 1;
        }
        for (int i = m; i < arr.length; i++) { // 3x
            arr[i] = 2;
        }
        for(int i = 0; i < k; i++) { //0o 1o
            arr2[i] = 1;
        }
        for (int i = k; i < arr2.length; i++) { // 2o 3o
            arr2[i] = 2;
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == arr2[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
// ooox  xxoo
