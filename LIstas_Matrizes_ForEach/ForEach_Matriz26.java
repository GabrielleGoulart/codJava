package LIstas_Matrizes_ForEach;

public class ForEach_Matriz26 {
    public static void main(String[] args) {
                int[][] matriz = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

                for (int[] linha : matriz) {
                    for (int elemento : linha) {
                        System.out.print(elemento + " ");
                    }
                    System.out.println();
                }
            }
        }

