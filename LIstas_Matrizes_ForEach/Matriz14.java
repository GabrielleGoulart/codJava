package LIstas_Matrizes_ForEach;

import java.util.Scanner;

public class Matriz14 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] matriz = new int[3][3];
            int maiorElemento = Integer.MIN_VALUE;

            System.out.println("Digite os 9 números para preencher a matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();

                    if (matriz[i][j] > maiorElemento) {
                        maiorElemento = matriz[i][j];
                    }
                }
            }

            System.out.println("O maior elemento da matriz é: " + maiorElemento);

            sc.close();
        }
    }


