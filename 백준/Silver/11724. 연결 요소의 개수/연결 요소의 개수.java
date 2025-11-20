import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] isVisited;

    public static void main(String[] args){
        // === 입력 ===
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        graph = new ArrayList[N + 1];
        for(int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < M; i++){
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            graph[n1].add(n2);
            graph[n2].add(n1);
        }
        for(int i = 1; i < N + 1; i++) {
            Collections.sort(graph[i]);
        }

        isVisited = new boolean[N + 1];
        int count = 0;

        for(int i = 1; i < N + 1; i++ ) {
            if(!isVisited[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void dfs(int idx){
        if(isVisited[idx]) {
            return;
        }
        isVisited[idx] = true;
        for(int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);
            if(!isVisited[next]) {
                dfs(next); // 아직 방문하지 않은 노드가 있을 경우 깊이우선탐색
            }
        }
    }
}
