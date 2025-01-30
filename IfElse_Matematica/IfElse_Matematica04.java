package org.JavaN.br;
import java.util.Scanner;

public class IfElse_Matematica04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                System.out.print("digite o primeiro número: ");
                int num1= scanner.nextInt();

                System.out.print("digite o segundo número: ");
                int num2= scanner.nextInt();

                System.out.print("digite o terceiro número: ");
                int num3= scanner.nextInt();

                if (num1 + num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2){

                    System.out.println ("Os valores formam um triângulo");
                } else {
                    System.out.println ("Os valores não formam um triângulo");
                }
                scanner.close();
            }
        }


