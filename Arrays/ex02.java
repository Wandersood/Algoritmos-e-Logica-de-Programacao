import java.util.Scanner;

public class ex02 {
    public static int[] valores_entre(int[] lista, int minimo, int maximo) {

        int contIntervalo = 0;

        // PARA CADA VALOR DA LISTA

        for (int valor : lista) {
            if (valor > minimo && valor < maximo) {

                // CONTA SE O VALOR ESTIVER ENTRE O MINIMO E O MAXIMO DIGITADO

                contIntervalo++;
            }
        }



        // CRIA ARRAY DO TAMANHO DA CONTAGEM DE NÚMEROS NO INTERVALO

        int[] resultado = new int[contIntervalo];

        int indice = 0;

        // PARA CADA VALOR DA LISTA

        for (int valor : lista) {
            if (valor > minimo && valor < maximo) {

                // SE ESTIVER ENTRE O VALOR MINIMO E MAXIMO

                // ADICIONA OS VALOR DA LISTA NA ARRAY RESULTADO

                resultado[indice] = valor;
                indice++; //ATUALIZA O INDICE DA ARRAY RESULTADO
            }
        }
        return resultado;
    }



    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] numeros = {9, 8, 2, 4, 5, 7, 10, 1, 3, 6};

        System.out.println("Array original:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i]);

            if (i < numeros.length - 1) {

                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.print("Digite o valor mínimo: ");

        int min = ler.nextInt();

        System.out.print("Digite o valor máximo: ");

        int max = ler.nextInt();

        int[] novaLista = valores_entre(numeros, min, max);

        System.out.println("\nValores entre " + min + " e " + max + ":");

        if (novaLista.length == 0) {

            System.out.println("Nenhum valor encontrado no intervalo especificado!");

        } else {

            for (int i = 0; i < novaLista.length; i++) {

                System.out.print(novaLista[i]);

                if (i < novaLista.length - 1) {

                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        ler.close();

    }
}
