package IfElse_DesafiosJogos;
import java.util.Scanner;

public class IfElse_DesafiosJogos01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("ambos numeros são positivos");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("ambos numeros são negativos");
        } else{
            System.out.println("os numeros tem sinais diferentes");

            sc.close();
        }
    }
}

