package While;
import java.util.Scanner;

public class DoWhile_43 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

          System.out.print("Digite um número: ");
          int num = sc.nextInt();

           int soma = 0;


                do {
                    soma += num % 10;  // Pega o último dígito
                    num /= 10;         // Remove o último dígito
                } while (num > 0);     // O loop continua até que o número seja 0

                System.out.println("A soma dos dígitos é: " + soma);

                sc.close();
            }
        }
