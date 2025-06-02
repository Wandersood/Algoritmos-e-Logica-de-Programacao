import java.util.ArrayList;
import java.util.Scanner;

public class ex03_02 {
    public static int[] uniao(int[] v1, int[] v2) {
        int[] v3 = new int[v1.length + v2.length];

        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i];
        }

        for (int i = 0; i < v2.length; i++) {
            v3[v1.length + i] = v2[i];
        }

        return v3;
    }

    public static int[] lerVetor(Scanner scanner, String nomeVetor) {
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Digite os elementos do vetor " + nomeVetor + " (digite 'fim' para encerrar):");

        while (true) {
            System.out.print(nomeVetor + "[" + lista.size() + "] = ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                lista.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro ou 'fim' para encerrar.");
            }
        }

        // Converter lista para array
        int[] vetor = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            vetor[i] = lista.get(i);
        }

        return vetor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v1 = lerVetor(scanner, "v1");
        int[] v2 = lerVetor(scanner, "v2");

        int[] v3 = uniao(v1, v2);

        System.out.println("Array resultante (união de v1 e v2):");
        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " ");
        }

        scanner.close();
    }
}
