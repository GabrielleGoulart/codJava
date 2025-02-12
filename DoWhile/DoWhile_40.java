package While;

import java.util.Scanner;

public class DoWhile_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int contador = 1;

        do {
            System.out.println("insira numeros: ");
            num = sc.nextInt();

        } while (num != 0);
        contador ++;
        System.out.print("quantidade de numeros inseridos diferentes de 0: " + contador);

        sc.close();
    }
}
