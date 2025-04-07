import java.util.Scanner;

public class Bee_1038 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total = 0;

        switch (codigo) {
            case 1:
                total = 4.00 * quantidade;
                break;
            case 2:
                total = 4.50 * quantidade;
                break;
            case 3:
                total = 5.00 * quantidade;
                break;
            case 4:
                total = 2.00 * quantidade;
                break;
            case 5:
                total = 1.50 * quantidade;
                break;
        }

        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}
