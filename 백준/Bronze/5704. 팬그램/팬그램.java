import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String pangram = scanner.nextLine();
            if(pangram.equals("*")) {
                break;
            } 
            
            boolean[] data = new boolean[26];
            for(int i = 0; i < pangram.length(); i++) {
                if(pangram.charAt(i) == ' ') {
                    continue;
                } else {
                    data[pangram.charAt(i) - 'a'] = true;
                }
            }
            String result = "Y";
            
            for(boolean i : data) {
                if(i == false) {
                    result = "N";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
