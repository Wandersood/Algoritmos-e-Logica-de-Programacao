import java.util.Scanner;

public class Strings_Condicionais {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String S1, S2, F1 = "", F2 = "", S1_mutado = "", F1_mutado = "", F2_mutado = "";
        int i;

        System.out.print("Digite a sua primeira combinação S1 (apenas A, T, C, G): ");
        S1 = input.nextLine().toUpperCase();
        System.out.print("Digite a sua segunda combinação S2 (apenas A, T, C, G): ");
        S2 = input.nextLine().toUpperCase();

        if (S1.length() != S2.length()) {
            System.out.println("As combinações devem ter o mesmo tamanho");
            return;
        }

        for (i = 0; i < S1.length(); i++) {
            char c1 = S1.charAt(i);
            char c2 = S2.charAt(i);
            if ((c1 != 'A' && c1 != 'C' && c1 != 'G' && c1 != 'T') ||
                    (c2 != 'A' && c2 != 'C' && c2 != 'G' && c2 != 'T')) {
                System.out.println("As combinações devem conter apenas os caracteres A, C, G e T");
                return;
            }
        }

        int meio = S1.length() / 2;

        // Exercício 1: Recombinação
        for (i = 0; i < meio; i++) F1 += S1.charAt(i);
        for (i = meio; i < S2.length(); i++) F1 += S2.charAt(i);

        for (i = 0; i < meio; i++) F2 += S2.charAt(i);
        for (i = meio; i < S1.length(); i++) F2 += S1.charAt(i);

        // Exercício 2: Mutação diretamente em S1
        int posMut = (int) (Math.random() * S1.length());
        char baseAtual = S1.charAt(posMut);
        char novaBase = baseAtual;

        while (novaBase == baseAtual) {
            int r = (int) (Math.random() * 4);
            if (r == 0) novaBase = 'A';
            else if (r == 1) novaBase = 'T';
            else if (r == 2) novaBase = 'C';
            else novaBase = 'G';
        }

        for (i = 0; i < S1.length(); i++) {
            if (i == posMut) S1_mutado += novaBase;
            else S1_mutado += S1.charAt(i);
        }

        // Exercício 3: Mutação aleatória em F1 ou F2
        int sorteio = (int) (Math.random() * 2);
        int pos = (int) (Math.random() * S1.length());
        

        if (sorteio == 0) {
            baseAtual = F1.charAt(pos);
            novaBase = baseAtual;
            while (novaBase == baseAtual) {
                int r = (int) (Math.random() * 4);
                if (r == 0) novaBase = 'A';
                else if (r == 1) novaBase = 'T';
                else if (r == 2) novaBase = 'C';
                else novaBase = 'G';
            }
            for (i = 0; i < F1.length(); i++) {
                if (i == pos) F1_mutado += novaBase;
                else F1_mutado += F1.charAt(i);
            }
            F2_mutado = F2;
        } else {
            baseAtual = F2.charAt(pos);
            novaBase = baseAtual;
            while (novaBase == baseAtual) {
                int r = (int) (Math.random() * 4);
                if (r == 0) novaBase = 'A';
                else if (r == 1) novaBase = 'T';
                else if (r == 2) novaBase = 'C';
                else novaBase = 'G';
            }
            for (i = 0; i < F2.length(); i++) {
                if (i == pos) F2_mutado += novaBase;
                else F2_mutado += F2.charAt(i);
            }
            F1_mutado = F1;
        }

        System.out.println("\nExercicio 01: Recombinação:");
        System.out.println("S1: " + S1);
        System.out.println("S2: " + S2);
        System.out.println("F1: " + F1);
        System.out.println("F2: " + F2);

        System.out.println("\nExercicio 02: Mutação de S1:");
        System.out.println("S1 original: " + S1);
        System.out.println("S1 mutado:   " + S1_mutado);

        System.out.println("\nExercicio 03: Recombinacao + Mutação em um dos filhos:");
        System.out.println("\nFilho escolhido para mutação: F" + (sorteio == 0 ? "1" : "2"));
        System.out.println("\nS1: " + S1);
        System.out.println("S2: " + S2);
        System.out.println("F1: " + F1_mutado);
        System.out.println("F2: " + F2_mutado);
    }
}
