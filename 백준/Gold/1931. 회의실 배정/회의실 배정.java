import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();          // 회의 개수
        int[][] arr = new int[N][2];        // arr[i][0] = 시작시간, arr[i][1] = 끝나는 시간

        for (int i = 0; i < N; i++) {
            arr[i][0] = scanner.nextInt();  // 시작 시간
            arr[i][1] = scanner.nextInt();  // 끝나는 시간
        }

        // 1) 끝나는 시간이 빠른 순서대로
        // 2) 끝나는 시간이 같으면 시작 시간이 빠른 순서대로 정렬
        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int count = 0;      // 사용 가능한 회의 개수
        int endTime = 0;    // 마지막으로 선택한 회의의 끝나는 시간

        // 정렬된 회의들을 순서대로 보면서 겹치지 않는 것만 선택
        for (int i = 0; i < N; i++) {
            if (arr[i][0] >= endTime) {    // 이전 회의가 끝난 뒤 또는 딱 끝나는 시각부터 시작 가능
                count++;
                endTime = arr[i][1];       // 마지막으로 선택한 회의의 끝나는 시간 갱신
            }
        }

        System.out.println(count);
        scanner.close();
    }
}