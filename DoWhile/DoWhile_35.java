package While;
import java.util.Scanner;

public class DoWhile_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = sc.nextInt();

        int i = 1; // Inicializa a variável i

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10); // Condição para parar o laço (quando i chegar a 11)

                sc.close();
            }
        }
