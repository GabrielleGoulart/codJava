package LIstas_Matrizes_ForEach;

import java.util.Scanner;
import java.util.ArrayList;

public class Lista01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ArrayList<Integer> numeros = new ArrayList<>();

            System.out.println("Digite 5 números:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = sc.nextInt();
                numeros.add(numero);
            }

            System.out.println("Números digitados:");
            for (int numero : numeros) {
                System.out.println(numero);
            }

            // Fechando o scanner
            sc.close();
        }
    }


