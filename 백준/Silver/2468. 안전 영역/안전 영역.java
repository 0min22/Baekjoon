import java.util.Scanner;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        map = new int[N][N];

        int max = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scanner.nextInt();
                if (map[i][j] > max) {
                    max = map[i][j];
                }
            }
        }

        int answer = 0;

        for(int h = 0; h <= max; h++) {
            visited = new boolean[N][N];
            int count = 0;

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(!visited[i][j] && map[i][j] > h) {
                        dfs(i, j, h);
                        count++;
                    }
                }
            }
            answer = Math.max(count, answer);
        }

        System.out.println(answer);
        scanner.close();
    }

    static void dfs(int x, int y, int h) {
        visited[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if(!visited[nx][ny] && map[nx][ny] > h) {
                    dfs(nx, ny, h);
                }
            }
        }
    }
}

