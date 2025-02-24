package LIstas_Matrizes_ForEach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista08 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ArrayList<String> nomes = new ArrayList<>();

            System.out.println("Digite 5 nomes:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Nome " + (i + 1) + ": ");
                String nome = sc.nextLine();
                nomes.add(nome);
            }

            Collections.sort(nomes);

            System.out.println("Nomes em ordem alfabética:");
            for (String nome : nomes) {
                System.out.println(nome);
            }

            // Fechar o scanner
            sc.close();
        }
    }



