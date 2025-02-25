package LIstas_Matrizes_ForEach;

import java.util.Random;

public class Matriz18 {
    public static void main(String[] args) {

                Random random = new Random();

                int[][] matriz = new int[4][4];

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        matriz[i][j] = random.nextInt(101);
                    }
                }

                int soma = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        soma += matriz[i][j];
                    }
                }

                double media = soma / 16.0;

                System.out.println("Matriz 4x4 gerada aleatoriamente:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("\nA média de todos os elementos da matriz é: " + media);
            }
        }

