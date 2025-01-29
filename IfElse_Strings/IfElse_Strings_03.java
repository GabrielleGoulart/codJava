package If_else;

import java.util.Scanner;

public class IfElse_Strings_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("escreva o nome: ");
        String nome = sc.next();

        if (nome.substring(0, 1).equalsIgnoreCase("A")){
            System.out.println("O nome começa com letra A");

        } else {
            System.out.println("O nome não começa com letra A");

        }

    }
}

