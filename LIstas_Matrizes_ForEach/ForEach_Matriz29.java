package LIstas_Matrizes_ForEach;

public class ForEach_Matriz29 {
    public static void main(String[] args) {
                int[][] matriz = {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                };

                int[] somaColunas = new int[4];
                for (int i = 0; i < matriz[0].length; i++) {
                    for (int[] linha : matriz) {
                        somaColunas[i] += linha[i];
                    }
                }

                for (int i = 0; i < somaColunas.length; i++) {
                    System.out.println("Soma da coluna " + (i + 1) + ": " + somaColunas[i]);
                }
            }
        }

