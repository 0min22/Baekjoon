import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();   // 수업 개수

        int[] start = new int[N];    // 시작 시간들
        int[] end = new int[N];      // 끝나는 시간들

        for (int i = 0; i < N; i++) {
            start[i] = scanner.nextInt();
            end[i] = scanner.nextInt();
        }

        // 시작 시간, 끝나는 시간 각각 정렬
        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0;           // start 배열 포인터
        int j = 0;           // end 배열 포인터
        int now = 0;         // 현재 진행 중인 수업 개수 (필요한 강의실 수)
        int answer = 0;      // 필요한 강의실의 최댓값

        // 모든 시작/끝 이벤트를 시간 순서대로 처리
        while (i < N && j < N) {
            // 새로운 수업 시작 시간이 가장 빠른 종료 시간보다 "빠를 때"는
            // 강의실을 하나 더 써야 함
            if (start[i] < end[j]) {
                now++;                  // 수업 하나 시작
                answer = Math.max(answer, now);
                i++;
            } else {
                // end[j]가 start[i]보다 작거나 같은 경우
                // (끝나자마자 바로 다음 수업 시작 가능)
                now--;                  // 수업 하나 종료 → 강의실 하나 비움
                j++;
            }
        }

        System.out.println(answer);
        scanner.close();
    }
}
