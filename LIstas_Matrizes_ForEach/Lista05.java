package LIstas_Matrizes_ForEach;

import java.util.Scanner;
import java.util.Arrays;

public class Lista05 {
        public static void main(String[] args) {
            int[] numeros = {1, 2, 5, 9, 10, 11, 13, 55};

            Scanner sc = new Scanner(System.in);


            System.out.print("Digite um número para verificar: ");
            int numeroInformado = sc.nextInt();

            if (isNumeroPresente(numeros, numeroInformado)) {
                System.out.println("O número " + numeroInformado + " está presente na lista.");
            } else {
                System.out.println("O número " + numeroInformado + " não está presente na lista.");
            }

            sc.close();
        }

        // Método para verificar se o número está na lista
        public static boolean isNumeroPresente(int[] lista, int numero) {
            Arrays.sort(lista); // Ordena a lista para uso do binarySearch
            return Arrays.binarySearch(lista, numero) >= 0; // Retorna true se o número estiver na lista
        }
    }


