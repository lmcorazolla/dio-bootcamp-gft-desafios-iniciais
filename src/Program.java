import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        System.out.print("Primeira nota: ");
        A = Double.parseDouble(sc.next());
        System.out.print("Segunda nota: ");
        B = Double.parseDouble(sc.next());

        media = (A * 3.5 + B * 7.5)/11;

        System.out.printf("Sua média é: " +String.format("%.5f", media));
        System.out.println();

    }

}
