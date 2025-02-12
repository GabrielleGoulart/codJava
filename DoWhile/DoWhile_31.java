package While;
import java.util.Scanner;

public class DoWhile_31 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int num;

            do {
                System.out.print("Digite um número: ");
                num = sc.nextInt();
            } while (num >= 0); // Enquanto o número for positivo ou zero, continuara pedindo

            System.out.println("Você digitou um número negativo. Fim do programa.");

            sc.close();
        }
    }


