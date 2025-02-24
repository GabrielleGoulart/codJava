package Listas_Matrizes_ForEach;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

    public class ForEach23 {
        public static void main(String[] args) {
            List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o valor para multiplicar: ");
            int valor = sc.nextInt();

            // Usando "for-each" para multiplicar e exibir o resultado
            System.out.println("Resultado da multiplicação:");
            for (int numero : lista) {
                System.out.println(numero * valor);
            }

            sc.close();
        }
    }


