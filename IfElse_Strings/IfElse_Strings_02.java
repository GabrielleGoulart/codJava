package If_else;

import java.util.Scanner;

public class IfElse_Strings_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("inserir a senha: ");
        String senha = sc.next();

        if (senha.equals("1234")) {
            System.out.println("senha correta!");

        } else {
            System.out.println("senha incorreta");

        }

    }
}
