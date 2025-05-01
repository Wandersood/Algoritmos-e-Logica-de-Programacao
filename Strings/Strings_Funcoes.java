import java.util.Scanner;

public class Strings_Funcoes {

    public static boolean validaBases(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'A' && c != 'T' && c != 'C' && c != 'G') {
                return false;
            }
        }
        return true;
    }

    public static String recombinacao(String A, String B) {
        int meio = A.length() / 2;
        String resultado = "";

        for (int i = 0; i < meio; i++) resultado += A.charAt(i);
        for (int i = meio; i < B.length(); i++) resultado += B.charAt(i);

        return resultado;
    }

    public static String mutacao(String S) {
        int pos = (int) (Math.random() * S.length());
        char baseAtual = S.charAt(pos);
        char novaBase = baseAtual;

        while (novaBase == baseAtual) {
            int r = (int) (Math.random() * 4);
            if (r == 0) novaBase = 'A';
            else if (r == 1) novaBase = 'T';
            else if (r == 2) novaBase = 'C';
            else novaBase = 'G';
        }

        String resultado = "";
        for (int i = 0; i < S.length(); i++) {
            if (i == pos) resultado += novaBase;
            else resultado += S.charAt(i);
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a string S1 (apenas A, T, C, G): ");
        String S1 = input.nextLine().toUpperCase();

        System.out.print("Digite a string S2 (apenas A, T, C, G): ");
        String S2 = input.nextLine().toUpperCase();

        if (S1.length() != S2.length()) {
            System.out.println("Erro: As strings devem ter o mesmo tamanho.");
            return;
        }

        if (!validaBases(S1) || !validaBases(S2)) {
            System.out.println("Erro: As strings devem conter apenas A, T, C ou G.");
            return;
        }

        String F1 = recombinacao(S1, S2);
        String F2 = recombinacao(S2, S1);
        String S1_mutado = mutacao(S1);

        int sorteio = (int) (Math.random() * 2);

        String F1_mutado = F1;
        String F2_mutado = F2;

        if (sorteio == 0) F1_mutado = mutacao(F1);
        else F2_mutado = mutacao(F2);

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
