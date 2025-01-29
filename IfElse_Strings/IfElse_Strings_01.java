package If_else;

import java.util.Scanner;

public class IfElse_Strings_01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("sim ou não: ");
            String resposta = sc.next();

            if (resposta.equals("sim")) {
                System.out.println("A resposta foi: sim");

            } else if (resposta.equals("não")) {
                System.out.println("A resposta foi: não ");

            } else {
                System.out.println("Resposta invalida");

            }

        }
}
