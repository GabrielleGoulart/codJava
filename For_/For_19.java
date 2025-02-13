package For_;
import java.util.Scanner;

public class For_19 {
    public static int fatorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * fatorial(n - 1);
            }
        }

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);


            System.out.print("Digite um número para calcular o fatorial: ");
            int numero = sc.nextInt();

            int resultado = fatorial(numero);
            System.out.println("O fatorial de " + numero + " é " + resultado);


            sc.close();
        }
    }


