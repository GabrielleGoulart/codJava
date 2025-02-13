package For_;
import java.util.Scanner;

public class For_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String texto = scanner.nextLine();

        String textoInvertido = new StringBuilder(texto).reverse().toString();

        System.out.println("Palavra invertida: " + textoInvertido);

        scanner.close();
            }
        }


