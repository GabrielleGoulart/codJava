package While;

import java.util.Scanner;

public class DoWhile_39 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num;

do {
    System.out.println("Insira numeros: ");
    num = sc.nextInt();

} while (num > 0);
System.out.println("você digitou um numero negativo, fim do programa.");

    }
}
