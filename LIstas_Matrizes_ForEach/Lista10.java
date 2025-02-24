package LIstas_Matrizes_ForEach;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista10 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            ArrayList<Integer> lista1 = new ArrayList<>();
            ArrayList<Integer> lista2 = new ArrayList<>();

            System.out.println("Digite 5 números para a primeira lista:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                lista1.add(sc.nextInt());
            }


            System.out.println("Digite 5 números para a segunda lista:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                lista2.add(sc.nextInt());
            }

            ArrayList<Integer> lista3 = new ArrayList<>(lista1);
            lista3.addAll(lista2);

            // Exibir a lista resultante
            System.out.println("A junção das duas listas é: " + lista3);

            sc.close();
        }
    }


