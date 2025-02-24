package LIstas_Matrizes_ForEach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista07 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ArrayList<Integer> numeros = new ArrayList<>();

            System.out.println("Digite 8 números:");

            for (int i = 0; i < 8; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = sc.nextInt();
                numeros.add(numero);
            }

            Collections.sort(numeros);

            System.out.println("Números ordenados em ordem crescente: " + numeros);

            // Fechar o scanner
            sc.close();
        }
    }


