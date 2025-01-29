package If_else;

import java.util.Scanner;

public class IfElse_Strings_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("escreva a palavra: ");
        String palavra= sc.next();

        if (palavra.length() > 5) {
            System.out.println("A palavra tem mais de 5 caracteres.");
        } else {
            System.out.println("A palavra tem 5 caracteres ou menos.");
        }
    }
}

