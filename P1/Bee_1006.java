import java.util.Scanner;

public class Bee_1006 {
    public static void main(String[] args) {
        double A, B,C, media;

        Scanner in = new Scanner(System.in);

        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();

        media = (2*A + 3*B + 5*C)/10;

        in.close();

        System.out.printf("MEDIA = %.1f%n", media);
    }
}
