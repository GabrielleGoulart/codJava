package LIstas_Matrizes_ForEach;

public class ForEach_Matriz28 {
    public static void main(String[] args) {
                int[][] matriz = {
                        {5, 2, 8},
                        {1, 9, 4},
                        {7, 3, 6}
                };

                int maior = Integer.MIN_VALUE;
                for (int[] linha : matriz) {
                    for (int elemento : linha) {
                        if (elemento > maior) {
                            maior = elemento;
                        }
                    }
                }
                System.out.println("O maior elemento da matriz é: " + maior);
            }
        }
