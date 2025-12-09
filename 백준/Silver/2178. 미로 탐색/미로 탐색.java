import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.awt.Point;

public class Main {
    static int N, M;
    static int[][] map;
    static int[] dx = {0, 0, -1, 1};   // 상, 하, 좌, 우
    static int[] dy = {-1, 1, 0, 0};
    static boolean[][] isVisited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];

        // 한 줄씩 문자열로 읽어서 각 문자('0','1')를 int로 변환
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        sc.close();

        isVisited = new boolean[N][M];   // 기본값 false

        bfs(0, 0);                       // (0,0)에서 BFS 시작
        System.out.println(map[N - 1][M - 1]);   // 도착점까지의 칸 수 출력
    }

    static void bfs(int y, int x) {
        Queue<Point> que = new LinkedList<>();   // 좌표 저장용 큐
        que.offer(new Point(x, y));              // Enqueue
        isVisited[y][x] = true;                  // 방문 표시

        while (!que.isEmpty()) {                 // 큐가 빌 때까지
            Point node = que.poll();             // Dequeue

            // 상하좌우 인접 칸 탐색
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                // 배열 범위를 벗어나지 않는지 체크
                if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                    // 길(1)이고, 아직 방문하지 않은 칸이면
                    if (map[ny][nx] == 1 && !isVisited[ny][nx]) {
                        que.offer(new Point(nx, ny));      // Enqueue
                        isVisited[ny][nx] = true;          // 방문 표시
                        // 이전 칸까지 온 거리 + 1 저장
                        map[ny][nx] = map[node.y][node.x] + 1;
                    }
                }
            }
        }
    }
}
