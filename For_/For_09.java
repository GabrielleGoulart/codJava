package For_;
import java.util.Scanner;

public class For_09 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número para ver a tabuada: ");
            int numero = scanner.nextInt();

            System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 100; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}


