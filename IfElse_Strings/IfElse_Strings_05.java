package If_else;

import java.util.Scanner;

public class IfElse_Strings_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("escreva a primeira palavra: ");
        String palavra1 = sc.next();

        System.out.print("escreva a segunda palavra: ");
        String palavra2 = sc.next();

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais (ignorando maiúsculas e minúsculas).");
        } else {
            System.out.println("As palavras são diferentes.");
        }
    }
}