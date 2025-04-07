import java.util.Scanner;

public class Bee_1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2;
        int continuar;

        do {
            int notasValidas = 0;
            double soma = 0.0;

            while (notasValidas < 2) {
                double nota = sc.nextDouble();

                if (nota >= 0.0 && nota <= 10.0) {
                    soma += nota;
                    notasValidas++;
                } else {
                    System.out.println("nota invalida");
                }
            }

            double media = soma / 2;
            System.out.printf("media = %.2f%n", media);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                continuar = sc.nextInt();
            } while (continuar != 1 && continuar != 2);

        } while (continuar == 1);

        sc.close();
    }
}
