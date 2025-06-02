import java.util.Scanner;

public class ex04 {

        // Ler as 5 pistas do Jogador 1 com validação
        public static void lerPistas(String[] pistas, Scanner scanner) {
            System.out.println("Jogador 1 - Digite as 5 pistas sobre o filme.");
            for (int i = 0; i < pistas.length; i++) {
                String entrada;
                do {
                    System.out.print("Pista " + (i + 1) + ": ");
                    entrada = scanner.nextLine().trim();
                    if (entrada.isEmpty()) {
                        System.out.println("⚠ A pista não pode estar vazia. Tente novamente.");
                    }
                } while (entrada.isEmpty());
                pistas[i] = entrada;
            }
        }

        //Mostra as pistas progressivamente
        public static void mostrarPistas(String[] pistas, int quantidade) {
            System.out.println("\nPistas:");
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Pista " + (i + 1) + ": " + pistas[i]);
            }
        }

        public static int comparaFilme(String palpite, String filmeCorreto) {
            return palpite.equalsIgnoreCase(filmeCorreto) ? 1 : 0;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] pistas = new String[5];
            String filme;

            do {
                System.out.print("Jogador 1 - Digite o nome do filme: ");
                filme = scanner.nextLine().trim();
                if (filme.isEmpty()) {
                    System.out.println("O nome do filme não pode estar em branco. Tente novamente.");
                }
            } while (filme.isEmpty());


            lerPistas(pistas, scanner);

            // Limpa a tela para o jogador 2
            for (int i = 0; i < 50; i++) System.out.println();

            System.out.println("Jogador 2 - Tente adivinhar o nome do filme!");

            int tentativas = 0;
            boolean acertou = false;

            while (tentativas < 5 && !acertou) {
                mostrarPistas(pistas, tentativas + 1);

                System.out.print("\nTentativa " + (tentativas + 1) + ": ");
                String palpite = scanner.nextLine();

                if (comparaFilme(palpite, filme) == 1) {
                    acertou = true;
                } else {
                    tentativas++;
                }
            }

            if (acertou) {
                int[] pontos = {100, 60, 40, 20, 10};
                System.out.println("\nParabéns! Você acertou o filme.");
                System.out.println("Pontuação: " + pontos[tentativas] + " pontos.");
            } else {
                System.out.println("\nVocê não acertou. O filme era: " + filme);
                System.out.println("Pontuação: 0 pontos.");
            }

            scanner.close();
        }
    }


