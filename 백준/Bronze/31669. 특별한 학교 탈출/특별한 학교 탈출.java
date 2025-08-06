import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        String[][] school = new String[N][M];

        for(int i = 0; i < N; i++) {
            String str = scanner.next();

            for(int j = 0; j < M; j++) {
                school[i][j] = String.valueOf(str.charAt(j));
            }
        }

        //check


        for(int j = 0; j < M; j++) {
            boolean check = true;
            for(int i = 0; i < N; i++) {
                if(school[i][j].equals("O")) {
                    check = false;
                    break;
                }
            }
            if(check) {
                System.out.println(j + 1);
                return;
            }
        }
        System.out.println("ESCAPE FAILED");
    }
}
/* if(school[M-1][j].|| school[j][i].equals("X")) {
                    System.out.println(i + 1);
                    return;
                } */