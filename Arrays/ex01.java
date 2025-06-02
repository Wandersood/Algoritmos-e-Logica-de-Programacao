import java.util.Scanner;

public class ex01 {
    public static int totalPares(int[] inteiros) {

        int par = 0;

        // PERCORRE O ARRAY

        for(int i = 0; i < inteiros.length; i++) {

            if(inteiros[i] % 2 == 0) {

                // CONTA SE FOR DIVISÍVEL POR 2

                par++;
            }
        }
        return par;
    }

    public static int maiorValor(int[] inteiros) {

        int maior = inteiros[0];

        // PERCORRE O ARRAY

        for(int i = 1; i < inteiros.length; i++) {

            // SE O VALOR DA POSIÇÃO DO ARRAY FOR MAIOR DO QUE O VALOR DA VARIÁVEL

            if(inteiros[i] > maior) {

                // VALOR DA POSIÇÃO SE TORNA O MAIOR

                maior = inteiros[i];

            }

        }

        return maior;

    }



    public static int totalIguais(int[] lista1, int[] lista2) {

        int iguais = 0;



        // PERCORRE O ARRAY1

        for(int i = 0; i < lista1.length; i++) {

            // PERCORRE O ARRAY2

            for(int j = 0; j < lista2.length; j++) {

                if(lista1[i] == lista2[j]) {

                    //CONTA SE OS VALORES DAS LISTAS FOREM IGUAIS

                    iguais++;

                    break;

                }

            }

        }

        return iguais;

    }


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // ARRAYS TESTE

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] array2 = {2, 4, 6, 8, 10, 12, 14};

        // TESTANDO FUNÇÕES

        System.out.println("Total de pares no array1: " + totalPares(array1));

        System.out.println("Maior valor no array1: " + maiorValor(array1));

        System.out.println("Total de números iguais as duas arrays: " + totalIguais(array1, array2));



        ler.close();

    }

}

