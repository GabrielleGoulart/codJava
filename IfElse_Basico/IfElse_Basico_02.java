package If_else;

import java.util.Scanner;

public class IfElse_Basico_02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número: ");

            int numero = sc.nextInt();

            if(numero % 2 == 0) {
                System.out.println("o numero é par");
            }else{
                System.out.println("o numero é impar");
            }
            sc.close();
        }
    }
