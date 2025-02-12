package While;
import java.util.Scanner;

public class DoWhile_44 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            int i = 1;

            System.out.println("Divisores de " + numero + ":");
            do {
                if (numero % i == 0) {
                    System.out.println(i);
                }
                i++;
            } while (i <= numero);

            sc.close();
        }
    }

