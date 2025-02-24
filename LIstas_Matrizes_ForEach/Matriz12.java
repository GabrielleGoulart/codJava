package LIstas_Matrizes_ForEach;
import java.util.Scanner;

public class Matriz12 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int[][] matriz = new int[3][3];
                int soma = 0;

                System.out.println("Digite os 9 números para preencher a matriz 3x3:");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = sc.nextInt();
                        soma += matriz[i][j];
                    }
                }

                System.out.println("A soma de todos os elementos da matriz é: " + soma);

                sc.close();
            }
        }

