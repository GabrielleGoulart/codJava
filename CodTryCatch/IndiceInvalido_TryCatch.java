package com.atvI;
import java.util.Scanner;

public class IndiceInvalido_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50};

        try {
            System.out.print("Digite o índice do elemento que deseja acessar: ");
            int indice = sc.nextInt();

            int elemento = numeros[indice];
            System.out.println("O elemento no índice é: " + elemento);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erro: Índice fora dos limites do array.");
        }
        sc.close();
    }
}
