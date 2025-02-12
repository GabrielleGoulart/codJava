package While;
import java.util.Scanner;

public class DoWhile_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int soma = 0;

        while(true) {System.out.print("Digite um número (digite 0 para sair): ");
            num = sc.nextInt();

            if (num == 0) {
                break;
            }
            soma += num; // Soma o número digitado
        }

        System.out.println("A soma dos números é: " + soma);
        sc.close(); // Fecha o scanner após o uso
    }

    }




