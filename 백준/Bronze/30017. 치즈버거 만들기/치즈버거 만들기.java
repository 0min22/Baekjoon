import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        if(A <= B) { 
            System.out.println(2 * A - 1);
        } else if(A == B + 1){
            System.out.println(A + B);
        } else {
            System.out.println(B * 2 + 1);
        }
    }
}
