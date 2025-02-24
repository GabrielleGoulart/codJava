package LIstas_Matrizes_ForEach;

import java.util.Scanner;

public class Matriz15 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int[][] matriz = new int[3][3];
                int somaDiagonalSecundaria = 0;


                System.out.println("Digite os 9 números para preencher a matriz 3x3:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = sc.nextInt();
                    }
                }


                for (int i = 0; i < 3; i++) {
                    somaDiagonalSecundaria += matriz[i][2 - i];  // Elementos da diagonal secundária
                }

                // Exibir a soma da diagonal secundária
                System.out.println("A soma dos elementos da diagonal secundária é: " + somaDiagonalSecundaria);

                sc.close();
            }
        }


