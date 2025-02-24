package LIstas_Matrizes_ForEach;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ArrayList<Integer> numeros = new ArrayList<>();

            System.out.println("Digite 5 números:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = sc.nextInt();
                numeros.add(numero);
            }

            int soma = 0;
            for (int numero : numeros) {
                soma += numero;
            }

            System.out.println("A soma dos números digitados é: " + soma);

            sc.close();
        }
    }



