package For_;

import java.util.Scanner;

public class For_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        int soma = somaDosDigitos(Math.abs(num));
        System.out.println("A soma dos digitos de " + num + "é: " + soma);
        sc.close();
    }

    public static int somaDosDigitos(int num) {
        int soma = 0;
        while (num > 0) {
            soma += num % 10;
            num /= 10;
        }
        return soma;
        }
    }
