import java.util.Scanner;

public class Fibona{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms in Fibonacci sequence: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Sequence up to " + n + " terms:");

        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
