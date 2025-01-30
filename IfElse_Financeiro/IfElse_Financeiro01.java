package org.JavaN.br;
import java.util.Scanner;

public class IfElse_Financeiro01     {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Qual o saldo da conta? ");
            double saldo= sc.nextDouble();

            System.out.print("Qual o valor do saque? ");
            double saque= sc.nextDouble();

            if (saldo < saque) {
                System.out.println ("seu saldo não é suficiente para um saque ");
            }else {
                System.out.println ("saque realizado! ");

                sc.close();
            }
        }
    }

