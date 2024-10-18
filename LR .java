import java.util.Scanner;

public class LR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter a number N: ");
        int N = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("The sum of the numbers from 1 to " + N + " = " + sum);
    }
}