import java.util.Scanner;

public class Bee_1115 {
    public static void main(String[] args) {
        int X, Y;

        Scanner sc = new Scanner(System.in);

        do {
            X = sc.nextInt();
            Y = sc.nextInt();

            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            } else if (X > 0 && Y < 0) {
                System.out.println("quarto");
            }

        } while (X != 0 && Y != 0);

        sc.close();
    }
}
