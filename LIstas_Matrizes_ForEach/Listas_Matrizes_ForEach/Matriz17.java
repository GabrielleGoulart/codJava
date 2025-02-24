package Listas_Matrizes_ForEach;

import java.util.Scanner;

public class Matriz17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o número escalar: ");
        int escalar = sc.nextInt();

        int[][] matrizResultado = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz[i][j] * escalar;
            }
        }

        System.out.println("\nMatriz resultante após multiplicação pelo escalar:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();


            sc.close();
        }
    }
}