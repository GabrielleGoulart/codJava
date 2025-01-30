package org.JavaN.br;
import java.util.Scanner;

public class IfElse_Financeiro05 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Qual o valor da compra? ");
            double compra= sc.nextDouble();

            double desconto = compra * 20 / 100;

            if (compra > 50) {
                System.out.println ("seu desconto foi de 20% do valor do produto "+ desconto);
            }else {
                System.out.println ("infelizmente o desconto é para produtos acima de 50 reais ");

                sc.close();
            }
        }
    }

