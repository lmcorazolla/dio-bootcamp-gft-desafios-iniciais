import java.io.IOException;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = 0;

        do {
            N = scan.nextInt();
        } while (N <= 0);

        int[] matriz = new int[N];

        for (int i = 1; i <= matriz.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
