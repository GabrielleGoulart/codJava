package LIstas_Matrizes_ForEach;

import java.util.Scanner;

public class Matriz16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz identidade (número): ");
        int tamanho = sc.nextInt();

        int[][] matrizIdentidade = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j) {
                    matrizIdentidade[i][j] = 1; // Colocar 1 na diagonal principal
                } else {
                    matrizIdentidade[i][j] = 0; // Colocar 0 em outros elementos
                }
            }
        }


        System.out.println("Matriz Identidade de tamanho " + tamanho + ":");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matrizIdentidade[i][j] + "\t");
            }
            System.out.println();
        }


        sc.close();
    }
}
