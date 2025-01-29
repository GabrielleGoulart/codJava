package If_else;

import java.util.Scanner;

public class IfElse_Basico_07 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número para verificar se ele é multiplo de 5: ");

            int numero = sc.nextInt();

            if(numero % 5 == 0) {
                System.out.println("o numero é multiplo de 5");
            }else{
                System.out.println("o numero NÃO é multiplo de 5");
            }
            sc.close();
        }
    }
