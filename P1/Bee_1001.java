import java.util.Scanner;

public class Bee_1001 {

    public static void main(String[] args) {
        int A, B, X;

        Scanner entrada = new Scanner(System.in);
        A = entrada.nextInt();
        B = entrada.nextInt();

        X = A + B;

        entrada.close();

        System.out.println("X = " + X);
    }

}
