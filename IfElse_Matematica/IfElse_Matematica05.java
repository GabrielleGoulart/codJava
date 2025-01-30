package org.JavaN.br;

import java.util.Scanner;

public class IfElse_Matematica05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          System.out.print("Digite um número: ");
           int num = scanner.nextInt();

          if (num < 0) {
            System.out.println("O número que inseriu é negativo, portanto não pode ser um quadrado perfeito");
                } else {
             int raiz = (int) Math.sqrt(num); // Calcula a raiz quadrada
               if (raiz * raiz == num) {
            System.out.println("O número inserido é um quadrado perfeito");
                 } else {
            System.out.println("O número inserido NÃO é um quadrado perfeito");
                    }
                }
                scanner.close();
            }
        }
