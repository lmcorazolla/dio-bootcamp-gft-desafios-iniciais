import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2, difX, difY;

        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while (true) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            difX = x2 - x1;
            difY = y2 - y1;


            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
            if (x1 == x2 && y1 == y2)
                System.out.println("0");
            else if (x1 == x2 || y1 == y2) //mesma linha ou coluna
                System.out.println("1");
            else if (difX == difY) //diagonal crescente
                System.out.println("1");
            else if ((y2<y1 || x2<x1) && (x2-y2)%2==0) //diagonal decrescente
                System.out.println("1");
            else
            System.out.println("2");

        }
    }
}