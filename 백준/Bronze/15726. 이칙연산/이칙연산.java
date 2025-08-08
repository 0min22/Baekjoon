import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();


        int sum1 = ((int)((A * B) / C));
        int sum2 = ((int)((A / B) * C));

        System.out.println(Math.max(sum1, sum2));


    }
}
