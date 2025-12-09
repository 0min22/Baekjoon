import java.util.Scanner;

public class Main {

    static boolean[][] map;   // 연결 여부 저장 (인접 행렬)
    static boolean[] visited; // 방문 체크
    static int N;             // 컴퓨터 수
    static int count = 0;     // 1번에서 감염되는 컴퓨터 수 (1번 제외)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();        // 컴퓨터 수
        int M = scanner.nextInt();    // 연결(간선) 수

        map = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            map[a][b] = true;
            map[b][a] = true;         // 양방향
        }

        dfs(1);                       // 1번 컴퓨터에서 시작

        System.out.println(count);
        scanner.close();
    }

    static void dfs(int v) {
        visited[v] = true;

        for (int i = 1; i <= N; i++) {
            // v와 i가 연결돼 있고, 아직 방문하지 않았다면 감염!
            if (map[v][i] && !visited[i]) {
                count++;        // 새로운 컴퓨터 하나 감염
                dfs(i);
            }
        }
    }
}
