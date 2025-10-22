import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] d = new int[N + 1];
        int max = 1;
        d[max] = arr[0];

        for(int i = 1; i < N; i++) {
            if(d[max] < arr[i]) {
                d[++max] = arr[i];
            } else if(arr[i] < d[1]) {
                d[1] = arr[i];
            } else {
                int low = 1, high = max, mid;
                while(true) {
                    mid = (low + high) >> 1;
                    if(d[mid] < arr[i]) {
                        if (arr[i] < d[mid + 1]) {
                            d[mid + 1] = arr[i];
                            break;
                        }
                        low = mid + 1;
                    } else {
                        if(d[mid - 1] < arr[i]) {
                            d[mid] = arr[i];
                            break;
                        }
                        high = mid - 1;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
