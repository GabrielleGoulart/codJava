package If_else;

import java.util.Scanner;

public class IfElse_Basico_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para verificar se ele esta entre 10 a 50: ");

        int numero = sc.nextInt();

        if(numero >= 10 && numero <= 50){
            System.out.println("o numero está entre 10 a 50");
        }else{
            System.out.println("o numero NÃO está entre 10 a 50");
        }
        sc.close();
    }
}
